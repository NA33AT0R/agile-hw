/*
 * A minimal compopnent to test the Chisel setup.
 *
 * Copyright: 2025, Technical University of Denmark, DTU Compute
 * Author: Martin Schoeberl (martin@jopdesign.com)
 *
 */

import chisel3._

class GenComp() extends Module {
  val io = IO(new Bundle {
    val a = Input(UInt(8.W))
    val b = Input(UInt(8.W))
    val c = Input(UInt(8.W))
    val d = Input(UInt(8.W))
    val s1 = Input(Bool())
    val s2 = Input(Bool())
    val out = Output(UInt(8.W))
  }) 

  io.out:= Mux(io.s2, Mux(io.s1,io.d,io.c), Mux(io.s1,io.b,io.a))


}

/** An object extending App to generate the Verilog code.
  */
// object Hello extends App {
//   println("Hello World, I will now generate the Verilog file!")
//   emitVerilog(new GenComp(Stuffses))
// }
