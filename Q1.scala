object even_Numbers {
    def main(args:Array[String]): Unit ={
        
        //declare given array numbers
        var num = List(1,2,3,4,5,6,7,8,9,10)

        def filterEvenNumbers(numbers:List[Int]): List[Int] = {
            numbers.filter(i=>i%2 ==0)
        }
        val output = filterEvenNumbers(num)
        println(output)
        
        
    }
}