package com.moengage.cordova.sample;

import android.app.Application;
import com.moengage.core.Logger;
import com.moengage.core.MoEngage;
import com.moengage.core.MoEngage.DATA_REGION;



public class SampleApplication extends Application{
  public void onCreate(){
    super.onCreate();
    MoEngage moEngage = new MoEngage.Builder(this, "xxxxxxxxxxxxx")
        .setLogLevel(Logger.VERBOSE)
        .enableLocationServices()
        .setNotificationSmallIcon(R.drawable.icon)
        .setNotificationLargeIcon(R.drawable.icon)
        .setSenderId("xxxxxxxxxxxx")
        .build();
        MoEngage.initialise(moEngage);
  }
}
