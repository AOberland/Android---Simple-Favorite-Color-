#!/bin/bash

# Violet Color Selection App - Build Script
# This script builds the APK for Violet's color selection app

echo "🎨 Building Violet's Color Selection App..."
echo "=========================================="

# Check if we're in the right directory
if [ ! -f "app/build.gradle" ]; then
    echo "❌ Error: Please run this script from the project root directory"
    exit 1
fi

# Clean previous builds
echo "🧹 Cleaning previous builds..."
./gradlew clean

# Build the APK
echo "🔨 Building APK..."
./gradlew assembleDebug

# Check if build was successful
if [ $? -eq 0 ]; then
    echo "✅ Build successful!"
    echo "📱 APK location: app/build/outputs/apk/debug/app-debug.apk"
    echo ""
    echo "🎉 Violet's app is ready to install!"
    echo "📋 To install on Violet's device:"
    echo "   1. Copy the APK to her device"
    echo "   2. Enable 'Install from unknown sources' in settings"
    echo "   3. Tap the APK file to install"
    echo ""
    echo "💜 Enjoy watching Violet explore her favorite colors!"
else
    echo "❌ Build failed. Please check the error messages above."
    exit 1
fi 