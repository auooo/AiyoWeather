package com.auooo.aiyoweather.util;

/**
 * Created by M on 2016/3/28.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
