package week2

object exercise_2_5 {
	val x = new Rational_2_5(1,3)             //> x  : week2.Rational_2_5 = 1/3
	val y = new Rational_2_5(5,7)             //> y  : week2.Rational_2_5 = 5/7
	val z = new Rational_2_5(3,2)             //> z  : week2.Rational_2_5 = 3/2
	
	x.add(y)                                  //> res0: week2.Rational_2_5 = 22/21
	x.neg()                                   //> res1: week2.Rational_2_5 = -1/3
	x.sub(z)                                  //> res2: week2.Rational_2_5 = -7/6
	x.sub(y).sub(z)                           //> res3: week2.Rational_2_5 = -79/42
}


class Rational_2_5(x:Int, y:Int){
	def numer = x
	def denom = y
	
	def add(that: Rational_2_5) =
		new Rational_2_5(
			numer * that.denom + that.numer * denom,
			denom * that.denom)
			
	def neg():Rational_2_5 = new Rational_2_5(-numer, denom)
	
	def sub(that: Rational_2_5) = add(that.neg)
		
			
	override def toString = numer + "/" + denom
}