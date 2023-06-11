val ktorVersion = "1.5.0"
val coroutineVersion = "1.4.2"


plugins {
    kotlin("multiplatform")
    id("com.android.library")
    kotlin("plugin.serialization")

}

kotlin {
    android {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-stdlib-common")
                implementation(
                    "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutineVersion")
                implementation(
                    "org.jetbrains.kotlinx:kotlinx-serialization-json:1.0.1")
                implementation("io.ktor:ktor-client-core:$ktorVersion")
            }
        }
// 2
        val androidMain by getting {
            dependencies {
                implementation("androidx.core:core-ktx:1.2.0")
                implementation(
                    "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutineVersion")
                implementation("io.ktor:ktor-client-android:$ktorVersion")
            }
        }
// 3
        val iosMain by getting {
            dependencies {
                implementation("io.ktor:ktor-client-ios:$ktorVersion")
            }
        }
    }
}

android {
    namespace = "com.example.mytesta"
    compileSdk = 33
    defaultConfig {
        minSdk = 24
        targetSdk = 33
    }
}