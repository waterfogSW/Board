import org.springframework.boot.gradle.tasks.bundling.BootJar

val jar: Jar by tasks
val bootJar: BootJar by tasks

jar.enabled = true
bootJar.enabled = false

dependencies {
    implementation(project(":board-domain"))
    implementation(project(":board-application"))

    implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.1.4")
    runtimeOnly("com.mysql:mysql-connector-j:8.0.32")
}

allOpen {
    annotation("javax.persistence.Entity")
    annotation("javax.persistence.MappedSuperclass")
    annotation("javax.persistence.Embeddable")
}

noArg {
    annotation("javax.persistence.Entity")
    annotation("javax.persistence.MappedSuperclass")
}
