fun main(args:Array<String>) {
    addition()
    substraction( 50,   30)
    mul(3,6)
}
fun addition(){
    var num1 = 30;
    var num2 = 60;
    var res = num1+num2

    println("sum of two numbers:" +res)
}
fun substraction(num1:Int,num2:Int){
    var res= num1 - num2;
    println("diff of two numbers is: "+res)


}
fun mul(num1: Int,num2: Int){
    var res = num1 * num2
    println("the product is :" +res )
}