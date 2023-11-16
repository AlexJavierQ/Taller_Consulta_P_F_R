
//1-----------------------------------------------------------------
val a = 3.0
val b= 5.0
def f(x: Double): Double  = -x * x + 8 * x - 12
def integrar(a : Double, b : Double, f: Double => Double): Double =
  val h = (b-a)/2
  val result = (b-a)*(f(a)+f(a+h)+f(b))/6
  result

val total = integrar(a,b,f)


//2------------------------------------------------------------------
//-a-----------------------------------------------------------------
val a = 3
val b = 5
def f(x: Double): Double = -x * x + 8 * x - 12

def integrar(a: Double, b: Double, f: Double => Double): Double =
  val h = (a + b) / 2
  val resultado = (b - a) * (f(a) + 4 * f(h) + f(b)) / 6
  resultado

integrar(a,b,f)    // Resultado: 7.333...

def margenError(valorEsperado: Double,valorObtenido :Double): Double = Math.abs(valorEsperado-valorObtenido)
margenError(7.33, integrar(a,b,f))  // Margen de Error: 0.0033333333333329662

//-b-----------------------------------------------------------------
val a = 0
val b = 2
def f(x: Double): Double = 3 * Math.pow(x,2)
def integrar(a: Double, b: Double, f: Double => Double): Double =
  val h = (a + b) / 2
  val resultado = (b - a) * (f(a) + 4 * f(h) + f(b)) / 6
  resultado

integrar(a,b,f)  // Resultado: 8.0
def margenError(valorEsperado: Double,valorObtenido :Double): Double = Math.abs(valorEsperado-valorObtenido)
margenError(8, integrar(a,b,f))  // Margen de Error: 0.0

//-c-----------------------------------------------------------------
val a = -1
val b = 1
def f(x: Double): Double = x + (2 * Math.pow(x,2)) - (Math.pow(x,3)) + (5 * Math.pow(x,4))
def integrar(a: Double, b: Double, f: Double => Double): Double =
  val h = (a + b) / 2
  val resultado = (b - a) * (f(a) + 4 * f(h) + f(b)) / 6
  resultado

integrar(a,b,f)  // Resultado: 4.666666666666667
def margenError(valorEsperado: Double,valorObtenido :Double): Double =
  Math.abs(valorEsperado-valorObtenido)
margenError(3.333, integrar(a,b,f))  //Margen de Error: 1.3336666666666668

//-d-----------------------------------------------------------------
val a = 1
val b = 2
def f(x: Double): Double = (2 * x + 1)/(Math.pow(x,2) + x)
def integrar(a: Double, b: Double, f: Double => Double): Double =
  val h = (a + b) / 2
  val resultado = (b - a) * (f(a) + 4 * f(h) + f(b)) / 6
  resultado

integrar(a,b,f)  // Resultado: 1.099999....
def margenError(valorEsperado: Double,valorObtenido :Double): Double = Math.abs(valorEsperado-valorObtenido)
margenError(1.09861, integrar(a,b,f))  //Margen de Error: 0.0013899999999997803

//-e-----------------------------------------------------------------

val a = 0
val b = 1
def f(x: Double): Double = Math.pow(2.71828,x)
def integrar(a: Double, b: Double, f: Double => Double): Double =
  val h = (a + b) / 2
  val resultado = (b - a) * (f(a) + 4 * f(h) + f(b)) / 6
  resultado

integrar(a,b,f)  // Resultado: 1.7188604774611995
def margenError(valorEsperado: Double,valorObtenido :Double): Double = Math.abs(valorEsperado-valorObtenido)
margenError(1.71828, integrar(a,b,f)) // Margen de Error: 5.804774611994912E-4

//-f-----------------------------------------------------------------
val a = 2
val b = 3
def f(x: Double): Double = {
  1 / sqrt(x - 1)
}
def integrar(a: Double, b: Double, f: Double => Double): Double =
  val h = (a + b) / 2
  val resultado = (b - a) * (f(a) + 4 * f(h) + f(b)) / 6
  resultado

integrar(a,b,f)  // Resultado: 0.8288488508162422
def margenError(valorEsperado: Double,valorObtenido :Double): Double = Math.abs(valorEsperado-valorObtenido)
margenError(0.828427, integrar(a,b,f))

//-f-----------------------------------------------------------------
val a = 0
val b = 1
def f(x: Double): Double = 1/(1 + Math.pow(x,2))
def integrar(a: Double, b: Double, f: Double => Double): Double = {
  val h = (a + b) / 2
  val resultado = (b - a) * (f(a) + 4 * f(h) + f(b)) / 6
  resultado

  integrar(a,b,f)   // Retorna: 0.78333...
  def margenError(valorEsperado: Double,valorObtenido :Double): Double = Math.abs(valorEsperado-valorObtenido)
  margenError(0.785398, integrar(a,b,f))  // Margen de Error: 0.0020646666666667146

//3------------------------------------------------------------------
def margenError(valorDeseado: Double, valorObtenido: Double): Double = {
  scala.math.abs(valorDeseado - valorObtenido)
}