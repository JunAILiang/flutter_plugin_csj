import 'package:flutter/material.dart';
import 'package:flutter_plugin_csj/flutter_plugin_csj.dart';

void main() => runApp(MyApp());

class MyApp extends StatefulWidget {
  @override
  _MyAppState createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {

  @override
  void initState() {
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: const Text('Plugin example app'),
        ),
        body: Center(
          child: Column(
            children: <Widget>[
              FlatButton(
                onPressed: (){
                  FlutterPluginCsj.init('5038904');
                },
                child: Text('init'),
              ),
              FlatButton(
                onPressed: (){
                  FlutterPluginCsj().loadVideo('938904444');
                },
                child: Text('loadVideo'),
              ),
              FlatButton(
                onPressed: (){
                  FlutterPluginCsj().showVideo();
                },
                child: Text('showVideo'),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
