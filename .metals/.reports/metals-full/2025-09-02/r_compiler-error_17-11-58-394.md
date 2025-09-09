file:///C:/Users/gabri/.aGITProgrammering/agile-hw/Backex/src/main/scala/Exer.scala
### java.lang.IndexOutOfBoundsException: -1

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 354
uri: file:///C:/Users/gabri/.aGITProgrammering/agile-hw/Backex/src/main/scala/Exer.scala
text:
```scala
/*
 * A minimal compopnent to test the Chisel setup.
 *
 * Copyright: 2025, Technical University of Denmark, DTU Compute
 * Author: Martin Schoeberl (martin@jopdesign.com)
 *
 */

import chisel3._

object Hello {
  def main(args: Array[String]): Unit = {

    var mode = 0
    //println("Hello, world! " + mode)
    BinBcd.bintobcd(15,2,2,@@)
   

  }
}

object BinBcd{
  def bintobcd(n:Int, w:Int, d:Int):List[Int]={
    var bcd = 0
    bcd::0
    println(bcd)

  }

}

class Hello(n: Int = 8, m: Int = 16) extends Module {
  val io = IO(new Bundle {
    val din = Input(UInt(n.W))
    val dout = Output(UInt(m.W))
    val clear = Input(Bool())
    val enable = Input(Bool())
  })

  val accReg = RegInit(0.U(16.W))

  when(io.clear) {
    accReg := 0.U
  }.elsewhen(io.enable) {
    accReg := accReg + io.din
  }

  io.dout := accReg
}

/** An object extending App to generate the Verilog code.
  */
// object Hello extends App {
//   println("Hello World, I will now generate the Verilog file!")
//   emitVerilog(new Hello())
// }

```



#### Error stacktrace:

```
scala.collection.LinearSeqOps.apply(LinearSeq.scala:129)
	scala.collection.LinearSeqOps.apply$(LinearSeq.scala:128)
	scala.collection.immutable.List.apply(List.scala:79)
	dotty.tools.dotc.util.Signatures$.applyCallInfo(Signatures.scala:244)
	dotty.tools.dotc.util.Signatures$.computeSignatureHelp(Signatures.scala:101)
	dotty.tools.dotc.util.Signatures$.signatureHelp(Signatures.scala:88)
	dotty.tools.pc.SignatureHelpProvider$.signatureHelp(SignatureHelpProvider.scala:46)
	dotty.tools.pc.ScalaPresentationCompiler.signatureHelp$$anonfun$1(ScalaPresentationCompiler.scala:435)
```
#### Short summary: 

java.lang.IndexOutOfBoundsException: -1