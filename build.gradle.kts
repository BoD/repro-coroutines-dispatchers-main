plugins {
    kotlin("multiplatform") version "1.6.21"
}

group = "com.example.myapp"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    val nativeTarget = if (System.getProperty("os.arch") == "aarch64") {
        macosArm64("native")
    } else {
        macosX64("native")
    }

    nativeTarget.apply {
        binaries {
            executable()
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
//                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2")
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.3")
            }
        }
    }
}

//configurations {
//  all {
//    resolutionStrategy {
//      force("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2-native-mt")
////        force("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.3-native-mt")
//    }
//  }
//}


// `./gradlew assemble && ./build/bin/native/debugExecutable/myapp.kexe`
