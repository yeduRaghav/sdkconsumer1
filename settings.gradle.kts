rootProject.name = "sdkconsumer1"
include(":app")
include(":testsdk1:sdk")
include(":testsdk1:domain")
include(":testsdk1:web")

project(":testsdk1:sdk").projectDir = File("testsdk1/sdk")
project(":testsdk1:domain").projectDir = File("testsdk1/domain")
project(":testsdk1:web").projectDir = File("testsdk1/web")