package com.example.lanjianhua131.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Lanjianhua131 on 2019/8/24.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
