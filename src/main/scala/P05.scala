package org.p99.scala

/**
 * P05 (*) Reverse a list.
 * Example:
 * scala> reverse(List(1, 1, 2, 3, 5, 8))
 * res0: List[Int] = List(8, 5, 3, 2, 1, 1)
 */
object P05 {
	
  def reverse[T](lst: List[T]): List[T] = {
    lst match {
      case head :: tail => reverse(tail) ::: List(head)
      case _ => Nil
    }
  }

}