plugins {
    id("android-library-convention")
}

dependencies {
    implementation(project(":module-injector"))
    // RxJava
    val rxJava = rootProject.extra["rxJava_version"]
    val rxAndroid = rootProject.extra["rxAndroid_version"]
    implementation("io.reactivex.rxjava3:rxjava:$rxJava")
    implementation("io.reactivex.rxjava3:rxandroid:$rxAndroid")
}
