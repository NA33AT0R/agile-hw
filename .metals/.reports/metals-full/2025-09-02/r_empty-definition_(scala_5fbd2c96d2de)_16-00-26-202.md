error id: file:///C:/Users/gabri/.aGITProgrammering/agile-hw/lab1/src/main/scala/owntest.scala:`<none>`.
file:///C:/Users/gabri/.aGITProgrammering/agile-hw/lab1/src/main/scala/owntest.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -jas.
	 -jas#
	 -jas().
	 -scala/Predef.jas.
	 -scala/Predef.jas#
	 -scala/Predef.jas().
offset: 466
uri: file:///C:/Users/gabri/.aGITProgrammering/agile-hw/lab1/src/main/scala/owntest.scala
text:
```scala
import scala.runtime.stdLibPatches.language.experimental.namedTypeArguments
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
    Person @@jas = 
    jas.setname("John person")
    jas.setage(21)
    jas.greet()

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

```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.