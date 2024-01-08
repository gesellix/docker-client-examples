plugins {
  `java-library`
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("de.gesellix:docker-client:2023-12-01T19-40-00-groovy-4")
  runtimeOnly("org.slf4j:slf4j-simple:2.0.11")
  testImplementation("org.junit.jupiter:junit-jupiter:5.10.1")
}

tasks.named<Test>("test") {
  useJUnitPlatform()
}
