# 🎧 Musify Android App

> A modern music streaming app built with **Jetpack Compose**, **MVVM architecture**, and **modular architecture**. Designed to demonstrate clean Android development practices with real-world app structure.

---

## 🚀 Features

✅ Clean **MVVM architecture**  
🎨 Built using **Jetpack Compose**  
🧭 **Navigation Compose** for screen transitions  
🔌 Retrofit for networking  
📦 Modular project structure  
💉 Dependency Injection via DI module  
📱 Optimized for mobile UI/UX  
🎵 Music Play screen UI  

---

## 🧠 Tech Stack

| Layer       | Technology                            |
|------------|----------------------------------------|
| UI         | Jetpack Compose                        |
| Navigation | Navigation-Compose                     |
| Network    | Retrofit + OkHttp                      |
| State      | Kotlin Coroutines + StateFlow          |
| DI         | Manual DI (via `NetworkModule.kt`)     |
| Arch       | MVVM + Repository Pattern              |

---

## 🗂️ Project Structure

```
app/
├── data/
│   ├── model/             # Data Models
│   ├── network/           # Retrofit API Services
│   └── repository/        # Repository for data handling
│
├── di/
│   └── NetworkModule.kt   # Dependency Injection (Retrofit, OkHttp)
│
├── ui/
│   ├── feature/
│   │   └── home/          # Home Screen - ViewModel, State, UI
│   ├── navigation/        # NavGraph.kt for screen routing
│   └── MainActivity.kt    # Compose host activity
│
└── utils/                 # Helper functions / extensions

res/
└── values/
    └── themes.xml         # App theme and color setup
```

---

## 🔧 Setup & Installation

### 📥 Clone this repo
```bash
git clone https://github.com/jayesh001j/Jetpack-Composer.git
cd Jetpack-Composer
```

### 🛠️ Open in Android Studio
- Launch Android Studio
- Click on `Open Project`
- Select the cloned folder

### 🧱 Sync & Build
- Make sure your Android Studio supports Jetpack Compose
- Let Gradle sync all dependencies
- Hit `Run` ▶️ to launch on Emulator or real device

---

## 📸 Screenshots

### 🟣 Splash, Start & Register Screens
<p align="center">
  <img src="https://github.com/user-attachments/assets/31d0dcbd-003c-4742-ad75-53fc4a9314c5" width="30%" style="margin-right: 10px;" />
  <img src="https://github.com/user-attachments/assets/d13e76e0-2948-46bc-89ef-b8bc79b2b881" width="30%" style="margin-right: 10px;" />
  <img src="https://github.com/user-attachments/assets/0723c522-73d8-427b-b5a0-97ee848ab8cf" width="30%" />
</p>

### 🔵 Login, Home & Music Loading Screens
<p align="center">
  <img src="https://github.com/user-attachments/assets/31d0dcbd-003c-4742-ad75-53fc4a9314c5" width="30%" style="margin-right: 10px;" />
  <img src="https://github.com/user-attachments/assets/d13e76e0-2948-46bc-89ef-b8bc79b2b881" width="30%" style="margin-right: 10px;" />
  <img src="https://github.com/user-attachments/assets/0723c522-73d8-427b-b5a0-97ee848ab8cf" width="30%" />
</p>

### 🟢 Play Song Screen
<p align="center">
  <img src="https://github.com/user-attachments/assets/d13e76e0-2948-46bc-89ef-b8bc79b2b881" width="30%" style="margin-right: 10px;" />
</p>


## ✍️ Usage Guide

- Start at `MainActivity.kt`
- `NavGraph.kt` controls all screen routes
- Add new screens via sealed classes and composable functions
- Handle UI state in ViewModel with `StateFlow`
- Trigger navigation and events via `UI Events`

---

## 🛠️ How to Add a New Feature (e.g., "Search")?

1. Create folder: `ui/feature/search/`
2. Add:
   - `SearchScreen.kt`
   - `SearchViewModel.kt`
   - `SearchState.kt` / `SearchEvent.kt`
3. Add new route in `NavGraph.kt`

---

## 📡 API Integration

- Defined in: `data/network/ApiService.kt`
- Call via: `Repository.kt`
- Injected through: `NetworkModule.kt`

---

## 🤝 Contribution

Pull Requests are welcome!  
Please follow clean architecture and use Jetpack Compose for UI.

---



## 📬 Connect with Me

- GitHub: [jayesh001j](https://github.com/jayesh001j)
- LinkedIn: [Jayesh Parmar](https://linkedin.com/in/your-link](https://www.linkedin.com/in/jayesh-parmar-1751b72a4/)) *(add yours)*

---

**Made with ❤️ by Jayesh using Jetpack Compose**
