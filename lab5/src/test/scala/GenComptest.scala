import chisel3._
import chiseltest._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class GenComptest extends AnyFlatSpec with ChiselScalatestTester with Matchers {
  "MaxFinder" should "find the maximum value in a Vec" in {
    test(new GenComp()) { dut =>
      dut.io.a.poke(5)
      dut.io.b.poke(7)
      dut.io.c.poke(9)
      dut.io.d.poke(13)
      dut.io.s1.poke(true.B)
      dut.io.s2.poke(false.B)
      dut.io.out.expect(7)
    }
  }
}
