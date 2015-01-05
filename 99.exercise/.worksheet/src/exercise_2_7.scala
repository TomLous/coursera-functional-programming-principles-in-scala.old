

object exercise_2_7 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(54); 
	val x = new Rational_2_7(2,3);System.out.println("""x  : Rational_2_7 = """ + $show(x ));$skip(31); 
	val y = new Rational_2_7(5,7);System.out.println("""y  : Rational_2_7 = """ + $show(y ));$skip(31); 
	val z = new Rational_2_7(3,2);System.out.println("""z  : Rational_2_7 = """ + $show(z ));$skip(9); val res$0 = 
	
	x + y;System.out.println("""res0: Rational_2_7 = """ + $show(res$0));$skip(4); val res$1 = 
	-x;System.out.println("""res1: Rational_2_7 = """ + $show(res$1));$skip(7); val res$2 = 
	x - z;System.out.println("""res2: Rational_2_7 = """ + $show(res$2));$skip(10); val res$3 = 
	x - y -z;System.out.println("""res3: Rational_2_7 = """ + $show(res$3));$skip(23); val res$4 = 
	
	new Rational_2_7(2);System.out.println("""res4: Rational_2_7 = """ + $show(res$4))}
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
