# Installation Guide for Violet's Color Selection App

## 🎨 Quick Start Guide

### Prerequisites
- Android device running Android 7.0 (API 24) or higher
- File manager app (most Android devices have one built-in)

### Step-by-Step Installation

#### Method 1: Using Android Studio (Recommended for Development)
1. **Open Android Studio**
2. **Open the project**: File → Open → Select "Violet Color Selection" folder
3. **Wait for sync**: Let Gradle sync the project (this may take a few minutes)
4. **Connect device**: Connect Violet's Android device via USB
5. **Enable USB debugging**: 
   - Go to Settings → About Phone
   - Tap "Build Number" 7 times to enable Developer Options
   - Go to Settings → Developer Options → Enable "USB Debugging"
6. **Run the app**: Click the green "Run" button in Android Studio
7. **Install on device**: The app will automatically install and launch

#### Method 2: Direct APK Installation
1. **Build the APK**:
   - On Windows: Double-click `build_apk.bat`
   - On Mac/Linux: Run `./build_apk.sh` in terminal
2. **Find the APK**: Look in `app/build/outputs/apk/debug/app-debug.apk`
3. **Transfer to device**: Copy the APK file to Violet's device
4. **Enable unknown sources**:
   - Go to Settings → Security → Unknown Sources (or Privacy → Install unknown apps)
   - Enable for your file manager app
5. **Install**: Tap the APK file and follow the installation prompts

### 📱 First Launch
- The app will show: "Hello Violet. What's your favorite color today?"
- Tap either "Green" or "Purple" to explore shades
- Tap any shade button to change the background color
- Use the "← Back" button to return to the main screen

### 🔧 Troubleshooting

#### "App not installed" error
- Make sure "Install unknown apps" is enabled for your file manager
- Try downloading the APK again
- Check that the device runs Android 7.0 or higher

#### Build errors in Android Studio
- Make sure you have the latest Android Studio
- Sync project with Gradle files (File → Sync Project with Gradle Files)
- Clean and rebuild project (Build → Clean Project, then Build → Rebuild Project)

#### Device not recognized
- Enable USB debugging in Developer Options
- Try a different USB cable
- Install device drivers if prompted

### 🎯 Features to Test
- ✅ Welcome screen appears with greeting
- ✅ Green button changes background to green and shows 10 green shades
- ✅ Purple button changes background to purple and shows 10 purple shades
- ✅ Tapping any shade changes the entire screen background
- ✅ Back button returns to welcome screen
- ✅ App resets to welcome screen when reopened

### 💡 Tips for Violet
- The app is designed to be simple and intuitive
- All text is large and easy to read
- Colors have high contrast for accessibility
- No internet connection required
- No ads or data collection

### 🆘 Need Help?
If you encounter any issues:
1. Check that your Android device meets the minimum requirements
2. Ensure you have enough storage space (app is very small)
3. Try restarting the device and reinstalling
4. Contact the developer if problems persist

---

**Enjoy watching Violet explore her favorite colors! 🌈✨** 