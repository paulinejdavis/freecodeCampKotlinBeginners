val name: String = "Ducky"
//top level variable
var greeting: String? = null

fun main() {
    //println("Hello Kotlin!")
    //local variable in current scope
    greeting = "Hola!"
    if(greeting != null) {
        println(greeting)
    } else {
    println(name)
}

//types in kotlin are non null by default need to add a ? after string
//kotlin recognises the type value of a variable null can not be a value of non null string literabl