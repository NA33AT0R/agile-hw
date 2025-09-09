object Exercises {
  // 1. Double Elements
  def doubleElements(lst: List[Int]): List[Int] = {
    def dubla(x:Int): Int = x*2
    lst.map(dubla)

  }

  // 2. Filter Odd Numbers
  def filterOddNumbers(lst: List[Int]): List[Int] = {
    def oddout(x:Int):Boolean=(x%2==0)
    lst.filter(oddout)
  }

  // 3. Higher-Order Function
  def applyFunction[A, B](f: A => B, lst: List[A]): List[B] = {
    lst.map(f)
  }
}
