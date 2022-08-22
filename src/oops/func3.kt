fun main(args: Array<String>){

    val myLambda: (Int) -> Unit = {sum : Int -> println(sum)}
    val product : (Int,Int) -> Unit = {x:Int,y:Int -> println(x * y)}
    val display : (String) -> Unit = {msg: String -> println("welcome to lamdas!!!" )}
    val add:(Int,Int)->Int = add@{ x:Int,y:Int -> return@add x+y }

    addNumber(30,30, myLambda)
    product(20,30)
    display("Learning kotlin")
    val res = add(50,50)
    println("Number is: "+res);
}