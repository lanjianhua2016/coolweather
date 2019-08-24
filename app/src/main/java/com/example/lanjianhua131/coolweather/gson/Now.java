package com.example.lanjianhua131.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Lanjianhua131 on 2019/8/24.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
