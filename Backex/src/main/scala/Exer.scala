/*
 * A minimal compopnent to test the Chisel setup.
 *
 * Copyright: 2025, Technical University of Denmark, DTU Compute
 * Author: Martin Schoeberl (martin@jopdesign.com)
 *
 */

import chisel3._

object Hello extends App {

  var mode = 0
  println("Hello, world!")
  // BinBcd.bintobcd(15,2,2)
  println(BinBcd.bintobcd(15, 2, 2))
  
}

object BinBcd {
  def bintobcd(b: Int, w: Int, d: Int): List[Int] = {
    val bcd = List(b, w, d)
    bcd

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
