package com.parse;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
abstract class ParseFieldOperations {
    private static final Map<String, ParseFieldOperationFactory> opDecoderMap = new HashMap();

    public interface ParseFieldOperationFactory {
        ParseFieldOperation decode(Parcel parcel, ParseParcelDecoder parseParcelDecoder);

        ParseFieldOperation decode(JSONObject jSONObject, ParseDecoder parseDecoder);
    }

    public static ParseFieldOperation decode(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
        String string = parcel.readString();
        ParseFieldOperationFactory parseFieldOperationFactory = opDecoderMap.get(string);
        if (parseFieldOperationFactory != null) {
            return parseFieldOperationFactory.decode(parcel, parseParcelDecoder);
        }
        throw new RuntimeException(ᵎﹳ.ᐧʻ.ﾞˊ("Unable to decode operation of type ", string));
    }

    public static ParseFieldOperation decode(JSONObject jSONObject, ParseDecoder parseDecoder) {
        String strOptString = jSONObject.optString("__op");
        ParseFieldOperationFactory parseFieldOperationFactory = opDecoderMap.get(strOptString);
        if (parseFieldOperationFactory != null) {
            return parseFieldOperationFactory.decode(jSONObject, parseDecoder);
        }
        throw new RuntimeException(ᵎﹳ.ᐧʻ.ﾞˊ("Unable to decode operation of type ", strOptString));
    }

    public static ArrayList<Object> jsonArrayAsArrayList(JSONArray jSONArray) {
        ArrayList<Object> arrayList = new ArrayList<>(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(jSONArray.get(i));
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
        return arrayList;
    }

    private static void registerDecoder(String str, ParseFieldOperationFactory parseFieldOperationFactory) {
        opDecoderMap.put(str, parseFieldOperationFactory);
    }

    public static void registerDefaultDecoders() {
        registerDecoder("Batch", new ParseFieldOperationFactory() { // from class: com.parse.ParseFieldOperations.1
            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
                return ParseFieldOperations.decode(parcel, parseParcelDecoder).mergeWithPrevious(ParseFieldOperations.decode(parcel, parseParcelDecoder));
            }

            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(JSONObject jSONObject, ParseDecoder parseDecoder) throws JSONException {
                JSONArray jSONArray = jSONObject.getJSONArray("ops");
                ParseFieldOperation parseFieldOperationMergeWithPrevious = null;
                for (int i = 0; i < jSONArray.length(); i++) {
                    parseFieldOperationMergeWithPrevious = ParseFieldOperations.decode(jSONArray.getJSONObject(i), parseDecoder).mergeWithPrevious(parseFieldOperationMergeWithPrevious);
                }
                return parseFieldOperationMergeWithPrevious;
            }
        });
        registerDecoder("Delete", new ParseFieldOperationFactory() { // from class: com.parse.ParseFieldOperations.2
            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
                return ParseDeleteOperation.getInstance();
            }

            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(JSONObject jSONObject, ParseDecoder parseDecoder) {
                return ParseDeleteOperation.getInstance();
            }
        });
        registerDecoder("Increment", new ParseFieldOperationFactory() { // from class: com.parse.ParseFieldOperations.3
            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
                return new ParseIncrementOperation((Number) parseParcelDecoder.decode(parcel));
            }

            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(JSONObject jSONObject, ParseDecoder parseDecoder) {
                return new ParseIncrementOperation((Number) parseDecoder.decode(jSONObject.opt("amount")));
            }
        });
        registerDecoder("Add", new ParseFieldOperationFactory() { // from class: com.parse.ParseFieldOperations.4
            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(i2, parseParcelDecoder.decode(parcel));
                }
                return new ParseAddOperation(arrayList);
            }

            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(JSONObject jSONObject, ParseDecoder parseDecoder) {
                return new ParseAddOperation((Collection) parseDecoder.decode(jSONObject.opt("objects")));
            }
        });
        registerDecoder("AddUnique", new ParseFieldOperationFactory() { // from class: com.parse.ParseFieldOperations.5
            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(i2, parseParcelDecoder.decode(parcel));
                }
                return new ParseAddUniqueOperation(arrayList);
            }

            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(JSONObject jSONObject, ParseDecoder parseDecoder) {
                return new ParseAddUniqueOperation((Collection) parseDecoder.decode(jSONObject.opt("objects")));
            }
        });
        registerDecoder("Remove", new ParseFieldOperationFactory() { // from class: com.parse.ParseFieldOperations.6
            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(i2, parseParcelDecoder.decode(parcel));
                }
                return new ParseRemoveOperation(arrayList);
            }

            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(JSONObject jSONObject, ParseDecoder parseDecoder) {
                return new ParseRemoveOperation((Collection) parseDecoder.decode(jSONObject.opt("objects")));
            }
        });
        registerDecoder("AddRelation", new ParseFieldOperationFactory() { // from class: com.parse.ParseFieldOperations.7
            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
                int i = parcel.readInt();
                HashSet hashSet = new HashSet(i);
                for (int i2 = 0; i2 < i; i2++) {
                    hashSet.add((ParseObject) parseParcelDecoder.decode(parcel));
                }
                return new ParseRelationOperation(hashSet, null);
            }

            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(JSONObject jSONObject, ParseDecoder parseDecoder) {
                return new ParseRelationOperation(new HashSet((List) parseDecoder.decode(jSONObject.optJSONArray("objects"))), null);
            }
        });
        registerDecoder("RemoveRelation", new ParseFieldOperationFactory() { // from class: com.parse.ParseFieldOperations.8
            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
                int i = parcel.readInt();
                HashSet hashSet = new HashSet(i);
                for (int i2 = 0; i2 < i; i2++) {
                    hashSet.add((ParseObject) parseParcelDecoder.decode(parcel));
                }
                return new ParseRelationOperation(null, hashSet);
            }

            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(JSONObject jSONObject, ParseDecoder parseDecoder) {
                return new ParseRelationOperation(null, new HashSet((List) parseDecoder.decode(jSONObject.optJSONArray("objects"))));
            }
        });
        registerDecoder("Set", new ParseFieldOperationFactory() { // from class: com.parse.ParseFieldOperations.9
            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
                return new ParseSetOperation(parseParcelDecoder.decode(parcel));
            }

            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(JSONObject jSONObject, ParseDecoder parseDecoder) {
                return null;
            }
        });
    }
}
