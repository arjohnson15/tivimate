package com.parse;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
class ParseObjectSubclassingController {
    private final Object mutex = new Object();
    private final Map<String, Constructor<? extends ParseObject>> registeredSubclasses = new HashMap();

    private static Constructor<? extends ParseObject> getConstructor(Class<? extends ParseObject> cls) throws IllegalAccessException, NoSuchMethodException, SecurityException {
        Constructor<? extends ParseObject> declaredConstructor = cls.getDeclaredConstructor(null);
        if (declaredConstructor == null) {
            throw new NoSuchMethodException();
        }
        int modifiers = declaredConstructor.getModifiers();
        if (Modifier.isPublic(modifiers) || !(!cls.getPackage().getName().equals("com.parse") || Modifier.isProtected(modifiers) || Modifier.isPrivate(modifiers))) {
            return declaredConstructor;
        }
        throw new IllegalAccessException();
    }

    public String getClassName(Class<? extends ParseObject> cls) {
        ParseClassName parseClassName = (ParseClassName) cls.getAnnotation(ParseClassName.class);
        if (parseClassName != null) {
            return parseClassName.value();
        }
        throw new IllegalArgumentException("No ParseClassName annotation provided on " + cls);
    }

    public boolean isSubclassValid(String str, Class<? extends ParseObject> cls) {
        Constructor<? extends ParseObject> constructor;
        synchronized (this.mutex) {
            constructor = this.registeredSubclasses.get(str);
        }
        if (constructor == null) {
            if (cls != ParseObject.class) {
                return false;
            }
        } else if (constructor.getDeclaringClass() != cls) {
            return false;
        }
        return true;
    }

    public ParseObject newInstance(String str) {
        Constructor<? extends ParseObject> constructor;
        synchronized (this.mutex) {
            constructor = this.registeredSubclasses.get(str);
        }
        try {
            return constructor != null ? constructor.newInstance(null) : new ParseObject(str);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException("Failed to create instance of subclass.", e2);
        }
    }

    public void registerSubclass(Class<? extends ParseObject> cls) {
        if (!ParseObject.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Cannot register a type that is not a subclass of ParseObject");
        }
        String className = getClassName(cls);
        synchronized (this.mutex) {
            try {
                Constructor<? extends ParseObject> constructor = this.registeredSubclasses.get(className);
                if (constructor != null) {
                    Class<? extends ParseObject> declaringClass = constructor.getDeclaringClass();
                    if (cls.isAssignableFrom(declaringClass)) {
                        return;
                    }
                    if (!declaringClass.isAssignableFrom(cls)) {
                        throw new IllegalArgumentException("Tried to register both " + declaringClass.getName() + " and " + cls.getName() + " as the ParseObject subclass of " + className + ". Cannot determine the right class to use because neither inherits from the other.");
                    }
                }
                try {
                    this.registeredSubclasses.put(className, getConstructor(cls));
                    if (constructor != null) {
                        if (className.equals(getClassName(ParseUser.class))) {
                            ParseUser.getCurrentUserController().clearFromMemory();
                        } else if (className.equals(getClassName(ParseInstallation.class))) {
                            ParseInstallation.getCurrentInstallationController().clearFromMemory();
                        }
                    }
                } catch (IllegalAccessException unused) {
                    throw new IllegalArgumentException("Default constructor for " + cls + " is not accessible.");
                } catch (NoSuchMethodException unused2) {
                    throw new IllegalArgumentException("Cannot register a type that does not implement the default constructor!");
                }
            } finally {
            }
        }
    }
}
