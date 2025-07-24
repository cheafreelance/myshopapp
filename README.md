name: Build Android App

on:
  push:
    branches:
      - main

jobs:
  build:
    name: Build APK
    runs-on: ubuntu-latest

    steps:
      - name: Checkout code
        uses: actions/checkout@v3

      - name: Set up JDK
        uses: actions/setup-java@v3
        with:
          distribution: 'temurin'
          java-version: 17

      - name: Grant execute permission to gradlew
        run: chmod +x ./gradlew

      - name: Clean and Build APK
        run: ./gradlew clean assembleDebug

      - name: List APKs
        run: ls -R app/build/outputs/

      - name: Upload APK
        uses: actions/upload-artifact@v3
        with:
          name: myshop-app-debug-apk
          path: app/build/outputs/apk/debug/app-debug.apk
