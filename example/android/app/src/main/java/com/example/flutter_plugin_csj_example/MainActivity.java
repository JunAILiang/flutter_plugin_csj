package com.example.flutter_plugin_csj_example;

import android.os.Bundle;

import com.example.flutter_plugin_csj.ADUtil;

import io.flutter.app.FlutterActivity;
import io.flutter.plugins.GeneratedPluginRegistrant;

public class MainActivity extends FlutterActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ADUtil.setContext(this);
    GeneratedPluginRegistrant.registerWith(this);
  }
}
