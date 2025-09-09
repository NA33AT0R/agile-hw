error id: file:///C:/Users/gabri/.aGITProgrammering/agile-hw/lab2/src/main/scala/MaxFinder.scala:local7
file:///C:/Users/gabri/.aGITProgrammering/agile-hw/lab2/src/main/scala/MaxFinder.scala
empty definition using pc, found symbol in pc: 
found definition using semanticdb; symbol local7
empty definition using fallback
non-local guesses:

offset: 390
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
  

  def treeReduce(myVec:Vec):UInt={
    var x=myVec(0)
    for(w@@<- 1 to n){
      if (myVec(w)>x){
        x:=myVec(w)
      } 
    }
    x
  }

  io.max:=treeReduce(io.in)

}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 