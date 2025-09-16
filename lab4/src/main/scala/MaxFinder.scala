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

  //you can technically also do it in one line
  //io.max:=(io.in).reduceTree((a, b) => Mux(a > b, a, b))


  //We create a Vec, so that we work with it without touching io.in
  val myVec = io.in
  
  //Create our own max value, which is set to be reduceTree() (finds the value in the tree that fullfills the process the best)
  //and we apply the logic that it should return the value larger than the others in the tree
  val max = myVec.reduceTree((a, b) => Mux(a > b, a, b))
  
  io.max := max

}
