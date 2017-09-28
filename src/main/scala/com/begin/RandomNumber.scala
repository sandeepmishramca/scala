package com.begin

/**
  * Created by 564151 on 9/28/2017.
  */
object RandomNumber {

  def main(args: Array[String]): Unit = {
    val rand = math.random*100
    val greaterThanFive={
      if (rand>5) true else false

    }
    println("The result is :"+greaterThanFive)
    val isBlue={
      if(greaterThanFive) "Blue" else "Red"
    }
    println("The is "+isBlue)
  }
}
