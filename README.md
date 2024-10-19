# RunAwayWear app!

**RunAwayWear** is a seamless companion of the **RunAway** mobile app, designed to deliver an intuitive 
and lightweight running tracker experience directly on your wrist. Built with Wear OS, this companion 
app integrates effortlessly with the mobile version, ensuring real-time synchronization and accurate 
tracking of your running stats. Using **Jetpack Compose for Wear OS** and **Kotlin Coroutines**, 
the app maintains the reactive, real-time data handling approach found in the main app, powered 
by **Flow**. Its modular architecture enables scalability and easy maintenance, ensures uninterrupted 
tracking even with a phone connection. Perfect for those on the go, 
the Wear Companion brings the best of modern Android development to your smartwatch, offering a 
practical and responsive running companion.


| ![screenshot1](screenshots/Screenshot_1.png) | ![screenshot2](screenshots/Screenshot_2.png) | ![screenshot3](screenshots/Screenshot_3.png) | ![screenshot4](screenshots/Screenshot_4.png) | ![screenshot4](screenshots/Screenshot_5.png) |
|----------------------------------------------|----------------------------------------------|----------------------------------------------|----------------------------------------------|----------------------------------------------|

# Build with

| Technology                                                                                     | Description                                                                                       | Version |
|------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------|---------|
| ![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-4285F4?style=for-the-badge&logo=android&logoColor=white) | **Jetpack Compose** - Modern toolkit for building native Android UIs using declarative components | Bom 2024.02.02  |
| ![Kotlin Coroutines](https://img.shields.io/badge/Kotlin%20Coroutines-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white) | **Kotlin Coroutines** - Asynchronous programming framework for managing background tasks          | 1.8.0   |
| ![Flow](https://img.shields.io/badge/Kotlin%20Flow-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white) | **Flow** - Kotlin's reactive streams API for handling data streams and asynchronous operations    | 1.8.0   |
| ![Jetpack Compose Navigation](https://img.shields.io/badge/Jetpack%20Compose%20Navigation-4285F4?style=for-the-badge&logo=android&logoColor=white) | **Navigation Compose** - Navigation library for managing UI navigation in Compose apps            | 2.7.7   |
| ![Koin](https://img.shields.io/badge/Koin-FFD700?style=for-the-badge&logo=kotlin&logoColor=white) | **Koin** - Lightweight dependency injection framework for Kotlin                                  | 3.5.3   |

> These technologies were selected to ensure efficient, scalable, and modern Android app development.

# Module Graph
```mermaid
%%{
  init: {
    'theme': 'neutral'
  }
}%%

graph LR
  subgraph :core
    :core:data["data"]
    :core:domain["domain"]
    :core:notification["notification"]
  end
  subgraph :core:connectivity
    :core:connectivity:domain["domain"]
    :core:connectivity:data["data"]
  end
  subgraph :core:presentation
    :core:presentation:designsystem_wear["designsystem_wear"]
    :core:presentation:designsystem["designsystem"]
    :core:presentation:ui["ui"]
  end
  subgraph :run
    :run:domain["domain"]
    :run:data["data"]
    :run:presentation["presentation"]
  end
  :core:data --> :core:domain
  :run:domain --> :core:domain
  :run:domain --> :core:connectivity:domain
  :run:data --> :run:domain
  :run:data --> :core:domain
  :run:data --> :core:connectivity:domain
  :core:presentation:designsystem_wear --> :core:presentation:designsystem
  :core:presentation:ui --> :core:domain
  :core:presentation:ui --> :core:presentation:designsystem
  :app --> :core:presentation:designsystem_wear
  :app --> :run:presentation
  :app --> :run:domain
  :app --> :run:data
  :app --> :core:connectivity:domain
  :app --> :core:connectivity:data
  :app --> :core:notification
  :core:notification --> :core:domain
  :core:notification --> :core:presentation:ui
  :core:notification --> :core:presentation:designsystem
  :run:presentation --> :core:presentation:designsystem_wear
  :run:presentation --> :core:presentation:ui
  :run:presentation --> :core:notification
  :run:presentation --> :core:domain
  :run:presentation --> :core:connectivity:domain
  :run:presentation --> :run:domain
  :core:connectivity:domain --> :core:domain
  :core:connectivity:data --> :core:domain
  :core:connectivity:data --> :core:connectivity:domain
```

# Setup for usage

> To successfully use this wear OS app you need to have main phone app that you can get from:
> [RunAway phone app](https://github.com/galmax1/RunAway)

To build the project, follow these steps:

1. **Open the Project in Android Studio:**
    - Launch Android Studio.
    - Click on `File > Open...` and select the root directory of your project.

2. **Sync Gradle:**
    - Android Studio will automatically detect the Gradle files and sync the project. If not, you
      can manually sync by clicking on `Sync Project with Gradle Files` in the toolbar.

3. **Build the Project:**
    - You can build the project by selecting `Build > Make Project` or by clicking the `Build` icon
      in the toolbar.


