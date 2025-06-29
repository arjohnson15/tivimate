package com.parse;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class ParseDefaultACLController {
    ParseACL defaultACL;
    boolean defaultACLUsesCurrentUser;
    ParseACL defaultACLWithCurrentUser;
    WeakReference<ParseUser> lastCurrentUser;

    public ParseACL get() {
        ParseUser currentUser;
        if (!this.defaultACLUsesCurrentUser || this.defaultACL == null || (currentUser = ParseUser.getCurrentUser()) == null) {
            return this.defaultACL;
        }
        WeakReference<ParseUser> weakReference = this.lastCurrentUser;
        if ((weakReference != null ? weakReference.get() : null) != currentUser) {
            ParseACL parseACLCopy = this.defaultACL.copy();
            parseACLCopy.setShared(true);
            parseACLCopy.setReadAccess(currentUser, true);
            parseACLCopy.setWriteAccess(currentUser, true);
            this.defaultACLWithCurrentUser = parseACLCopy;
            this.lastCurrentUser = new WeakReference<>(currentUser);
        }
        return this.defaultACLWithCurrentUser;
    }
}
