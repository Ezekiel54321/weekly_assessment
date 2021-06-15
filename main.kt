fun main(){



//print out number 1 to 100
//for(i in 1..100) {
  //  println(i)
//}

//print 1 to 10 without printing 4 and 5
   // for(i in 1..10 ) {
   //     if(i == 4){
   //         continue
   //     }
   //     if (i == 5){
   //         continue
   //     }
    //    println(i)
        //    }


    //Program to display both odd and even numbers with one loop
   // var numbers: Array<Int> = arrayOf(10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30)
      //    evenORprime(numbers)


     var Animaltype = Animal(animalname = "lion")
println("anmimal name is ${Animaltype.Name}")
    println("anmimal Gene is ${Animaltype.Gene}")
    println("anmimal Age is ${Animaltype.Age}")
    println("anmimal Feed is ${Animaltype.Feed}")
    println("anmimal Class is ${Animaltype.Class}")



}

//fun evenORprime(number : Array<Int>){
  //  for(number in number ) {
   //     if(number % 2 == 0)
   //         println("$number  is an Even Number")
    //    else
     //           println("$number is an Odd Number")
   // }
//}

class Animal(animalname: String){
    var Name =  animalname
    var Gene = "felix catus"
    var Age = 20
    var Feed = "meat"
    var Class = "wild"

}
class Clan (eye: String ){
    var name = "Uchiha"
    var Sign = "RedOrb"
    var Ability = eye
    var Duty = "Guards"
    var Elder = "Madara"
}






