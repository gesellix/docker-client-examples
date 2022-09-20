plugins {
  `java-library`
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("de.gesellix:docker-client:2022-07-28T22-55-00")
  runtimeOnly("org.slf4j:slf4j-simple:2.0.2")
  testImplementation("org.junit.jupiter:junit-jupiter:5.9.0")
}

tasks.named<Test>("test") {
  useJUnitPlatform()
}
