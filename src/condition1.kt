fun main(args: Array<String>){

    println("Enter the age")
    val age:Int = Integer.valueOf(readLine())
    if(age>= 18){
        println("Eligible to vote")
    } else{
        println("not eligible to vote")
    }
}