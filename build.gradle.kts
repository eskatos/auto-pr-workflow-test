tasks.register<WriteProperties>("updateSomething") {
    property("same", "always")
    property("changing", System.currentTimeMillis())
    destinationFile.set(layout.projectDirectory.file("some.properties"))
}
