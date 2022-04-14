import dependencies.Dependencies
import dependencies.TestDependencies

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-android")
    id("kotlin-kapt")
    id("kotlin-parcelize")
    id("androidx.navigation.safeargs")
}

android {
    compileSdk = 31

    defaultConfig {
        applicationId = "com.mbobiosio.githubsearch"
        minSdk = 21
        targetSdk = 31
        versionCode = 1
        versionName = "1.0.0"

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
    implementation(Dependencies.CORE_KTX)
    implementation(Dependencies.APPCOMPAT)
    implementation(Dependencies.MATERIAL)
    implementation(Dependencies.CONSTRAINT_LAYOUT)
    implementation(Dependencies.NAVIGATION_UI)
    implementation(Dependencies.NAVIGATION_FRAGMENT)

    implementation(Dependencies.DAGGER)
    kapt(Dependencies.DAGGER_COMPILER)

    implementation(Dependencies.EPOXY)
    implementation(Dependencies.EPOXY_PROCESSOR)

    implementation(Dependencies.COIL)
    implementation(Dependencies.INTUIT_SDP)
    implementation(Dependencies.INTUIT_SSP)
    implementation(Dependencies.TIMBER)

    implementation (project (":core"))

    testImplementation(TestDependencies.JUNIT)
    testImplementation(TestDependencies.ANDROID_CORE_TESTING)
    testImplementation(TestDependencies.IO_MOCKK)
    testImplementation(TestDependencies.KTX_COROUTINES_TEST)
}