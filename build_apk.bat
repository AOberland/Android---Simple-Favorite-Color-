@echo off
REM Violet Color Selection App - Build Script for Windows
REM This script builds the APK for Violet's color selection app

echo 🎨 Building Violet's Color Selection App...
echo ==========================================

REM Check if we're in the right directory
if not exist "app\build.gradle" (
    echo ❌ Error: Please run this script from the project root directory
    pause
    exit /b 1
)

REM Clean previous builds
echo 🧹 Cleaning previous builds...
call gradlew.bat clean

REM Build the APK
echo 🔨 Building APK...
call gradlew.bat assembleDebug

REM Check if build was successful
if %ERRORLEVEL% equ 0 (
    echo ✅ Build successful!
    echo 📱 APK location: app\build\outputs\apk\debug\app-debug.apk
    echo.
    echo 🎉 Violet's app is ready to install!
    echo 📋 To install on Violet's device:
    echo    1. Copy the APK to her device
    echo    2. Enable 'Install from unknown sources' in settings
    echo    3. Tap the APK file to install
    echo.
    echo 💜 Enjoy watching Violet explore her favorite colors!
) else (
    echo ❌ Build failed. Please check the error messages above.
    pause
    exit /b 1
)

pause 