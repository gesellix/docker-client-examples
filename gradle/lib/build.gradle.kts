plugins {
  `java-library`
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("de.gesellix:docker-client:2022-12-06T00-40-00")
  runtimeOnly("org.slf4j:slf4j-simple:2.0.5")
  testImplementation("org.junit.jupiter:junit-jupiter:5.9.1")
}

tasks.named<Test>("test") {
  useJUnitPlatform()
}
