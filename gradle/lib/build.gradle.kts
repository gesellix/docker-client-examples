plugins {
  `java-library`
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("de.gesellix:docker-client:2022-05-05T20-38-00")
  runtimeOnly("org.slf4j:slf4j-simple:1.7.36")
  testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
}

tasks.named<Test>("test") {
  useJUnitPlatform()
}
