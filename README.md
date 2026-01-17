

**Clean Architecture + Jetpack Compose + MVVM, focusing on Authentication (Login/Register) and a Profile screen**
com.agilanbu.skillup
│
├── domain
│   ├── model
│   │    └── User.kt
│   ├── repository
│   │    └── AuthRepository.kt
│   └── usecase
│        ├── LoginUseCase.kt
│        ├── RegisterUseCase.kt
│        └── GetProfileUseCase.kt
├── data
│   ├── datasource
│   │    └── AuthDataSource.kt        // API or local DB calls
│   ├── repository
│   │    └── AuthRepositoryImpl.kt    // Implements AuthRepository
│   └── mapper
│        └── UserMapper.kt            // optional: map DTOs to domain models
├── presentation
│   ├── viewmodel
│   │    └── AuthViewModel.kt
│   ├── ui
│   │    ├── login
│   │    │    └── LoginScreen.kt
│   │    ├── profile
│   │    │    └── ProfileScreen.kt
│   │    └── components
│   │         └── CustomTextField.kt  // reusable Compose components
│   └── navigation
│        └── AppNavHost.kt
├── di
│   └── AppModule.kt                  // Hilt modules for dependency injection
│
└── MainActivity.kt
