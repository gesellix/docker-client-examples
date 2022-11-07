plugins {
  `java-library`
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("de.gesellix:docker-client:2022-11-07T20-55-00")
  runtimeOnly("org.slf4j:slf4j-simple:1.7.36")
  testImplementation("org.junit.jupiter:junit-jupiter:5.9.0")
}

tasks.named<Test>("test") {
  useJUnitPlatform()
}
