package funsets

object Main extends App {
  import FunSets._

  println("2.1 Basic Functions on Sets")
  val s1 = singletonSet(1)
  println("s1: singletonSet(1): 			" + FunSets.toString(s1))
  val s2 = singletonSet(2)
  println("s2: singletonSet(2): 			" + FunSets.toString(s2))
  val s3 = singletonSet(3)
  println("s3: singletonSet(3): 			" + FunSets.toString(s3))

  val s4 = union(s1, s2)
  println("s4: union(s1, s2):			" + FunSets.toString(s4))
  val s5 = union(s2, s3)
  println("s5: union(s2, s3):			" + FunSets.toString(s5))

  val s6 = diff(s4, s1)
  println("s6: diff(s4, s1):			" + FunSets.toString(s6))
  val s7 = intersect(s4, s5)
  println("s7: intersect(s4, s5):			" + FunSets.toString(s7))

  val s8 = union(s4, s5)
  println("s8: union(s4, s5):			" + FunSets.toString(s8))
  val s9 = filter(s8, x => x > 1)
  println("s9: filter(s8, x => x>1)		" + FunSets.toString(s9))
  val s10 = filter(s8, x => x % 2 == 1)
  println("s10: filter(s8, x => x%2==1)		" + FunSets.toString(s10))

  var s11: Set = x => x >= 2 && x <= 4
  println("s11: x => x >=2 && x <= 4  		" + FunSets.toString(s11))

  println("\n\n2.2 Queries and Transformations on Sets")
  println("forall(s11, x => x < 4):		" + forall(s11, x => x < 4))
  println("forall(s11, x => x < 5):		" + forall(s11, x => x < 5))

  println("exists(s11, x => x == 3):		" + exists(s11, x => x == 3))
  println("exists(s11, x => x == 1):		" + exists(s11, x => x == 1))

  val s12 = map(s8, x => x * x)
  println("s12: map(s8, x => x * x):		" + FunSets.toString(s12))
  val s13 = map(s11, x => x / 2)
  println("s13: map(s11, x => x / 2):		" + FunSets.toString(s13))

}
