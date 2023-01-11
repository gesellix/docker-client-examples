plugins {
  `java-library`
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("de.gesellix:docker-client:2023-01-11T19-35-00")
  runtimeOnly("org.slf4j:slf4j-simple:2.0.5")
  testImplementation("org.junit.jupiter:junit-jupiter:5.9.1")
}

tasks.named<Test>("test") {
  useJUnitPlatform()
}
