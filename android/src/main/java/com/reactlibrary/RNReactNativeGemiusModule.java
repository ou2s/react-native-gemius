
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import android.util.Log;

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
  public void testMethod(String test) {
    private static final String TAG = "MainActivity";
    Log.v(TAG, "Testing Android" + test);
  }

}