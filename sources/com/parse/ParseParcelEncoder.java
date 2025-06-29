package com.parse;

import android.os.Parcel;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
class ParseParcelEncoder {
    private static final ParseParcelEncoder INSTANCE = new ParseParcelEncoder();

    public static ParseParcelEncoder get() {
        return INSTANCE;
    }

    private static boolean isValidType(Object obj) {
        return ParseEncoder.isValidType(obj);
    }

    public void encode(Object obj, Parcel parcel) {
        try {
            if (obj instanceof ParseObject) {
                encodeParseObject((ParseObject) obj, parcel);
                return;
            }
            if (obj instanceof Date) {
                parcel.writeString("Date");
                parcel.writeString(ParseDateFormat.getInstance().format((Date) obj));
                return;
            }
            if (obj instanceof byte[]) {
                parcel.writeString("Bytes");
                byte[] bArr = (byte[]) obj;
                parcel.writeInt(bArr.length);
                parcel.writeByteArray(bArr);
                return;
            }
            if (obj instanceof ParseFieldOperation) {
                parcel.writeString("Operation");
                ((ParseFieldOperation) obj).encode(parcel, this);
                return;
            }
            if (obj instanceof ParseFile) {
                parcel.writeString("File");
                ((ParseFile) obj).writeToParcel(parcel, this);
                return;
            }
            if (obj instanceof ParseGeoPoint) {
                parcel.writeString("GeoPoint");
                ((ParseGeoPoint) obj).writeToParcel(parcel, this);
                return;
            }
            if (obj instanceof ParsePolygon) {
                parcel.writeString("Polygon");
                ((ParsePolygon) obj).writeToParcel(parcel, this);
                return;
            }
            if (obj instanceof ParseACL) {
                parcel.writeString("Acl");
                ((ParseACL) obj).writeToParcel(parcel, this);
                return;
            }
            if (obj instanceof ParseRelation) {
                parcel.writeString("Relation");
                ((ParseRelation) obj).writeToParcel(parcel, this);
                return;
            }
            if (obj instanceof Map) {
                parcel.writeString("Map");
                Map map = (Map) obj;
                parcel.writeInt(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    parcel.writeString((String) entry.getKey());
                    encode(entry.getValue(), parcel);
                }
                return;
            }
            if (obj instanceof Collection) {
                parcel.writeString("Collection");
                Collection collection = (Collection) obj;
                parcel.writeInt(collection.size());
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    encode(it.next(), parcel);
                }
                return;
            }
            if (obj == JSONObject.NULL) {
                parcel.writeString("JsonNull");
                return;
            }
            if (obj == null) {
                parcel.writeString("Null");
            } else {
                if (!isValidType(obj)) {
                    throw new IllegalArgumentException("Could not encode this object into Parcel. " + obj.getClass().toString());
                }
                parcel.writeString("Native");
                parcel.writeValue(obj);
            }
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not encode this object into Parcel. " + obj.getClass().toString());
        }
    }

    public void encodeParseObject(ParseObject parseObject, Parcel parcel) {
        parcel.writeString("Object");
        parseObject.writeToParcel(parcel, this);
    }

    public void encodePointer(String str, String str2, Parcel parcel) {
        parcel.writeString("Pointer");
        parcel.writeString(str);
        parcel.writeString(str2);
    }
}
