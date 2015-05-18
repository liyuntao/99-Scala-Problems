package org.p99.scala

/**
 * P08 (**) Eliminate consecutive duplicates of list elements.
 * If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
 * Example:
 * scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
 * res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
 */
object P08 {

  def compress[T](lst: List[T]): List[T] = {
    lst match {
      case List(a) => lst
      case List(a, b, _*) => if (a == b) compress(lst.tail) else a :: compress(lst.tail)
      case _ => Nil
    }
  }

}
