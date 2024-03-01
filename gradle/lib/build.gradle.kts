plugins {
  `java-library`
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("de.gesellix:docker-client:2024-02-22T07-50-00-groovy-4")
  runtimeOnly("org.slf4j:slf4j-simple:2.0.12")
  testImplementation("org.junit.jupiter:junit-jupiter:5.10.1")
}

tasks.named<Test>("test") {
  useJUnitPlatform()
}
