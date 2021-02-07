plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdkVersion(rootProject.extra["compileSdkVersion"] as Int)
    defaultConfig {
        applicationId = "com.example.eugene_matsyuk.dagger_arch"
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(project(":module-injector"))

    implementation(project(":core-utils"))
    implementation(project(":core-db"))
    implementation(project(":core-network"))

    implementation(project(":feature-scanner"))
    implementation(project(":feature-antitheft"))
    implementation(project(":feature-purchase-impl"))
    implementation(project(":feature-purchase-api"))


    val cicerone = rootProject.extra["cicerone_version"]
    val dagger = rootProject.extra["dagger_version"]
    val moxy = rootProject.extra["moxy_version"]
    val rxJava = rootProject.extra["rxJava_version"]
    val rxAndroid = rootProject.extra["rxAndroid_version"]


    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
    // cicerone
    implementation("ru.terrakok.cicerone:cicerone:$cicerone")
    // dagger
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation("com.google.dagger:dagger:$dagger")
    kapt("com.google.dagger:dagger-compiler:$dagger")
    // moxy
    implementation("com.github.moxy-community:moxy:$moxy")
    implementation("com.github.moxy-community:moxy-androidx:$moxy")
    kapt("com.github.moxy-community:moxy-compiler:$moxy")
    // RxJava
    implementation("io.reactivex.rxjava2:rxjava:$rxJava")
    implementation("io.reactivex.rxjava2:rxandroid:$rxAndroid")
}
