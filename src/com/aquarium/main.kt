package com.aquarium

fun main (){
    buildAquarium()

}
fun buildAquarium(){
    val aquarium = Aquarium()
    aquarium.printSize()

    val aquarium1 = Aquarium1()
    aquarium1.printSize()

    val aquarium2 = Aquarium1(width = 30)
    aquarium2.printSize()

    val aquarium3 = Aquarium1(width = 40, height = 60)
    aquarium3.printSize()

    val aquarium4 = Aquarium1(width = 50, height = 70, length = 770)
    aquarium4.printSize()
}