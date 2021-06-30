
buildscript {
    val kotlin_version by extra("1.5.20")
    val moxy_version by extra("2.2.2")
    val dagger_version by extra("2.37")
    val rxJava_version by extra("3.0.13")
    val rxAndroid_version by extra("3.0.0")
    val cicerone_version by extra("7.0")
}

allprojects {
    val minSdkVersion by extra(21)
    val compileSdkVersion by extra(30)
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}
