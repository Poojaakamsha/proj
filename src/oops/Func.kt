fun main(args: Array<String>) {
    val myLambda: (Int) -> Unit = {sum : Int -> println(sum)}
    addNumber( 30 , 30, myLambda)
}
fun addNumber(num1:Int,num2:Int,myLambda: (Int)->Unit){
    val add = num1+num2
    myLambda(add)
}