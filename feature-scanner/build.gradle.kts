plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdkVersion(rootProject.extra["compileSdkVersion"] as Int)

    defaultConfig {
        minSdkVersion(rootProject.extra["minSdkVersion"] as Int)
        targetSdkVersion(rootProject.extra["compileSdkVersion"] as Int)
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"))
            proguardFiles("proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(project(":module-injector"))

    implementation(project(":core-utils"))
    implementation(project(":core-db"))
    implementation(project(":core-network"))

    implementation(project(":feature-purchase-api"))

    implementation("androidx.appcompat:appcompat:1.2.0")
    // dagger
    val dagger = rootProject.extra["dagger_version"]
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation("com.google.dagger:dagger:$dagger")
    kapt("com.google.dagger:dagger-compiler:$dagger")
    // RxJava
    val rxJava = rootProject.extra["rxJava_version"]
    val rxAndroid = rootProject.extra["rxAndroid_version"]
    implementation("io.reactivex.rxjava2:rxjava:$rxJava")
    implementation("io.reactivex.rxjava2:rxandroid:$rxAndroid")
    // moxy
    val moxy = rootProject.extra["moxy_version"]
    implementation("com.github.moxy-community:moxy:$moxy")
    implementation("com.github.moxy-community:moxy-androidx:$moxy")
    kapt("com.github.moxy-community:moxy-compiler:$moxy")
    // cicerone
    val cicerone = rootProject.extra["cicerone_version"]
    implementation("ru.terrakok.cicerone:cicerone:$cicerone")
}
