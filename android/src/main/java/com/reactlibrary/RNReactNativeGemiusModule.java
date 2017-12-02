
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import android.util.Log;
import com.gemius.sdk.*;
import com.gemius.sdk.Config;
import com.gemius.sdk.audience.AudienceConfig;
import com.gemius.sdk.audience.AudienceEvent;
import com.gemius.sdk.stream.AdData;
import com.gemius.sdk.stream.AdData.AdType;
import com.gemius.sdk.stream.EventProgramData;
import com.gemius.sdk.stream.Player;
import com.gemius.sdk.stream.PlayerData;
import com.gemius.sdk.stream.ProgramData;

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
    AudienceConfig.getSingleton().setHitCollectorHost(host);
    AudienceConfig.getSingleton().setScriptIdentifier(scriptIdentifierAndroid);
  }


  @ReactMethod
  public void sendPageViewedEvent() {
    AudienceEvent event = new AudienceEvent(this);
    event.sendEvent();
  }

}