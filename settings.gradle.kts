rootProject.name = "sdkconsumer1"
include(":app")

// Include testsdk1 as a composite build
includeBuild("testsdk1") {
    dependencySubstitution {
        substitute(module("org.thvc:sdk")).using(project(":sdk"))
        substitute(module("org.thvc:domain")).using(project(":domain"))
        substitute(module("org.thvc:web")).using(project(":web"))
    }
}