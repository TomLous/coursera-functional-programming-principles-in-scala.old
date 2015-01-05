package week2

object exercise_2_5 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(63); 
	val x = new Rational(1,3);System.out.println("""x  : week2.Rational = """ + $show(x ));$skip(27); 
	val y = new Rational(5,7);System.out.println("""y  : week2.Rational = """ + $show(y ));$skip(27); 
	val z = new Rational(3,2);System.out.println("""z  : week2.Rational = """ + $show(z ));$skip(12); val res$0 = 
	
	x.add(y);System.out.println("""res0: week2.Rational = """ + $show(res$0));$skip(9); val res$1 = 
	x.neg();System.out.println("""res1: week2.Rational = """ + $show(res$1));$skip(10); val res$2 = 
	x.sub(z);System.out.println("""res2: week2.Rational = """ + $show(res$2));$skip(17); val res$3 = 
	x.sub(y).sub(z);System.out.println("""res3: week2.Rational = """ + $show(res$3))}
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
