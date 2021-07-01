plugins {
    id("android-library-convention")
    kotlin("kapt")
}

dependencies {
    implementation(project(":module-injector"))

    implementation(project(":core-utils"))
    implementation(project(":core-db"))
    implementation(project(":core-network"))

    implementation(project(":feature-purchase-api"))

    implementation("androidx.appcompat:appcompat:1.3.0")
    // dagger
    val dagger = rootProject.extra["dagger_version"]
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation("com.google.dagger:dagger:$dagger")
    kapt("com.google.dagger:dagger-compiler:$dagger")
    // RxJava
    val rxJava = rootProject.extra["rxJava_version"]
    val rxAndroid = rootProject.extra["rxAndroid_version"]
    implementation("io.reactivex.rxjava3:rxjava:$rxJava")
    implementation("io.reactivex.rxjava3:rxandroid:$rxAndroid")
    // moxy
    val moxy = rootProject.extra["moxy_version"]
    implementation("com.github.moxy-community:moxy:$moxy")
    implementation("com.github.moxy-community:moxy-androidx:$moxy")
    kapt("com.github.moxy-community:moxy-compiler:$moxy")
    // cicerone
    val cicerone = rootProject.extra["cicerone_version"]
    implementation("com.github.terrakok:cicerone:$cicerone")
}
