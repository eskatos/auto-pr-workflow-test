description = "Dummy project and a task to update some properties file"

tasks.register<WriteProperties>("updateAgpVersions") {
    property("latests", "7.4.3,8.0.2,8.1.0-beta03,8.2.0-alpha06")
    property("nightlyBuildId", System.currentTimeMillis())
    property("nightlyVersion", "8.2.0-dev")
    destinationFile.set(layout.projectDirectory.file("agp.properties"))
}
