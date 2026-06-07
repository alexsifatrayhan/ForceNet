# 🛰️ ForceNet

<p align="center">
  <img src="icon.png" alt="ForceNet Icon" width="120" height="120" style="border-radius: 24px; box-shadow: 0 4px 20px rgba(0, 255, 102, 0.3);"/>
</p>

<p align="center">
  <b>A Lightweight, High-Performance Native Android Utility to Force Network Modes & Access Hidden RadioInfo.</b>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Platform-Android-00FF66?style=for-the-badge&logo=android&logoColor=black" alt="Android Support"/>
  <img src="https://img.shields.io/badge/Architecture-Native_No--AndroidX-00E5FF?style=for-the-badge" alt="Native Architecture"/>
  <img src="https://img.shields.io/badge/Developer-SR7_Mods-FF007F?style=for-the-badge" alt="Developer Badge"/>
</p>

---

### 📱 Preview

<p align="center">
  <img src="ss.jpg" alt="ForceNet Screenshot" width="320" style="border: 2px solid #00FF66; border-radius: 12px; box-shadow: 0 0 15px rgba(0, 255, 102, 0.2);"/>
</p>

---

### ⚡ Overview

**ForceNet** is a specialized, lightweight Android tool built to bypass restrictions and directly open the hidden system `RadioInfo` configurations. This utility allows users to lock cellular networks into specific, stable modes (such as **LTE Only** or **NR Only**) that are usually hidden or restricted by default system settings.

The project is built entirely using **Native Android Components (No AndroidX Dependency)**, ensuring seamless compilation and operation within minimalist building environments, terminal apps like **Termux**, or lighter IDEs without dependency overhead or build errors.

---

### 🚀 Key Features

* **Advanced Network Locking:** Directly trigger the core `RadioInfo` components to enforce stable, permanent cellular configurations (4G/5G Only mode).
* **Smart Intent Routing:** Built-in explicit and implicit intent handling optimized for Android 11+ and legacy versions to avoid crashes across custom ROMs or heavy manufacturer skins.
* **Cyber-Green UI Design:** A sleek, minimalist dark theme interface with vivid neon green highlights, responsive action rows, and compact trigger buttons.
* **Ultra Lightweight Footprint:** Zero external libraries, zero third-party dependencies, and absolute exclusion of heavy AndroidX architectures.

---

### 🛠️ Technical Details & Compilation

Since this repository bypasses complex Gradle frameworks, you can manually build the APK straight from a terminal or mobile development environment.

#### Manual Compilation Flow via Termux:
```bash
# 1. Compile Java source files using ECJ
ecj -d bin -cp $ANDROID_JAR src/com/sr7mods/forcenet/*.java

# 2. Convert bytecode to Dalvik Executable (DEX)
dx --dex --output=classes.dex bin

# 3. Package and Sign the application
zip -r ForceNet.apk AndroidManifest.xml res classes.dex
apksigner sign --ks keystore.jks ForceNet.apk
```

---

### 📂 Repository Structure

* `src/` — Pure Native Java source code housing the intent routing and network management framework.
* `res/` — Core layout files and clean drawables customized with the signature cyber-green theme.
* `icon.png` — Official high-resolution application launcher asset.
* `ss.jpg` — Clean interface showcase screenshot.

---

### 👑 Developer Credentials

<p align="center">
  <samp>
    <b>Dev:</b> SR7 Mods <br>
    <b>Contact:</b> <a href="https://alexsifatrayhan.github.io/about-me/" target="_blank">alexsifatrayhan.github.io/about-me/</a>
  </samp>
</p>

<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=00FF66&height=60&section=footer" alt="Footer Wave" width="100%"/>
</p>
