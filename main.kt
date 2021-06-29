fun main(args: Array<String>) {
    Evenlyspaced(a = 2, b = 4, c = 6)
    println()
}
fun Evenlyspaced(a:Int, b:Int, c:Int): Boolean {
    return ((a + b) == 2 * c) || ((a + c) == 2 * b) || ((b + c) == 2 * a)
    println()
}

