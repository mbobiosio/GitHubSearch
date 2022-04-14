package dependencies

/**
 * Project dependencies, makes it easy to include external binaries or
 * other library modules to build.
 */
object Dependencies {
    const val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${BuildDependenciesVersions.KOTLIN}"
    const val APPCOMPAT = "androidx.appcompat:appcompat:${BuildDependenciesVersions.APPCOMPAT}"
    const val MATERIAL = "com.google.android.material:material:${BuildDependenciesVersions.MATERIAL}"
    const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${BuildDependenciesVersions.COROUTINES}"
    const val COROUTINES_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${BuildDependenciesVersions.COROUTINES}"

    const val LIFECYCLE_VIEWMODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:${BuildDependenciesVersions.LIFECYCLE}"
    const val LIFECYCLE_LIFEDATA = "androidx.lifecycle:lifecycle-livedata-ktx:${BuildDependenciesVersions.LIFECYCLE}"

    const val ACTIVITY_KTX = "androidx.activity:activity-ktx:${BuildDependenciesVersions.ACTIVITY_KTX}"
    const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:${BuildDependenciesVersions.FRAGMENT_KTX}"

    const val ROOM = "androidx.room:room-runtime:${BuildDependenciesVersions.ROOM}"

    const val NAVIGATION_FRAGMENT = "androidx.navigation:navigation-fragment-ktx:${BuildDependenciesVersions.NAVIGATION}"
    const val NAVIGATION_UI = "androidx.navigation:navigation-ui-ktx:${BuildDependenciesVersions.NAVIGATION}"
    const val CORE_KTX = "androidx.core:core-ktx:${BuildDependenciesVersions.CORE_KTX}"

    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${BuildDependenciesVersions.CONSTRAINT_LAYOUT}"
    const val SWIPE_REFRESH_LAYOUT = "androidx.swiperefreshlayout:swiperefreshlayout:${BuildDependenciesVersions.SWIPE_REFRESH_LAYOUT}"
    const val DAGGER = "com.google.dagger:dagger:${BuildDependenciesVersions.DAGGER}"
    const val DAGGER_COMPILER = "com.google.dagger:dagger-compiler:${BuildDependenciesVersions.DAGGER}"

    const val TIMBER = "com.jakewharton.timber:timber:${BuildDependenciesVersions.TIMBER}"

    const val EPOXY = "com.airbnb.android:epoxy:${BuildDependenciesVersions.EPOXY}"
    const val EPOXY_PROCESSOR = "com.airbnb.android:epoxy-processor:${BuildDependenciesVersions.EPOXY}"

    const val RETROFIT = "com.squareup.retrofit2:retrofit:${BuildDependenciesVersions.RETROFIT}"
    const val RETROFIT_CONVERTER = "com.squareup.retrofit2:converter-moshi:${BuildDependenciesVersions.RETROFIT}"
    const val LOGGING = "com.squareup.okhttp3:logging-interceptor:${BuildDependenciesVersions.LOGGING}"

    const val MOSHI_KTX = "com.squareup.moshi:moshi-kotlin:${BuildDependenciesVersions.MOSHI}"
    const val MOSHI_CONVERTER = "com.squareup.retrofit2:converter-moshi:${BuildDependenciesVersions.MOSHI_CONVERTER}"
    const val MOSHI_CODEGEN = "com.squareup.moshi:moshi-kotlin-codegen:${BuildDependenciesVersions.MOSHI}"

    const val CHUCKER = "com.github.chuckerteam.chucker:library:${BuildDependenciesVersions.CHUCKER}"
    const val CHUCKER_NO_OP = "com.github.chuckerteam.chucker:library-no-op:${BuildDependenciesVersions.CHUCKER}"

    const val COIL = "io.coil-kt:coil:${BuildDependenciesVersions.COIL}"
    const val INTUIT_SDP = "com.intuit.sdp:sdp-android:${BuildDependenciesVersions.INTUIT}"
    const val INTUIT_SSP = "com.intuit.ssp:ssp-android:${BuildDependenciesVersions.INTUIT}"
}

object TestDependencies {
    const val JUNIT = "junit:junit:${BuildDependenciesVersions.JUNIT}"
    const val IO_MOCKK = "io.mockk:mockk:${BuildDependenciesVersions.MOCKK}"
    const val ANDROID_CORE_TESTING = "androidx.arch.core:core-testing:${BuildDependenciesVersions.ARCH_CORE}"
    const val KTX_COROUTINES_TEST = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${BuildDependenciesVersions.COROUTINES_TEST}"
}
