// Taking Functions as Parameters
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y);
}

// Returning Functions
fun operation(): (Int) -> Int {
    return ::square;
}
fun square(x: Int) = x * x;


fun main() {
    val mulResult = calculate(4, 5) {a, b -> a * b}
    println("4 * 5 = $mulResult");

    val func = operation()(100);
    println(func)
}