fun main(args: Array<String>) {
    for (i in 1..100) {
        println(i)
        if (i % 3 == 0 && i % 5 == 0)
            println("FizzBuzz")
        else if (i % 3 == 0)
            println("Fizz")
        else if (i % 5 == 0)
            println("Buzz")


        StringReverse("Start to finish")


    }
}

fun StringReverse(Word: String): String{
    return (Word)
    StringReverse(Word.substring(1) + Word[0])
   }







