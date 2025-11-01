plugins {
  `java-library`
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("de.gesellix:docker-client:2025-10-31T19-25-00-groovy-4")
  runtimeOnly("org.slf4j:slf4j-simple:2.0.17")
  testImplementation("org.junit.jupiter:junit-jupiter:6.0.1")
}

tasks.named<Test>("test") {
  useJUnitPlatform()
}
