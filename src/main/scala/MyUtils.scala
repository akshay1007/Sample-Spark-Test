package com.akshay.sample

object MyUtils{
  def divide(x:Int,y:Int): Int ={
    x/y
  }

  def canVote(age:Int): Boolean ={
    if(age>18) true
    else false
  }
}
