object prime{
    def main(args:Array[String]): Unit = {

        def isPrime(n:Int):Boolean ={
            if(n<=1) false
            else if (n==2) true
            else !(2 until n).exists(i => n % i == 0)
        }

        def filterPrime(num:List[Int]): List[Int] = {
            num.filter(n => isPrime(n))
        }

        val input_num = List(1,2,3,4,5,6,7,8,9,10)
        print(filterPrime(input_num))
    }
}