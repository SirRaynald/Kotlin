fun main(args: Array<String>) {
    //Inbuilt functions
    var greeting = "Hello there"
    println(greeting.uppercase())
    println(greeting.lowercase())
    println(greeting.reversed())
    println(greeting.replace("there", "King"))

    var number = 10.0
    println(Math.pow(number, 2.0))

    //println(sqrt(number))

    //User defined functions
    motto()
    mission()
    addition(10,20)
    avg(1.5, 10, 1.2f)
    println(sum(10,30.0))
    println(userName("Ferdinand", "Ngatu"))

}

fun motto(){
    println(" Our motto")
}

fun mission(){
    println("Mission statement")
}

fun addition(x:Int, y:Int){
    var z = x+y
    println("Your answer is $z")
}
fun avg(x:Double, y:Int, z:Float){
    var average = (x + y + z ) / 3.0
    println("Your answer is $average")
}

fun sum(x:Int ,y:Double):Double= x + y


fun userName(firstName: String, lastName:String):String{
    var fullName = "$firstName $lastName"
    return fullName
}