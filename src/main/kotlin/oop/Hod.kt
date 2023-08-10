package oop

class Hod(name:String,email:String,password:String):Student(name,email, password) {

    fun suspendTeacher() {
        println("Yeah, I can suspend a Teacher")
    }

    fun scheduleMeeting(){
        println("Yeah, I can schedule a meeting")

    }

}
