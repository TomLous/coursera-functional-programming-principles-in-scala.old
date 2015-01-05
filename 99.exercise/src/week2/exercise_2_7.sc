package week2

object exercise_2_7 {
	val x = new Rational_2_7(2,3)             //> x  : week2.Rational_2_7 = 2/3
	val y = new Rational_2_7(5,7)             //> y  : week2.Rational_2_7 = 5/7
	val z = new Rational_2_7(3,2)             //> z  : week2.Rational_2_7 = 3/2
	
	x + y                                     //> res0: week2.Rational_2_7 = 29/21
	-x                                        //> res1: week2.Rational_2_7 = -2/3
	x - z                                     //> res2: week2.Rational_2_7 = -5/6
	x - y -z                                  //> res3: week2.Rational_2_7 = 65/-42
	
	new Rational_2_7(2)                       //> res4: week2.Rational_2_7 = 2/1
}

class Rational_2_7(x:Int, y:Int){
	require(y != 0, "Cannot divide by 0")
	
	def this(x: Int) = this(x, 1)
	
	private def gcd(a: Int, b: Int): Int = if(b==0) a else gcd(b, a % b)
	def numer = x / gcd(x,y)
	def denom = y / gcd(x,y)
	
	def < (that: Rational_2_7) = numer * that.denom < that.numer * denom
	
	def max(that: Rational_2_7) = if( this < that) that else this
	
	def + (that: Rational_2_7) =
		new Rational_2_7(
			numer * that.denom + that.numer * denom,
			denom * that.denom)
			
	def unary_- ():Rational_2_7 = new Rational_2_7(-numer, denom)
	
	def - (that: Rational_2_7) = this + -that
		
			
	override def toString = {
		val g = gcd(numer, denom)
		numer/g + "/" + denom/g
		}
}