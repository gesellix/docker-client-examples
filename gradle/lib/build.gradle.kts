plugins {
  `java-library`
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("de.gesellix:docker-client:2024-11-29T09-10-00-groovy-4")
  runtimeOnly("org.slf4j:slf4j-simple:2.0.17")
  testImplementation("org.junit.jupiter:junit-jupiter:5.13.2")
}

tasks.named<Test>("test") {
  useJUnitPlatform()
}
