plugins {
    id("com.android.application")
}

android {
    namespace = "net.idscan.android.dlparserandroidexample"

    compileSdk = 36

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    defaultConfig {
        minSdk = 21
        targetSdk = 36

        applicationId = "net.idscan.android.dlparserandroidexample"
        versionCode = 103000
        versionName = "1.30.0"
    }

    buildTypes {
        getByName("debug") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.7.1")
    implementation("com.google.android.material:material:1.13.0")
    implementation("net.idscan.components.android:dlparser-standard:1.30.0")
}
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}
