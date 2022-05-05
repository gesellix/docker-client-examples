plugins {
  `java-library`
}

repositories {
  fun findProperty(s: String) = project.findProperty(s) as String?
  listOf(
    "docker-client/*",
    "gesellix/*"
  ).forEach { repo ->
    maven {
      name = "github"
      setUrl("https://maven.pkg.github.com/$repo")
      credentials {
        username = System.getenv("PACKAGE_REGISTRY_USER") ?: findProperty("github.package-registry.username")
        password = System.getenv("PACKAGE_REGISTRY_TOKEN") ?: findProperty("github.package-registry.password")
      }
    }
  }
  mavenCentral()
}

dependencies {
  implementation("de.gesellix:docker-client:2022-05-05T07-34-35")
  runtimeOnly("org.slf4j:slf4j-simple:1.7.31")
  testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
}

tasks.named<Test>("test") {
  useJUnitPlatform()
}
