error id: file:///C:/Users/gabri/.aGITProgrammering/agile-hw/lab0/src/main/scala/Hello.scala:`<none>`.
file:///C:/Users/gabri/.aGITProgrammering/agile-hw/lab0/src/main/scala/Hello.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/io/enable.
	 -chisel3/io/enable#
	 -chisel3/io/enable().
	 -io/enable.
	 -io/enable#
	 -io/enable().
	 -scala/Predef.io.enable.
	 -scala/Predef.io.enable#
	 -scala/Predef.io.enable().
offset: 528
uri: file:///C:/Users/gabri/.aGITProgrammering/agile-hw/lab0/src/main/scala/Hello.scala
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
  }.elsewhen(io.enabl@@e) {
    accReg := accReg + io.din
  }
  
  io.dout := accReg
}

/**
 * An object extending App to generate the Verilog code.
 */
object Hello extends App {
  println("Hello World, I will now generate the Verilog file!")
  emitVerilog(new Hello())
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.