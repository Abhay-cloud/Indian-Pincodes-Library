package com.hcr2bot.indianpincodes;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;

public class Util {
    public static String loadJsonfromAssets(Context context){
        String json = null;
        try {
            InputStream in = context.getAssets().open("postalcodes.json");

            int size = in.available();
            byte[] buffer = new byte[size];
            in.read(buffer);
            in.close();
            json = new String(buffer, "UTF-8");
        }catch (IOException e){
            e.printStackTrace();
            return  null;
        }
        return  json;
    }
}
