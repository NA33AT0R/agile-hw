error id: file:///C:/Users/gabri/.aGITProgrammering/agile-hw/lab2/src/main/scala/MaxFinder.scala:
file:///C:/Users/gabri/.aGITProgrammering/agile-hw/lab2/src/main/scala/MaxFinder.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb

found definition using fallback; symbol RegInit
offset: 334
uri: file:///C:/Users/gabri/.aGITProgrammering/agile-hw/lab2/src/main/scala/MaxFinder.scala
text:
```scala

import chisel3._
import chisel3.util._

/**
  * Find the maximum value in a Vec using treeReduce
  * @param n number of elements
  */
class MaxFinder(val n: Int, val width: Int) extends Module {
  val io = IO(new Bundle {
    val in = Input(Vec(n, UInt(width.W)))
    val max = Output(UInt(width.W))
  })
  io.max:=RegIn@@it(0.U)
  def treeReduce(n:Vec): Int={
   

  }

  io.max:=treeReduce(io.in)



 
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 