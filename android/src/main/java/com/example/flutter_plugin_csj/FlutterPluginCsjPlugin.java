package com.example.flutter_plugin_csj;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.Registrar;

/** FlutterPluginCsjPlugin */
public class FlutterPluginCsjPlugin implements MethodCallHandler {
  /** Plugin registration. */
  public static void registerWith(Registrar registrar) {
    final MethodChannel channel = new MethodChannel(registrar.messenger(), "flutter_plugin_csj");
    channel.setMethodCallHandler(new FlutterPluginCsjPlugin());
    ADUtil.channel = channel;
  }

  @Override
  public void onMethodCall(MethodCall call, Result result) {
    if (call.method.equals("getPlatformVersion")) {
      result.success("Android " + android.os.Build.VERSION.RELEASE);
    } else if(call.method.equals("init")){
      ADUtil.init((String) call.arguments);
    } else if(call.method.equals("loadVideo")){
      ADUtil.loadVideo((String) call.arguments);
    } else if(call.method.equals("showVideo")){
      ADUtil.showVideo();
    } else {
      result.notImplemented();
    }
  }
}
