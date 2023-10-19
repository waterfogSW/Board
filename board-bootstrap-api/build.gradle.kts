dependencies {
    implementation(project(":board-domain"))
    implementation(project(":board-application"))
    implementation(project(":board-framework-persistence"))

    implementation("org.springframework.boot:spring-boot-starter-web:3.1.4")
    implementation("org.springframework.boot:spring-boot-starter-validation:3.1.4")
    implementation("org.springframework.boot:spring-boot-starter-actuator:3.1.4")
    implementation("org.springframework.boot:spring-boot-starter-aop:3.1.4")

    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.14.2")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.14.2")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.14.2")

    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.2.0")
    developmentOnly("org.springframework.boot:spring-boot-devtools:3.1.4")
    developmentOnly("org.springframework.boot:spring-boot-docker-compose")
}
