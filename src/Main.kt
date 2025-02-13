val greetSeaCreatures = {println("Hello, Deep Sea Adventurer!")}

val findPearl: (Int) -> Int = {num1 -> num1 * num1}

val divideTreasure: (Double, Double) -> Double = {total_Treasure, explorers -> total_Treasure / explorers}

fun calculateDepth(depth1: Int, depth2: Int, differenceFunction: (Int, Int) -> Int): Int {
    return differenceFunction(depth1, depth2)
}
val depthDifferenceLambda: (Int, Int) -> Int = { d1, d2 -> d1 - d2 }

fun String.loud(): String = this.uppercase() + "!"

val diveMessage: (String) -> String = { it.loud() }

fun main() {
    greetSeaCreatures()
    println(findPearl(6))
    println(divideTreasure(1000.0, 5.0))
    val result = calculateDepth(1500, 800, depthDifferenceLambda)
    println(result)
    println(diveMessage("deep sea"))
}
