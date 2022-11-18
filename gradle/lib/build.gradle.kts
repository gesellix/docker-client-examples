plugins {
  `java-library`
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("de.gesellix:docker-client:2022-11-07T20-55-00")
  runtimeOnly("org.slf4j:slf4j-simple:2.0.4")
  testImplementation("org.junit.jupiter:junit-jupiter:5.9.1")
}

tasks.named<Test>("test") {
  useJUnitPlatform()
}
