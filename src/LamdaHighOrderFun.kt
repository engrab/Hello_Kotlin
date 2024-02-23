fun main(){
   /* Summary
    Compact functions, or single-expression functions, can make your code more readable. For example: fun isTooHot(temperature: Int) = temperature > 30
    You've learned some basics about filters, which use lambda expressions. For example: val beginsWithP = decorations.filter { it [0] == 'p' }
    A lambda expression is an expression that makes an unnamed function. Lambda expressions are defined between curly braces {}.
    In a higher-order function, you pass a function such as a lambda expression to another function as data. For example: dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}
*/
    lambdaFun()

    val dirty = 30
    val waterFilter: (Int) -> Int = { dirty: Int -> dirty/2}
    println("High Order with Lambda Fun : ${highOrderFun(dirty, waterFilter)}")

   // Note: Kotlin prefers that any parameter that takes a function is the last parameter. When working with higher-order functions, Kotlin has a special syntax, called the last parameter call syntax, which lets you make the code even more concise. In this case, you can pass a lambda for the function parameter, but you don't need to put the lambda inside the parentheses.
    val highOrderFun = highOrderFun(dirty) { dirty: Int -> dirty / 2 }

    println("High Order with Lambda Fun but lambda out side paratheses $highOrderFun")
    regularFun()
}

fun regularFun() {
    //single-expression functions
    fun dirtyLevel(dirty: Int) = dirty +1

    println("High Order Fun with regular : ${highOrderFun(30, ::dirtyLevel)}")
}

fun highOrderFun(dirty: Int, operation: (Int) -> Int): Int {

    return operation(dirty)

}

fun lambdaFun() {

    var dirtyLevel = 20
    val waterLevel: (Int) -> Int = { dirty: Int -> dirty/2}
    println("Lambda Fun : ${waterLevel(dirtyLevel)}")
}

