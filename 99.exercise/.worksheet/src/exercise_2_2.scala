object exercise_2_2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(120); 
  def product(f: Int => Int)(a: Int, b: Int): Int =
  	if(a>b) 1
  	else f(a) * product(f)(a+1, b);System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(26); val res$0 = 
  product(x=>x * x)(3, 4);System.out.println("""res0: Int = """ + $show(res$0));$skip(51); 
  
  def fact(n: Int): Int = product(x => x)(1, n);System.out.println("""fact: (n: Int)Int""");$skip(10); val res$1 = 
  fact(5);System.out.println("""res1: Int = """ + $show(res$1));$skip(171); 
  
  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
  	if(a>b) zero
  	else combine(f(a), mapReduce(f, combine, zero)(a+1, b));System.out.println("""mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int)Int""");$skip(91); 
  def product2(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x,y) => x * y, 1)(a, b);System.out.println("""product2: (f: Int => Int)(a: Int, b: Int)Int""");$skip(49); 
	def fact2(n: Int): Int = product2(x => x)(1, n);System.out.println("""fact2: (n: Int)Int""");$skip(10); val res$2 = 
	fact2(5);System.out.println("""res2: Int = """ + $show(res$2))}
}
