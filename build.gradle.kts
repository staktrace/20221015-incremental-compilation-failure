buildscript {
  dependencies {
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20")
  }
}

apply(plugin = "kotlin")

dependencies {
  add("implementation", fileTree(".") { include("*.jar") })
  add("implementation", "com.squareup.wire:wire-grpc-client:4.4.2")
}

val compileKotlin by tasks.getting(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class) {
  kotlinOptions{
    jvmTarget = "17"
    javaParameters = true
  }
}
