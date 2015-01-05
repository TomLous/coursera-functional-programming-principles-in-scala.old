import math.abs

object exercise_2_3 {
	val tolerance = 0.0001                    //> tolerance  : Double = 1.0E-4
	
	def isCloseEnough(x: Double, y: Double): Boolean =
		abs((x-y)/x) /x  < tolerance      //> isCloseEnough: (x: Double, y: Double)Boolean
		
	def fixedPoint(f:Double => Double)(firstGuess: Double) = {
		def iterate(guess:Double):Double = {
			val next = f(guess)
			if(isCloseEnough(guess, next)) next
			else iterate(next)
		}
		iterate(firstGuess)
	}                                         //> fixedPoint: (f: Double => Double)(firstGuess: Double)Double
	
	def avarageDamp(f: Double => Double)(x: Double) =
		(x+ f(x)) / 2                     //> avarageDamp: (f: Double => Double)(x: Double)Double
		
	// shown before
	def sqrt1(x: Double) = fixedPoint(y => (y+x/y)/2)(1)
                                                  //> sqrt1: (x: Double)Double
	sqrt1(2)                                  //> res0: Double = 1.4142135623746899
	
	def sqrt(x: Double) =
		fixedPoint(avarageDamp(y => x/y))(1)
                                                  //> sqrt: (x: Double)Double
		
	sqrt(2)                                   //> res1: Double = 1.4142135623746899
}