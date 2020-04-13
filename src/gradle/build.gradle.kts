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

task("toLower") {
  doLast {
    val someString = "HOLA DESDE UDE"
    println("Original: $someString")
    println("Lower case: ${someString.toLowerCase()}")
  }
}