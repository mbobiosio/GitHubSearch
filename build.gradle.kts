// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    dependencies {
        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:2.3.5")
    }
}

plugins {
    id ("com.android.application") version ("7.1.1") apply false
    id ("com.android.library") version ("7.1.1") apply false
    id ("org.jetbrains.kotlin.android") version ("1.5.30") apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
/*

ext {
    kotlinVersion = ("1.5.31")
    coreKtxVersion = '1.7.0'
    appCompatVersion = '1.4.1'
    materialVersion = '1.5.0'
    constraintLayoutVersion = '2.1.3'
    legacySupportVersion = '1.0.0'
    junitVersion = '4.13.2'
    mockkVersion = '1.12.0'
    coreTestingVersion = '2.1.0'
    roomVersion = '2.4.1'
    retrofitVersion = '2.9.0'
    loggingInterceptorVersion = '4.9.0'
    timberVersion = '5.0.1'
    moshiVersion = '1.12.0'
    converterMoshiVersion = '2.9.0'
    moshiCodegenVersion = '1.12.0'
    kotlinCoroutinesVersion = '1.6.0'
    kotlinCoroutinesTestVersion = '1.6.0'
    activityKtxVersion = '1.4.0'
    fragmentKtxVersion = '1.4.1'
    navigationFragmentVersion = '2.4.1'
    navigationUiVersion = '2.4.1'
    lifecycleVersion = '2.4.1'
    daggerVersion = '2.41'
    epoxyVersion = '4.6.3'
    glideVersion = '4.13.0'
    chuckerVersion = '3.5.2'
    circleImageVersion = '3.1.0'
    intuit = '1.0.6'
    coil = '2.0.0-rc03'
}*/
