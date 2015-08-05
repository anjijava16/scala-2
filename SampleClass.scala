
class Operations
{
    def sumOf(x: Int, y: Int)
    {
      println (" Sum = " + (x+y))
    }
   
    def diffOf(x: Int, y: Int)
    {
      println (" Difference = " + (x-y))
    }
}


object SampleClass
{
   def main(args: Array[String])
   {
      val sum = new Operations()
      sum.sumOf(100, 10)
      sum.diffOf(100, 10)
   }
}

