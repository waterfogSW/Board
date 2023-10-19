rootProject.name = "board"

include("board-domain")
include("board-application")

include(":board-framework-persistence")
project(":board-framework-persistence").projectDir = file("board-framework/persistence")

include(":board-bootstrap-api")
