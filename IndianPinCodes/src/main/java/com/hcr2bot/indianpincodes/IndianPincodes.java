package com.hcr2bot.indianpincodes;

import android.content.Context;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class IndianPincodes {

    public static boolean isValidPincode(Context context, String pincode) {
        try {
            JSONObject obj = new JSONObject(Util.loadJsonfromAssets(context));
            JSONArray arr = obj.getJSONArray("Sheet1");
            JSONArray ResultArray = new JSONArray();


            for (int i = 0; i < arr.length(); i++) {
                JSONObject obj1 = arr.getJSONObject(i);
                if (obj1.getString("Pincode").equals(pincode)) {
                    Log.d("postal", "Found!");
                }

            } } catch (JSONException e) {
            e.printStackTrace();
        }
        return true;
    }

    public static JSONObject getPincodeByCity(Context context, String City){
        JSONObject finalObj = new JSONObject();
        try {
            JSONObject obj = new JSONObject(Util.loadJsonfromAssets(context));
            JSONArray arr = obj.getJSONArray("Sheet1");
            JSONArray ResultArray = new JSONArray();


            for (int i=0; i<arr.length();i++){
                JSONObject obj1 = arr.getJSONObject(i);
                JSONObject infoObj = new JSONObject();
                if (obj1.getString("City").equals(City)){
                    infoObj.put("PostOfficeName", obj1.getString("PostOfficeName"));
                    infoObj.put("City",obj1.getString("City"));
                    infoObj.put("Pincode",obj1.getString("Pincode"));
                    infoObj.put("State", obj1.getString("State"));
                    ResultArray.put(infoObj);
                }

            }
            finalObj.put("Result", ResultArray);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return finalObj;
    }

    public static JSONObject getStatePincodes(Context context, String State){
        JSONObject finalObj = new JSONObject();
        try {
            JSONObject obj = new JSONObject(Util.loadJsonfromAssets(context));
            JSONArray arr = obj.getJSONArray("Sheet1");
            JSONArray ResultArray = new JSONArray();


            for (int i=0; i<arr.length();i++){
                JSONObject obj1 = arr.getJSONObject(i);
                JSONObject infoObj = new JSONObject();
                if (obj1.getString("State").equals(State)){
                    infoObj.put("PostOfficeName", obj1.getString("PostOfficeName"));
                    infoObj.put("City",obj1.getString("City"));
                    infoObj.put("Pincode",obj1.getString("Pincode"));
                    infoObj.put("State", obj1.getString("State"));
                    ResultArray.put(infoObj);
                }

            }
            finalObj.put("Result", ResultArray);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return finalObj;
    }

    public static JSONObject getDistrictPincodes(Context context, String District){
        JSONObject finalObj = new JSONObject();
        try {
            JSONObject obj = new JSONObject(Util.loadJsonfromAssets(context));
            JSONArray arr = obj.getJSONArray("Sheet1");
            JSONArray ResultArray = new JSONArray();


            for (int i=0; i<arr.length();i++){
                JSONObject obj1 = arr.getJSONObject(i);
                JSONObject infoObj = new JSONObject();
                if (obj1.getString("District").equals(District)){
                    infoObj.put("PostOfficeName", obj1.getString("PostOfficeName"));
                    infoObj.put("City",obj1.getString("City"));
                    infoObj.put("Pincode",obj1.getString("Pincode"));
                    infoObj.put("State", obj1.getString("State"));
                    infoObj.put("District", obj1.getString("District"));
                    ResultArray.put(infoObj);
                }

            }
            finalObj.put("Result", ResultArray);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return finalObj;
    }

}
