fun main(){

    eagerFilter()
    sequenceFilter()
    mapFilter()
    mapFilterAsSequence()
}

fun eagerFilter(){

    val decoration = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    val eager: List<String> = decoration.filter { it [0] == 'p' }
    println("eager $eager")

}
fun sequenceFilter(){
    val decoration = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    val lazyFilter: Sequence<String> = decoration.asSequence().filter { it [0] == 'p' }
    println("sequence $lazyFilter")
    println("sequence ${lazyFilter.toList()}")
}

fun mapFilter(){
    val decoration = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    val map: Sequence<String> = decoration.asSequence().map {
        println("access $it")
        it
    }
    println("map is ${map.toList()}")

}

fun mapFilterAsSequence(){
    val decoration = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
   val lazyFilter: Sequence<String> = decoration.asSequence().filter { it[0] == 'p' }.map {
        println("access $it")
       it
    }
    println("filtered ${lazyFilter.toList()}")
}