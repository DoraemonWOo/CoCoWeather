package com.example.administrator.cocoweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/4/22.
 */

public class Now {
    @SerializedName("tmp")
    public String temperatrue;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
