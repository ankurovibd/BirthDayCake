fun main(args: Array<String>) {
    var age = 24;
    var layer = 5;
    printCakeCandles(30)
    printCakeTop(30)
    printCakeBottom(30,5)
}

fun  printCakeCandles(age: Int){
    print(" ")
    repeat(age) {
        print(",")
    }
    println()
    // Print an empty line
    print(" ")
    // Print the inset of the candles on the cake
    repeat(age) {
        print("|")
    }
    println()
}

fun printCakeTop(age: Int){
    repeat(age + 2) {
        print("=")
    }
    println()
}

fun printCakeBottom(age: Int, layers: Int){
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }
}