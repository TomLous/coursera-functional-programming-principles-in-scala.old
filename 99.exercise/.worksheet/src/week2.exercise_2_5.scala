package week2

object exercise_2_5 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(67); 
	val x = new Rational_2_5(1,3);System.out.println("""x  : week2.Rational_2_5 = """ + $show(x ));$skip(31); 
	val y = new Rational_2_5(5,7);System.out.println("""y  : week2.Rational_2_5 = """ + $show(y ));$skip(31); 
	val z = new Rational_2_5(3,2);System.out.println("""z  : week2.Rational_2_5 = """ + $show(z ));$skip(12); val res$0 = 
	
	x.add(y);System.out.println("""res0: week2.Rational_2_5 = """ + $show(res$0));$skip(9); val res$1 = 
	x.neg();System.out.println("""res1: week2.Rational_2_5 = """ + $show(res$1));$skip(10); val res$2 = 
	x.sub(z);System.out.println("""res2: week2.Rational_2_5 = """ + $show(res$2));$skip(17); val res$3 = 
	x.sub(y).sub(z);System.out.println("""res3: week2.Rational_2_5 = """ + $show(res$3))}
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
