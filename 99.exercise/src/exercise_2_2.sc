object exercise_2_2 {
  def product(f: Int => Int)(a: Int, b: Int): Int =
  	if(a>b) 1
  	else f(a) * product(f)(a+1, b)            //> product: (f: Int => Int)(a: Int, b: Int)Int
  product(x=>x * x)(3, 4)                         //> res0: Int = 144
  
  def fact(n: Int): Int = product(x => x)(1, n)   //> fact: (n: Int)Int
  fact(5)                                         //> res1: Int = 120
  
  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
  	if(a>b) zero
  	else combine(f(a), mapReduce(f, combine, zero)(a+1, b))
                                                  //> mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b:
                                                  //|  Int)Int
  def product2(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x,y) => x * y, 1)(a, b)
                                                  //> product2: (f: Int => Int)(a: Int, b: Int)Int
	def fact2(n: Int): Int = product2(x => x)(1, n)
                                                  //> fact2: (n: Int)Int
	fact2(5)                                  //> res2: Int = 120
}