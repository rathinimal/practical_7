object squ_numbers{
    
    def main(args:Array[String]): Unit ={
        val input_num = List(1,2,3,4,5)

        
        val square_numbers = input_num.map(i=>i*i)
        
        print(square_numbers)
    }
}