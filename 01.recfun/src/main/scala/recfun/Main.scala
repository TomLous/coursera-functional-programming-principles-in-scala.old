package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("1. Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
    
    println()
    println()
    println("2. Parentheses Balancing")
    var strs = List("(if (zero? x) max (/ 1 x))","I told him (that itÕs not (yet) done). (But he wasnÕt listening)", ":-)", "())(")
    strs.foreach(str => println("\"" + str + "\" match? => " + balance(str.toList)))
    
    println()
    println()
    println("3. Counting Change")
    println("Number of ways to change 4 with coins 1 & 2: "+ countChange(4, List(1,2)))
    println("Number of ways to change 100 with coins 1, 2, 5, 10, 25, 50 : "+ countChange(100, List(1,2,5, 10, 25, 50)))
    
    
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if(c == 0 || c == r) 1
    else if(c < 0 || c > r) 0
    else pascal(c-1,r-1) + pascal(c, r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def pCounter(cnt:Int, chr: Char, lst: List[Char]): Int = {
      var newCnt = cnt
      if(chr == '(') newCnt = cnt  + 1
      else if(chr == ')') newCnt = cnt  - 1

      if(newCnt < 0) newCnt
      else if(lst.isEmpty) newCnt
      else pCounter(newCnt, lst.head, lst.tail)

    }

    pCounter(0, 0, chars) == 0

  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if(money == 0) 1
    else if(money < 0 || coins.isEmpty) 0
    else countChange(money, coins.tail) + countChange(money - coins.head, coins)

  }
}
