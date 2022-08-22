fun main(args: Array<String>) {
    println("Enter Percentage:")

    var percentage:Int = Integer.valueOf(readLine())

    if(percentage >=85 && percentage<=100){
        println("dist class!!!")
    }else if(percentage >=60 && percentage<=85){
        println("first class")
    }else if(percentage >=35 && percentage<=68){
        println("pass class")
    }else if(percentage >=0 && percentage<=35){
        println("fail class")
    }
}