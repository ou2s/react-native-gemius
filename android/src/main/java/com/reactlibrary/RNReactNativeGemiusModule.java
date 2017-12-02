
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import android.util.Log;
import com.gemius.sdk.*;

public class RNReactNativeGemiusModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNReactNativeGemiusModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNReactNativeGemius";
  }


  @ReactMethod
  public void setAppInfo(String app, String version) {
    // TO REMOVE
    com.gemius.sdk.Config.setLoggingEnabled(true);

    com.gemius.sdk.Config.setAppInfo(app, version);
  }

  @ReactMethod
  public void setGemiusInfo(String host, String scriptIdentifierIos, String scriptIdentifierAndroid) {
    com.gemius.sdk.AudienceConfig.setHitCollectorHost(host);
    com.gemius.sdk.AudienceConfig.setScriptIdentifier(scriptIdentifierAndroid);
  }


  @ReactMethod
  public void sendPageViewedEvent() {
    AudienceEvent event = new com.gemius.sdk.AudienceEvent(context);
    event.setEventType(EventType.FULL_PAGEVIEW);
    event.sendEvent();
  }

}