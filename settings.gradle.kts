rootProject.name = "sdkconsumer1"
include(":app")
include(":testsdk1:sdk")
project(":testsdk1:sdk").projectDir = File("testsdk1/sdk")