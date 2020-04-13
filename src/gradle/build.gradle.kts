task("hello") {
  doLast {
    println("UDE")
  }
}

val helloGradle = task("helloGradle") {
  doLast {
    println("Hello Gradle!")
  }
}

task("fromUDE") {
  dependsOn(helloGradle)
  doLast {
    println("I'm from UDE")
  }
}