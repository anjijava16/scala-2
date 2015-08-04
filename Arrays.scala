object Arrays 
{
   def main(args: Array[String]) 
   {
      var myList = Array(10,2,20,80,41,15)
      
      // find sum, small and biggest number
      var (sum, max, min) = (0,myList(0),myList(0))
      
      for (i <- 0 to (myList.length -1))
      {
          sum = sum + myList(i)
          if (myList(i)>max) max = myList(i)
          if (myList(i)<min) min = myList(i)
      }
      println("\n Sum = "+sum+"\n Max = "+max+"\n Min = "+min)
   }
}
