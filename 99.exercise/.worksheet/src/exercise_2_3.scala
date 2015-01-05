import math.abs

object exercise_2_3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
	val tolerance = 0.0001;System.out.println("""tolerance  : Double = """ + $show(tolerance ));$skip(85); 
	
	def isCloseEnough(x: Double, y: Double): Boolean =
		abs((x-y)/x) /x  < tolerance;System.out.println("""isCloseEnough: (x: Double, y: Double)Boolean""");$skip(215); 
		
	def fixedPoint(f:Double => Double)(firstGuess: Double) = {
		def iterate(guess:Double):Double = {
			val next = f(guess)
			if(isCloseEnough(guess, next)) next
			else iterate(next)
		}
		iterate(firstGuess)
	};System.out.println("""fixedPoint: (f: Double => Double)(firstGuess: Double)Double""");$skip(69); 
	
	def avarageDamp(f: Double => Double)(x: Double) =
		(x+ f(x)) / 2;System.out.println("""avarageDamp: (f: Double => Double)(x: Double)Double""");$skip(74); 
		
	// shown before
	def sqrt1(x: Double) = fixedPoint(y => (y+x/y)/2)(1);System.out.println("""sqrt1: (x: Double)Double""");$skip(10); val res$0 = 
	sqrt1(2);System.out.println("""res0: Double = """ + $show(res$0));$skip(64); 
	
	def sqrt(x: Double) =
		fixedPoint(avarageDamp(y => x/y))(1);System.out.println("""sqrt: (x: Double)Double""");$skip(12); val res$1 = 
		
	sqrt(2);System.out.println("""res1: Double = """ + $show(res$1))}
}
