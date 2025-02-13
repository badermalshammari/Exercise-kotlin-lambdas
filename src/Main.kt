// Part 1: Lambda with No Parameters – Greeting the Sea Creatures
val greetSeaCreatures = {println("Hello, Deep Sea Adventurer!")}

//Part 2: Simple Lambda Expression – Finding a Hidden Pearl
val findPearl: (Int) -> Int = {num1 -> num1 * num1}

//Part 3: Lambda with Multiple Parameters – Dividing the Treasure
val divideTreasure: (Double, Double) -> Double = {total_Treasure, explorers -> total_Treasure / explorers}

//Part 4: Higher-Order Function with Lambda – Calculating Depth
fun calculateDepth(depth1: Int, depth2: Int, differenceFunction: (Int, Int) -> Int): Int {
    return differenceFunction(depth1, depth2)
}

val depthDifferenceLambda: (Int, Int) -> Int = { d1, d2 -> d1 - d2 }

//Part 5: Lambda with Extension Functions – Diving Message
fun String.loud(): String = this.uppercase() + "!"
val diveMessage: (String) -> String = { it.loud() }

fun main() {
//    Part 1: Lambda with No Parameters – Greeting the Sea Creatures
    greetSeaCreatures()
//    Part 2: Simple Lambda Expression – Finding a Hidden Pearl
    println(findPearl(6))
//    Part 3: Lambda with Multiple Parameters – Dividing the Treasure
    println(divideTreasure(1000.0, 5.0))
//    Part 4: Higher-Order Function with Lambda – Calculating Depth
    val result = calculateDepth(1500, 800, depthDifferenceLambda)
    println(result)
//    Part 5: Lambda with Extension Functions – Diving Message
    println(diveMessage("deep sea"))
}
