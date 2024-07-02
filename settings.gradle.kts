rootProject.name = "sdkconsumer1"
include(":app",":testsdk1")
project(":testsdk1").projectDir =  File("testsdk1/sdk")
 