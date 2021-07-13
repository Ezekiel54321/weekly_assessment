fun main(args: Array<String>) {
        println(petals(7,3))
    }
    fun petals(timmy:Int,sarah:Int):Boolean{
        if ((timmy %2==0) .xor (sarah %2==0)) return true
        return false
    }