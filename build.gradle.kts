
buildscript {
    val kotlin_version by extra("1.4.30")
    val moxy_version by extra("2.1.2")
    val dagger_version by extra("2.31.2")
    val rxJava_version by extra("2.2.19")
    val rxAndroid_version by extra("2.1.1")
    val cicerone_version by extra("5.1.1")
}

allprojects {
    val minSdkVersion by extra(21)
    val compileSdkVersion by extra(30)
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}
