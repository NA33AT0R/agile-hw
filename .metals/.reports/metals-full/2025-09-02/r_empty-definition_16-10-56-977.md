error id: file:///C:/Users/gabri/.aGITProgrammering/agile-hw/lab1/src/test/scala/ExercisesTest.scala:`<none>`.
file:///C:/Users/gabri/.aGITProgrammering/agile-hw/lab1/src/test/scala/ExercisesTest.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb

found definition using fallback; symbol AnyFunSuite
offset: 83
uri: file:///C:/Users/gabri/.aGITProgrammering/agile-hw/lab1/src/test/scala/ExercisesTest.scala
text:
```scala
import org.scalatest.funsuite.AnyFunSuite

class ExercisesTest extends AnyFunSuit@@e {
  import Exercises._

  test("doubleElements doubles each element") {
    assert(doubleElements(List(1, 2, 3)) == List(2, 4, 6))
    assert(doubleElements(Nil) == Nil)
  }

  test("filterOddNumbers removes odd numbers") {
    assert(filterOddNumbers(List(1, 2, 3, 4, 5)) == List(2, 4))
    assert(filterOddNumbers(List(1, 3, 5)) == Nil)
    assert(filterOddNumbers(List(2, 4, 6)) == List(2, 4, 6))
  }

  test("applyFunction applies a function to each element") {
    assert(applyFunction((x: Int) => x * x, List(1, 2, 3)) == List(1, 4, 9))
    assert(applyFunction((s: String) => s.toUpperCase, List("a", "b")) == List("A", "B"))
  }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.