error id: file:///C:/Users/gabri/.aGITProgrammering/agile-hw/lab2/src/main/scala/MaxFinder.scala:`<error>`#`<error>`.
file:///C:/Users/gabri/.aGITProgrammering/agile-hw/lab2/src/main/scala/MaxFinder.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/io/max.
	 -chisel3/io/max#
	 -chisel3/io/max().
	 -chisel3/util/io/max.
	 -chisel3/util/io/max#
	 -chisel3/util/io/max().
	 -io/max.
	 -io/max#
	 -io/max().
	 -scala/Predef.io.max.
	 -scala/Predef.io.max#
	 -scala/Predef.io.max().
offset: 327
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

  io.m@@ax:=treeReduce(io.in)



 
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 