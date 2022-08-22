class Product{
    var product_id:Int = 101
    var product_name: String = "laptop "
    var product_qty:Int = 10

    fun get_product_info(){
        println("${product_id} ${product_name} ${product_qty}")
    }

}
fun main(args: Array<String>){
    var p1 = Product()
    p1.get_product_info()
}


