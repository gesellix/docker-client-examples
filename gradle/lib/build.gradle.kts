plugins {
  `java-library`
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("de.gesellix:docker-client:2025-11-30T22-30-00-groovy-4")
  runtimeOnly("org.slf4j:slf4j-simple:2.0.18")
  testImplementation("org.junit.jupiter:junit-jupiter:6.1.0")
}

tasks.named<Test>("test") {
  useJUnitPlatform()
}
