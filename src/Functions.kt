import java.util.*

fun main(args: Array<String>) {
    println("Hello, ${args[0]}")

//    Every thing has value in kotlin
//    Note: Loops are exceptions to "everything has a value." There's no sensible value for for loops or while loops, so they do not have values. If you try to assign a loop's value to something, the compiler gives an error.
    val print = println("This is expression")
    println(print)

    feedTheFish()
    val changeWater = shouldChangeWater("Monday", 31)
    println(changeWater)
}

fun feedTheFish(){
    val day = randomDay()
    var food = "Grass"
    println("Fish eat $food at $day")

   when(day){
       "Monday" -> food="flakes"
       "Tuesday" -> food="pellets"
       "Wednesday" -> food="redworms"
       "Thursday" -> food="granules"
       "Friday" -> food="mosquitoes"
       else -> food = "Grass"

    }
    println("Today is $day and the fish eat $food")
}

fun randomDay(): String {

    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]

}
fun shouldChangeWater(day:String, temperature: Int = 20, dirty: Int = 20 ): Boolean{

    return when{
        temperature > 30 -> true
        dirty > 25 -> true
        day == "Sunday" -> true
        else -> false
    }
}
