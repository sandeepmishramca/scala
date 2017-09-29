package com.begin

/**
  * Created by 564151 on 9/29/2017.
  */
class Frection1(n:Int,d:Int){
  println("The Nueminator is: "+n)
  println("The Denominator is :"+d)
  println(s"Fraction "+n+"/"+d+"Decimal "+(n/d))

}
object Frection {
  def main(args: Array[String]): Unit = {
    val fr = new Frection1(7,3)
  }

}
