package com.aquarium


class Aquarium(width:Int = 20, height:Int = 50, length:Int = 100) {

    var width = width
    var height = height
    var length = length

    init {
        println("This is Aquarium Class")
    }

    init {
        println("it can accure ${width*height*length/1000} L")
    }

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }
}

class Aquarium1(var width: Int = 20, var height: Int = 50, var length: Int= 100){

    init {
        println("This is Aquarium 1 class")
    }

    init {
        println("it can accure ${width*height*length/1000} L")
    }

    fun printSize(){
        println("width : $width cm \n Length : $length cm \n Height : $height cm")
    }
}
