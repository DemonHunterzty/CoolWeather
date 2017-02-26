package com.huntertzty.tianyu.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Tianyu on 2/23/2017.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }

}
