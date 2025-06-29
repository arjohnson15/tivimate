package com.parse;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class ParsePolygon implements Parcelable {
    public static final Parcelable.Creator<ParsePolygon> CREATOR = new Parcelable.Creator<ParsePolygon>() { // from class: com.parse.ParsePolygon.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParsePolygon createFromParcel(Parcel parcel) {
            return new ParsePolygon(parcel, ParseParcelDecoder.get());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParsePolygon[] newArray(int i) {
            return new ParsePolygon[i];
        }
    };
    private List<ParseGeoPoint> coordinates;

    public ParsePolygon(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
        setCoordinates(parcel.readArrayList(null));
    }

    public ParsePolygon(List<ParseGeoPoint> list) {
        setCoordinates(list);
    }

    public static List<ParseGeoPoint> validate(List<ParseGeoPoint> list) {
        if (list.size() >= 3) {
            return list;
        }
        throw new IllegalArgumentException("Polygon must have at least 3 GeoPoints");
    }

    public boolean containsPoint(ParseGeoPoint parseGeoPoint) {
        double latitude = this.coordinates.get(0).getLatitude();
        double latitude2 = this.coordinates.get(0).getLatitude();
        double longitude = this.coordinates.get(0).getLongitude();
        double longitude2 = this.coordinates.get(0).getLongitude();
        for (int i = 1; i < this.coordinates.size(); i++) {
            ParseGeoPoint parseGeoPoint2 = this.coordinates.get(i);
            latitude = Math.min(parseGeoPoint2.getLatitude(), latitude);
            latitude2 = Math.max(parseGeoPoint2.getLatitude(), latitude2);
            longitude = Math.min(parseGeoPoint2.getLongitude(), longitude);
            longitude2 = Math.max(parseGeoPoint2.getLongitude(), longitude2);
        }
        if (parseGeoPoint.getLatitude() < latitude || parseGeoPoint.getLatitude() > latitude2 || parseGeoPoint.getLongitude() < longitude || parseGeoPoint.getLongitude() > longitude2) {
            return false;
        }
        int size = this.coordinates.size() - 1;
        boolean z = false;
        for (int i2 = 0; i2 < this.coordinates.size(); i2++) {
            double latitude3 = this.coordinates.get(i2).getLatitude();
            double longitude3 = this.coordinates.get(i2).getLongitude();
            double latitude4 = this.coordinates.get(size).getLatitude();
            double longitude4 = this.coordinates.get(size).getLongitude();
            if ((longitude3 > parseGeoPoint.getLongitude()) != (longitude4 > parseGeoPoint.getLongitude())) {
                if (parseGeoPoint.getLatitude() < (((parseGeoPoint.getLongitude() - longitude3) * (latitude4 - latitude3)) / (longitude4 - longitude3)) + latitude3) {
                    z = !z;
                }
            }
            size = i2;
        }
        return z;
    }

    public JSONArray coordinatesToJSONArray() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (ParseGeoPoint parseGeoPoint : this.coordinates) {
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(parseGeoPoint.getLatitude());
            jSONArray2.put(parseGeoPoint.getLongitude());
            jSONArray.put(jSONArray2);
        }
        return jSONArray;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ParsePolygon)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ParsePolygon parsePolygon = (ParsePolygon) obj;
        if (this.coordinates.size() != parsePolygon.getCoordinates().size()) {
            return false;
        }
        for (int i = 0; i < this.coordinates.size(); i++) {
            if (this.coordinates.get(i).getLatitude() != parsePolygon.getCoordinates().get(i).getLatitude() || this.coordinates.get(i).getLongitude() != parsePolygon.getCoordinates().get(i).getLongitude()) {
                return false;
            }
        }
        return true;
    }

    public List<ParseGeoPoint> getCoordinates() {
        return this.coordinates;
    }

    public void setCoordinates(List<ParseGeoPoint> list) {
        this.coordinates = validate(list);
    }

    public String toString() {
        return String.format(Locale.US, "ParsePolygon: %s", this.coordinates);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        writeToParcel(parcel, ParseParcelEncoder.get());
    }

    public void writeToParcel(Parcel parcel, ParseParcelEncoder parseParcelEncoder) {
        parcel.writeList(this.coordinates);
    }
}
