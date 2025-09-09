
object Hello {
  def main(args: Array[String]): Unit = {
    // println("Hello, world!")
    // println(Try.add(4, 1))
    // val pi = 3.14
    // var counter = 0
    // counter = counter + 1
    // println(counter)
    // println(Try.fib(6))
    // val numbers = List(1, 2, 3, 4, 5)
    // println(numbers(1))
    // val numb2 = numbers :+ 7
    // println(numb2)
    // val kam=Person()
    // kam.setname("John person")
    // kam.setage(21)
    // kam.greet()

  }
}

object Try {
  def add(a: Int, b: Int): Int = {
    a + b
  }
  def fib(n: Int): Int = {
    if (n <= 0) {
      0
    } else if (n == 1) {
      1
    } else {
      fib(n - 1) + fib(n - 2)
    }

  }

}
class Person {
  var name = ""
  var age = 0

  def setname(v: String) = {
    name = v
  }
  def setage(v: Int) = {
    age = v
  }
  def greet() = {
    println("Hello " + name + " you are " + age + " years old")
  }
}
