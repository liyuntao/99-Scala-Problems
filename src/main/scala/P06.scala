package org.p99.scala

/**
 * P06 (*) Find out whether a list is a palindrome.
 * Example:
 * scala> isPalindrome(List(1, 2, 3, 2, 1))
 * res0: Boolean = true
 */
object P06 {
	
  def isPalindrome[T](lst: List[T]): Boolean = {
    lst match {
      case Nil => false
      case List(a) => true
      case List(a, b) => a == b
      case list => isPalindrome(lst.drop(1).dropRight(1))
    }
  }

}
