#!/bin/bash

echo "Running Sonar Code Coverage - STARTED"

echo -e "\nCleaning Directory"
./gradlew clean

echo -e "\nRunning Test Case"
./gradlew tDJ

echo -e "\nRunning Sonar"
./gradlew sonarRunner

echo -e "\nRunning Sonar Code Coverage - FINISHED"

echo -e "\n"

echo "Sonar dashboard: http://localhost:9000"

echo -e "\nTest case result: /build/reports/tests/devDebug/index.html"

echo -e "\nBuild path: /build/outputs/apk"

echo -e "\n"

read -t300 -n1 -r -p "Press any key to exit..."