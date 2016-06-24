#!/bin/sh

CWD=$(pwd)
API_DIR=$CWD/TestPF4JApi
APP_DIR=$CWD/TestPF4JApp
PLUGIN_DIR=$CWD/TestPlugin
PLUGIN_TARGET=$PLUGIN_DIR/target
MAVEN=$(which mvn)

# locally install API JAR in .m2
cd $API_DIR; $MAVEN clean install; cd $CWD;

# build zip of plugin
cd $PLUGIN_DIR; $MAVEN clean package;

# copy zip to Test App
cp $PLUGIN_TARGET/*.zip $APP_DIR/plugins/;
cd $CWD;

# clean/compile Test App
cd $APP_DIR; $MAVEN clean compile;

# Run Test App
$MAVEN exec:java