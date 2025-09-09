error id: file:///C:/Users/gabri/.aGITProgrammering/agile-hw/lab2/src/test/scala/MaxFinderTest.scala:_empty_/`<error: <none>>`.
file:///C:/Users/gabri/.aGITProgrammering/agile-hw/lab2/src/test/scala/MaxFinderTest.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/org/scalatest.
	 -chiseltest/org/scalatest.
	 -org/scalatest.
	 -scala/Predef.org.scalatest.
offset: 97
uri: file:///C:/Users/gabri/.aGITProgrammering/agile-hw/lab2/src/test/scala/MaxFinderTest.scala
text:
```scala
import chisel3._
import chiseltest._
import org.scalatest.flatspec.AnyFlatSpec
import org.scal@@atest.matchers.should.Matchers

class MaxFinderTest extends AnyFlatSpec with ChiselScalatestTester with Matchers {
  "MaxFinder" should "find the maximum value in a Vec" in {
    test(new MaxFinder(4, 8)) { dut =>
      val testVectors = Seq(
        (Seq(3, 7, 2, 5), 7),
        (Seq(10, 4, 8, 1), 10),
        (Seq(0, 0, 0, 0), 0),
        (Seq(1, 2, 3, 4), 4)
      )
      for ((vec, expected) <- testVectors) {
        for (i <- vec.indices) {
          dut.io.in(i).poke(vec(i).U)
        }
        dut.io.max.expect(expected.U)
      }
    }
  }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 