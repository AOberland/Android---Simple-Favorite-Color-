# Violet Color Selection App

A delightful Android app designed specifically for Violet to explore her favorite colors! 🌈

## Features

### 🎨 Interactive Color Selection
- **Welcome Screen**: Personalized greeting asking Violet to choose her favorite color
- **Two Color Options**: Green and Purple buttons with beautiful, accessible design
- **Dynamic Backgrounds**: Screen background changes instantly based on color selection

### 🌿 Green Shades (10 Varieties)
- Forest Green
- Dark Green  
- Light Green
- Lime Green
- Olive Green
- Pine Green
- Dark Forest
- Spring Green
- Sage Green
- Mint Green

### 💜 Purple Shades (10 Varieties)
- Purple
- Dark Purple
- Light Purple
- Pink Purple
- Violet
- Deep Purple
- Dark Violet
- Royal Purple
- Bright Purple
- Lavender

## Technical Specifications

- **Platform**: Android (min SDK 24 / Android 7.0)
- **Architecture**: Jetpack Compose with Material3
- **Language**: Kotlin
- **State Management**: Compose State
- **Accessibility**: WCAG 2.1 compliant with 18sp+ text size

## App Flow

1. **Launch** → Welcome screen with greeting
2. **Color Selection** → Tap Green or Purple button
3. **Shade Exploration** → 2x5 grid of shade buttons
4. **Background Change** → Instant background update on shade selection
5. **Navigation** → Back button returns to welcome screen

## Build Instructions

### Prerequisites
- Android Studio Arctic Fox or later
- JDK 8 or higher
- Android SDK 34

### Building the App
1. Open the project in Android Studio
2. Sync Gradle files
3. Build → Make Project (Ctrl+F9)
4. Run → Run 'app' (Shift+F10)

### Generating APK
1. Build → Build Bundle(s) / APK(s) → Build APK(s)
2. APK will be generated in `app/build/outputs/apk/debug/`

## Project Structure

```
Violet Color Selection/
├── app/
│   ├── src/main/
│   │   ├── java/com/violet/colorapp/
│   │   │   └── MainActivity.kt          # Main app logic
│   │   ├── res/
│   │   │   ├── values/
│   │   │   │   ├── strings.xml          # App strings
│   │   │   │   └── themes.xml           # Material3 theme
│   │   │   └── xml/
│   │   │       ├── backup_rules.xml     # Backup configuration
│   │   │       └── data_extraction_rules.xml
│   │   └── AndroidManifest.xml          # App manifest
│   ├── build.gradle                     # App-level dependencies
│   └── proguard-rules.pro              # Code optimization rules
├── build.gradle                        # Project-level configuration
├── settings.gradle                     # Project settings
├── gradle.properties                   # Gradle properties
└── gradle/wrapper/                     # Gradle wrapper
```

## Color Palette

### Green Shades (HEX values)
- #4CAF50 (Base), #388E3C, #8BC34A, #CDDC39, #AFB42B
- #689F38, #33691E, #7CB342, #558B2F, #9CCC65

### Purple Shades (HEX values)  
- #9C27B0 (Base), #7B1FA2, #E1BEE7, #BA68C8, #AB47BC
- #8E24AA, #6A1B9A, #4A148C, #EA80FC, #CE93D8

## Testing

### Manual Test Cases
- ✅ Launch app → Verify greeting and two buttons appear
- ✅ Tap "Green" → Screen turns base green, shows 10 green shade buttons
- ✅ Tap any green shade → Screen updates to exact shade
- ✅ Repeat test for purple path
- ✅ Press back button → Returns to initial screen (resets background)

## Accessibility Features

- **High Contrast**: All text meets WCAG 2.1 contrast requirements
- **Large Text**: Minimum 18sp font size for readability
- **Touch Targets**: Adequate button sizes for easy interaction
- **Color Independence**: Text remains readable on all background colors

## For Violet's Dad

This app is designed to be:
- **Simple & Intuitive**: Easy for Violet to use independently
- **Visually Engaging**: Beautiful colors and smooth transitions
- **Educational**: Helps Violet learn about different shades and color names
- **Safe**: No ads, no internet required, no data collection

Enjoy watching Violet explore her favorite colors! 🎨✨

---

*Built with ❤️ for Violet using Jetpack Compose and Material3* 