package week2

object exercise_2_6 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(67); 
	val x = new Rational_2_6(1,3);System.out.println("""x  : week2.Rational_2_6 = """ + $show(x ));$skip(31); 
	val y = new Rational_2_6(5,7);System.out.println("""y  : week2.Rational_2_6 = """ + $show(y ));$skip(31); 
	val z = new Rational_2_6(3,2);System.out.println("""z  : week2.Rational_2_6 = """ + $show(z ));$skip(12); val res$0 = 
	
	x.add(y);System.out.println("""res0: week2.Rational_2_6 = """ + $show(res$0));$skip(9); val res$1 = 
	x.neg();System.out.println("""res1: week2.Rational_2_6 = """ + $show(res$1));$skip(10); val res$2 = 
	x.sub(z);System.out.println("""res2: week2.Rational_2_6 = """ + $show(res$2));$skip(17); val res$3 = 
	x.sub(y).sub(z);System.out.println("""res3: week2.Rational_2_6 = """ + $show(res$3));$skip(23); val res$4 = 
	
	new Rational_2_6(2);System.out.println("""res4: week2.Rational_2_6 = """ + $show(res$4))}
}

class Rational_2_6(x:Int, y:Int){
	require(y != 0, "Cannot divide by 0")
	
	def this(x: Int) = this(x, 1)
	
	private def gcd(a: Int, b: Int): Int = if(b==0) a else gcd(b, a % b)
	def numer = x / gcd(x, y)
	def denom = y / gcd(x, y)
	
	def less(that: Rational_2_6) = numer * that.denom < that.numer * denom
	
	def max(that: Rational_2_6) = if( this.less(that)) that else this
	
	def add(that: Rational_2_6) =
		new Rational_2_6(
			numer * that.denom + that.numer * denom,
			denom * that.denom)
			
	def neg():Rational_2_6 = new Rational_2_6(-numer, denom)
	
	def sub(that: Rational_2_6) = add(that.neg)
		
			
	override def toString = numer + "/" + denom
}
