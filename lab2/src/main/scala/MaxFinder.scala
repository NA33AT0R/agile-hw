import chisel3._
import chisel3.util._

/** Find the maximum value in a Vec using treeReduce
  * @param n
  *   number of elements
  */
class MaxFinder(val n: Int, val width: Int) extends Module {
  val io = IO(new Bundle {
    val in = Input(Vec(n, UInt(width.W)))
    val max = Output(UInt(width.W))
  })

  var x = io.in(0)

  for (w <- 0 to n) {
    x:=io.in(w)
    when(io.max < x) {
      io.max := x
    }
  }
  print(x)
  io.max := x

}
