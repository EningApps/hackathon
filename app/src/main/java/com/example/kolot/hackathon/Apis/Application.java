package com.example.kolot.hackathon.Apis;

import com.vk.sdk.VKSdk;

/**
 * Created by kolot on 25.11.2017.
 */

public class Application extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        VKSdk.initialize(this);
    }
}
