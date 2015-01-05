package week2

object exercise_2_5 {
	val x = new Rational(1,3)                 //> x  : week2.Rational = 1/3
	val y = new Rational(5,7)                 //> y  : week2.Rational = 5/7
	val z = new Rational(3,2)                 //> z  : week2.Rational = 3/2
	
	x.add(y)                                  //> res0: week2.Rational = 22/21
	x.neg()                                   //> res1: week2.Rational = -1/3
	x.sub(z)                                  //> res2: week2.Rational = -7/6
	x.sub(y).sub(z)                           //> res3: week2.Rational = -79/42
}

class Rational(x:Int, y:Int){
	def numer = x
	def denom = y
	
	def add(that: Rational) =
		new Rational(
			numer * that.denom + that.numer * denom,
			denom * that.denom)
			
	def neg():Rational = new Rational(-numer, denom)
	
	def sub(that: Rational) = add(that.neg)
		
			
	override def toString = numer + "/" + denom
}