plugins {
  `java-library`
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("de.gesellix:docker-client:2023-10-18T22-40-00-groovy-4")
  runtimeOnly("org.slf4j:slf4j-simple:2.0.9")
  testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
}

tasks.named<Test>("test") {
  useJUnitPlatform()
}
