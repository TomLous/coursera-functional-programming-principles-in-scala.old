package week2

object exercise_2_6 {
	val x = new Rational_2_6(1,3)             //> x  : week2.Rational_2_6 = 1/3
	val y = new Rational_2_6(5,7)             //> y  : week2.Rational_2_6 = 5/7
	val z = new Rational_2_6(3,2)             //> z  : week2.Rational_2_6 = 3/2
	
	x.add(y)                                  //> res0: week2.Rational_2_6 = 22/21
	x.neg()                                   //> res1: week2.Rational_2_6 = 1/-3
	x.sub(z)                                  //> res2: week2.Rational_2_6 = 7/-6
	x.sub(y).sub(z)                           //> res3: week2.Rational_2_6 = -79/42
	
	new Rational_2_6(2)                       //> res4: week2.Rational_2_6 = 2/1
}

class Rational_2_6(x:Int, y:Int){
	require(y != 0, "Cannot divide by 0")
	
	def this(x: Int) = this(x, 1)
	
	private def gcd(a: Int, b: Int): Int = if(b==0) a else gcd(b, a % b)
	def numer = x / gcd(x,y)
	def denom = y / gcd(x,y)
	
	def less(that: Rational_2_6) = numer * that.denom < that.numer * denom
	
	def max(that: Rational_2_6) = if( this.less(that)) that else this
	
	def add(that: Rational_2_6) =
		new Rational_2_6(
			numer * that.denom + that.numer * denom,
			denom * that.denom)
			
	def neg():Rational_2_6 = new Rational_2_6(-numer, denom)
	
	def sub(that: Rational_2_6) = add(that.neg)
		
			
	override def toString = {
		val g = gcd(numer, denom)
		numer/g + "/" + denom/g
		}
}