fun main(args: Array<String>) {
    avg(10,30.5,10.5f)
    println(solution("Raynald"))
}

fun avg(x:Int, y:Double){
    val jibu =(x+y) / 2.0
    println("Your avg1 answer is $jibu")
}


fun avg(x:Int, y: Double, z:Float){
    val jibu = (x+y+z) / 3.0
    println("Your avg2 answer is $jibu")

}


// Create a function to determine that
// the value submitted by a user
// is a palindrome

fun solution(inputString: String): Boolean{
    if (inputString.reversed()== inputString){
        return true
    }else{
        return false
    }
}

