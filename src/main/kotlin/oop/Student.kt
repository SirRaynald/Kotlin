package oop

open class Student (open  var name:String,
                    open    var email:String,
                    open    var password:String){
    private var  gender:String = ""
    fun setGender(gender:String){
        this.gender = gender
    }
    private var idNumber:String = ""
    fun setIdNumber(idNumber:String){
        this.idNumber = idNumber
    }

    fun getIdNumber():String{
        return this.idNumber
    }
    fun register(){
        println("Yeah, I can register")
    }

    fun login(){
        println("Yeah, I can login")
    }

    fun logout(){
        println("Yeah, I can logout")
    }


}