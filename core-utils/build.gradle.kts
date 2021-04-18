plugins {
    id("android-library-convention")
    kotlin("kapt")
}

dependencies {
    implementation(project(":module-injector"))

    implementation("androidx.appcompat:appcompat:1.3.0-rc01")
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
}
