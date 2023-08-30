import kotlinx.browser.document
import react.create
import react.dom.client.createRoot

fun main() {
    val container = document.createElement("div")
    document.body!!.appendChild(container)

    val welcome = Welcome.create {
        name = "Kotlin/JS"
    }
    createRoot(container).render(welcome)
}
//The Lines Below Were Ran In Kotlin REPL
fun printHello() {
    println ("Hello World, Number of Fish: ")
}
printHello()

fun addfish(){
    val fish1 : int = 3
    val fish2 : int = 3
    val fishpool : int = fish1 + fish2
    print(fishpool)
}
addfish()

//Output On Kotlin REPL
//Hello World, Number of Fish: 6