plugins {
  `java-library`
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("de.gesellix:docker-client:2024-03-16T11-35-00-groovy-4")
  runtimeOnly("org.slf4j:slf4j-simple:2.0.13")
  testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
}

tasks.named<Test>("test") {
  useJUnitPlatform()
}
