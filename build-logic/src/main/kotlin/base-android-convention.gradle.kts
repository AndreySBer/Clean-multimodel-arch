import com.android.build.gradle.BaseExtension

configure<BaseExtension> {

    setCompileSdkVersion(rootProject.extra["compileSdkVersion"] as Int)

    defaultConfig {

        setMinSdkVersion(rootProject.extra["minSdkVersion"] as Int)
        setTargetSdkVersion(rootProject.extra["compileSdkVersion"] as Int)
        versionCode = 1
        versionName = "1.0"
        multiDexEnabled = true
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {

        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        targetCompatibility = JavaVersion.VERSION_1_8
        sourceCompatibility = JavaVersion.VERSION_1_8
    }
}