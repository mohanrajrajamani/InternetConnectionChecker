package com.mindnotix.connectivityreceiver;

import android.app.Application;

/**
 * Created by Admin on 22-11-2017.
 */

public class MyApplication extends Application{

    private static MyApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;
    }

    public static synchronized MyApplication getInstance() {
        return mInstance;
    }

    public void setConnectivityListener(ConnectivityReceiver.ConnectivityReceiverListener listener) {
        ConnectivityReceiver.connectivityReceiverListener = listener;
    }



}
