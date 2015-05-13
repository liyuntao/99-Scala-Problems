package org.p99.scala

/**
 * P02 (*) Find the last but one element of a list.
 * Example:
 * scala> penultimate(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 5
 */
object P02 {

  def penultimate[T](lst: List[T]): T = {
    lst match {
      case Nil => throw new NoSuchElementException("List is empty")
      case List(a) => throw new IllegalArgumentException("List has only one element")
      case x :: List(a) => x
      case x :: tail => penultimate(tail)
    }
  }

}
