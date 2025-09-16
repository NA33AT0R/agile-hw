import chisel3._
import chiseltest._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class MaxFinderTest extends AnyFlatSpec with ChiselScalatestTester with Matchers {
  "MaxFinder" should "find the maximum value in a Vec" in {
    test(new MaxFinder(4, 8)) { dut =>
      //  dut.io.in(0).poke(3)
      //  dut.io.in(1).poke(6)
      //  dut.io.max.expect(6)
       val testVectors = Seq(
        (Seq(3, 7, 2, 5), 7, 1),
        (Seq(10, 4, 8, 1), 10, 0),
        (Seq(0, 0, 0, 0), 0, 0),
        (Seq(1, 2, 3, 4), 4, 3)
      )
      for ((vec, expected, index) <- testVectors) {
        for (i <- vec.indices) {
          dut.io.in(i).poke(vec(i).U)
        }
        dut.io.max.expect(expected.U)
      }

    }
  }
}
