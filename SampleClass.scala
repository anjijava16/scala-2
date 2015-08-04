
class Add
{
    def sumOf(x: Int, y: Int)
    {
      println (x+y)
    }
   
    def diffOf(x: Int, y: Int)
    {
      println (x-y)
    }
}

object SampleClass
{
   def main(args: Array[String])
   {
      val sum = new Add()
      sum.sumOf(100, 10)
      sum.diffOf(100, 10)
   }
}

