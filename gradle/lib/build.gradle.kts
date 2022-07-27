plugins {
  `java-library`
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("de.gesellix:docker-client:2022-07-26T16-26-00")
  runtimeOnly("org.slf4j:slf4j-simple:1.7.36")
  testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")
}

tasks.named<Test>("test") {
  useJUnitPlatform()
}
