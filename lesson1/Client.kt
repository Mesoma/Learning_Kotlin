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
fun printHello()
{
    println ("Hello World, Number of Fish: ")
}
printHello()

fun addfish()
{
    val fish1: Int = 3
    val fish2: Int = 3
    val fishpool: Int = fish1 + fish2
    print(fishpool)
}
addfish()
//Output On Kotlin REPL
//Hello World, Number of Fish: 6




//Trying from previous lesson
fun sumoftwonumbers(num1: Int, num2: Int)
{
    val sum = num1 + num2
    print(sum)
}
sumoftwonumbers(2,3)

