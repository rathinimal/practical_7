object squ_numbers{
    
    def main(args:Array[String]): Unit ={
        val input_num = List(1,2,3,4,5)

        val squareIt = (n:Int)=>n*n
        val f = (op:(Int)=>Int,n:Int) => op(n)

        
        val square_numbers = input_num.map(i=>i*i)
        
        print(square_numbers)
    }
}