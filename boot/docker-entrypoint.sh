#!/bin/bash

echo "Starting spring-boot microservice..."

cd $APP_HOME/

exec java -Djava.security.egd=file:/dev/./urandom -jar ${APP_HOME}/app.jar $@
exit $?
