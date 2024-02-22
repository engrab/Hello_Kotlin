//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    /*Summary
    Kotlin is very similar to other languages when it comes to the basics like operators, lists, and loops, but there are some important differences.

    The following features may be different in Kotlin than what you're used to in other languages:

    Kotlin types can't be implicitly converted—use casting.
    Variables declared with val can only be assigned once.
    Kotlin variables are not nullable by default. Use ? to make variables nullable.
    With Kotlin, you can loop through the index and elements of an array at the same time in a for loop.
    The following Kotlin programming constructs are similar to those in other languages:

    Arrays and lists can have a single type or mixed types.
    Arrays and lists can be nested.
    You can create loops with for, while, do/while, and repeat.
    The when statement is Kotlin's version of the switch statement, but when is more flexible.
*/
    ifelse()
    whenstatement()
    elvisNullSafety()
    listFun()
    arrayFun()
    loopsFun()
}
fun ifelse(){
    val fish = 50
    if (fish ==0){
        println("tank is empty")
    }else if (fish <40){
        println("fish is enough in tank")
    }else{
        println("tank is filled with fishes")
    }


}
fun whenstatement(){
    val fish = 50
    when(fish){
        0 -> println("tank is empty")
        in 1..40 -> println("tank is enough in tank")
        else -> println("tank is filled with fishes")
    }
}

fun elvisNullSafety(){

    val fish = 5
    val a = fish?.dec()
//    val a = fish.dec()    // you can call them instead of safe call. ? is safe call
    println(a)

    // elvis operator
    val b = a?.dec() ?: 0
    println(b)
}

fun listFun(){
    // immuteable list
    val animal = listOf("dog", "cat", "cow", "camel")
    println(animal)

    // mutable list
    val name = mutableListOf("khan", "ali", "ayliya", "pakistan", "multan")
    name.remove("khan")
    name.removeAt(0)
    name.add("india")
    println(name)

    // list contain different type of data
    val a = listOf("khan", 1, 2, "pakistan", 'c')
    println(a)


}
fun arrayFun(){

    // element of array show when convert to string
    val number = arrayOf(1,2,5,4,3, "khan", "pakistan")
    println(java.util.Arrays.toString(number))


    val interger = intArrayOf(1,2,3,4)
    println(java.util.Arrays.toString(interger))


//    One nice feature of Kotlin is that you can initialize arrays with code instead of initializing them to 0. Try this example:
    val a = Array(5){
        it*3
    }
    println(java.util.Arrays.toString(a))
}

fun loopsFun(){

    // for loop
    val a = arrayOf("shark", "rao", "star")
    for (fish in a)
        println(fish)

//    while loop
    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println("$bubbles bubbles in the water\n")
//    do while loop
    do {
        bubbles--
        println("$bubbles bubbles in the water\n")
    } while (bubbles > 50)

}