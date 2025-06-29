package com.parse;

import android.os.Parcel;
import android.os.Parcelable;
import com.parse.ParseObject;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ParseRelation<T extends ParseObject> implements Parcelable {
    public static final Parcelable.Creator<ParseRelation> CREATOR = new Parcelable.Creator<ParseRelation>() { // from class: com.parse.ParseRelation.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParseRelation createFromParcel(Parcel parcel) {
            return new ParseRelation(parcel, new ParseObjectParcelDecoder());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParseRelation[] newArray(int i) {
            return new ParseRelation[i];
        }
    };
    private String key;
    private final Set<ParseObject> knownObjects;
    private final Object mutex;
    private WeakReference<ParseObject> parent;
    private String parentClassName;
    private String parentObjectId;
    private String targetClass;

    public ParseRelation(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
        this.mutex = new Object();
        this.knownObjects = new HashSet();
        if (parcel.readByte() == 1) {
            this.key = parcel.readString();
        }
        if (parcel.readByte() == 1) {
            this.targetClass = parcel.readString();
        }
        if (parcel.readByte() == 1) {
            this.parentClassName = parcel.readString();
        }
        if (parcel.readByte() == 1) {
            this.parentObjectId = parcel.readString();
        }
        if (parcel.readByte() == 1) {
            this.parent = new WeakReference<>((ParseObject) parseParcelDecoder.decode(parcel));
        }
        int i = parcel.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            this.knownObjects.add((ParseObject) parseParcelDecoder.decode(parcel));
        }
    }

    public ParseRelation(String str) {
        this.mutex = new Object();
        this.knownObjects = new HashSet();
        this.parent = null;
        this.parentObjectId = null;
        this.parentClassName = null;
        this.key = null;
        this.targetClass = str;
    }

    public ParseRelation(JSONObject jSONObject, ParseDecoder parseDecoder) {
        this.mutex = new Object();
        this.knownObjects = new HashSet();
        this.parent = null;
        this.parentObjectId = null;
        this.parentClassName = null;
        this.key = null;
        this.targetClass = jSONObject.optString("className", null);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("objects");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                this.knownObjects.add((ParseObject) parseDecoder.decode(jSONArrayOptJSONArray.optJSONObject(i)));
            }
        }
    }

    public void addKnownObject(ParseObject parseObject) {
        synchronized (this.mutex) {
            this.knownObjects.add(parseObject);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public JSONObject encodeToJSON(ParseEncoder parseEncoder) {
        JSONObject jSONObject;
        synchronized (this.mutex) {
            jSONObject = new JSONObject();
            jSONObject.put("__type", "Relation");
            jSONObject.put("className", this.targetClass);
            JSONArray jSONArray = new JSONArray();
            Iterator<ParseObject> it = this.knownObjects.iterator();
            while (it.hasNext()) {
                try {
                    jSONArray.put(parseEncoder.encodeRelatedObject(it.next()));
                } catch (Exception unused) {
                }
            }
            jSONObject.put("objects", jSONArray);
        }
        return jSONObject;
    }

    public void ensureParentAndKey(ParseObject parseObject, String str) {
        synchronized (this.mutex) {
            try {
                if (this.parent == null) {
                    this.parent = new WeakReference<>(parseObject);
                    this.parentObjectId = parseObject.getObjectId();
                    this.parentClassName = parseObject.getClassName();
                }
                if (this.key == null) {
                    this.key = str;
                }
                if (this.parent.get() != parseObject) {
                    throw new IllegalStateException("Internal error. One ParseRelation retrieved from two different ParseObjects.");
                }
                if (!this.key.equals(str)) {
                    throw new IllegalStateException("Internal error. One ParseRelation retrieved from two different keys.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String getTargetClass() {
        String str;
        synchronized (this.mutex) {
            str = this.targetClass;
        }
        return str;
    }

    public void removeKnownObject(ParseObject parseObject) {
        synchronized (this.mutex) {
            this.knownObjects.remove(parseObject);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        writeToParcel(parcel, new ParseObjectParcelEncoder());
    }

    public void writeToParcel(Parcel parcel, ParseParcelEncoder parseParcelEncoder) {
        synchronized (this.mutex) {
            try {
                byte b = 0;
                parcel.writeByte(this.key != null ? (byte) 1 : (byte) 0);
                String str = this.key;
                if (str != null) {
                    parcel.writeString(str);
                }
                parcel.writeByte(this.targetClass != null ? (byte) 1 : (byte) 0);
                String str2 = this.targetClass;
                if (str2 != null) {
                    parcel.writeString(str2);
                }
                parcel.writeByte(this.parentClassName != null ? (byte) 1 : (byte) 0);
                String str3 = this.parentClassName;
                if (str3 != null) {
                    parcel.writeString(str3);
                }
                parcel.writeByte(this.parentObjectId != null ? (byte) 1 : (byte) 0);
                String str4 = this.parentObjectId;
                if (str4 != null) {
                    parcel.writeString(str4);
                }
                WeakReference<ParseObject> weakReference = this.parent;
                if (weakReference != null && weakReference.get() != null) {
                    b = 1;
                }
                parcel.writeByte(b);
                if (b != 0) {
                    parseParcelEncoder.encode(this.parent.get(), parcel);
                }
                parcel.writeInt(this.knownObjects.size());
                Iterator<ParseObject> it = this.knownObjects.iterator();
                while (it.hasNext()) {
                    parseParcelEncoder.encode(it.next(), parcel);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
