plugins {
    id("android-library-convention")
}

dependencies {
    implementation(project(":module-injector"))
    // RxJava
    val rxJava = rootProject.extra["rxJava_version"]
    val rxAndroid = rootProject.extra["rxAndroid_version"]
    implementation("io.reactivex.rxjava2:rxjava:$rxJava")
    implementation("io.reactivex.rxjava2:rxandroid:$rxAndroid")
}
