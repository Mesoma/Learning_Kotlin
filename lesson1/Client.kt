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
    println ("Hello World")
}
printHello()

fun addfish(){
    val fish1 = 1
    val fish2 = 1
    val fishpool = fish1 + fish2
    print(fishpool)
}
addfish()