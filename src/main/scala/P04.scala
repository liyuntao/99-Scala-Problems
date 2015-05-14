package org.p99.scala

/**
 * P04 (*) Find the number of elements of a list.
 * Example:
 * scala> length(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 6
 */
object P04 {
	
  def length[T](lst: List[T]): Int = {
    if(lst.isEmpty) 0 else 1 + length(lst.tail)
  }

}
