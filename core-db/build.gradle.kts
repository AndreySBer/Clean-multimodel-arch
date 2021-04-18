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
}
