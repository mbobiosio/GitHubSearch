import dependencies.Dependencies
import dependencies.TestDependencies

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-parcelize")
    id("kotlin-kapt")
    id("androidx.navigation.safeargs")
}

android {
    compileSdk = 31

    defaultConfig {
        minSdk = 21
        targetSdk = 31

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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    buildFeatures {
        viewBinding = true
    }

    kapt {
        correctErrorTypes = true
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(Dependencies.APPCOMPAT)
    implementation(Dependencies.MATERIAL)
    implementation(Dependencies.CONSTRAINT_LAYOUT)
    implementation(Dependencies.SWIPE_REFRESH_LAYOUT)

    implementation(Dependencies.DAGGER)
    kapt(Dependencies.DAGGER_COMPILER)

    implementation(Dependencies.NAVIGATION_UI)

    implementation(Dependencies.INTUIT_SDP)
    implementation(Dependencies.INTUIT_SSP)
    implementation(Dependencies.COIL)
    // Room
    //implementation(Dependencies.ROOM)
    //kapt ("androidx.room:room-compiler:$roomVersion")
    //androidTestImplementation ("androidx.room:room-testing:$roomVersion")
    //implementation ("androidx.room:room-ktx:$roomVersion")
    implementation(Dependencies.EPOXY)
    implementation(Dependencies.EPOXY_PROCESSOR)

    // Retrofit
    implementation(Dependencies.RETROFIT)
    implementation(Dependencies.RETROFIT_CONVERTER)
    implementation(Dependencies.LOGGING)

    // Moshi
    implementation(Dependencies.MOSHI_KTX)
    implementation(Dependencies.MOSHI_CONVERTER)
    kapt(Dependencies.MOSHI_CODEGEN)

    // Chucker
    debugImplementation(Dependencies.CHUCKER)
    releaseImplementation(Dependencies.CHUCKER_NO_OP)

    // Kotlin Coroutine
    implementation(Dependencies.COROUTINES)
    implementation(Dependencies.COROUTINES_ANDROID)

    // Lifecycle
    api(Dependencies.LIFECYCLE_VIEWMODEL)
    api(Dependencies.LIFECYCLE_LIFEDATA)

    // ViewModel KTX
    api(Dependencies.ACTIVITY_KTX)
    api(Dependencies.FRAGMENT_KTX)

    testImplementation(TestDependencies.JUNIT)
    testImplementation(TestDependencies.ANDROID_CORE_TESTING)
    testImplementation(TestDependencies.IO_MOCKK)
    testImplementation(TestDependencies.KTX_COROUTINES_TEST)
}