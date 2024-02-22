//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


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

fun decValue(){
    val fish = 5
    val a = fish?.dec()
//    val a = fish.dec()    // you can call them instead of safe call. ? is safe call
    println(a)
}