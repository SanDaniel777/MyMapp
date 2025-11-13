plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.ksp) // Para Room
}

android {
    namespace = "com.example.mymapp"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.mymapp"
        minSdk = 26
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    // Core y Lifecycle KTX
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.1")

    // Jetpack Compose
    implementation("androidx.activity:activity-compose:1.9.0")
    implementation(platform("androidx.compose:compose-bom:2024.05.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.material3")
    implementation("androidx.compose.ui:ui-tooling-preview")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    // Test
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2024.05.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")

    // Navegación (NavController)
    implementation("androidx.navigation:navigation-compose:2.7.7")
    // ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.1")

    // Base de Datos (Room / SQLite)
    implementation("androidx.room:room-runtime:2.6.1")
    implementation("androidx.room:room-ktx:2.6.1") // Para Coroutines y Flow
    ksp("androidx.room:room-compiler:2.6.1") // Compilador de Room

    // Ubicación (GPS)
    implementation("com.google.android.gms:play-services-location:21.2.0")

    // Mapas (OSM)
    implementation("org.osmdroid:osmdroid-compose:1.0.0-alpha01")

    // Cámara (CameraX)
    implementation("androidx.camera:camera-core:1.3.3")
    implementation("androidx.camera:camera-camera2:1.3.3")
    implementation("androidx.camera:camera-lifecycle:1.3.3")
    implementation("androidx.camera:camera-view:1.3.3")

    // Carga de Imágenes (Coil)
    implementation("io.coil-kt:coil-compose:2.6.0")

    // Dependencias conflictivas para mapas - REVISAR
    // implementation("org.osmdroid:osmdroid-android:6.1.16")
    // implementation("com.utsman.osmandcompose:core:2.1.1")
    // implementation("org.osmdroid:osmdroid-compose:0.7.4")
    // implementation("tech.utsmankece:osmdroid-compose:0.6.1")
}