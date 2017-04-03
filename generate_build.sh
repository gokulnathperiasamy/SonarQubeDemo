#!/bin/bash

echo "Generating Builds - STARTED"

echo -e "\nCleaning Directory"
./gradlew clean

echo -e "\nGenerating Build Directory"
./gradlew assemble

echo -e "\nBuild path: /build/outputs/apk"

echo -e "\n"

read -t300 -n1 -r -p "Press any key to exit..."