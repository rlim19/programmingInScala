class Rational(n: Int, d: Int) {
  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = {
    this(n, 1)
  }

  override def toString = numer + "/" + denom

  def + (that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def + (i : Int): Rational =
    new Rational ( numer + i * denom, denom)

  def -(that: Rational): Rational =
    new Rational(
      numer * that.denom - that.numer * denom,
      denom * that.denom
    )

  def -(i : Int): Rational =
    new Rational ( numer - i * denom, denom)

  def * (that: Rational): Rational =
    new Rational(
      this.numer * that.numer,
      this.denom * that.denom
    )

  def *(i: Int): Rational =
    new Rational (numer * i, denom)

  def /(that: Rational): Rational =
    new Rational (numer * that.denom, denom * that.numer)

  def /(i: Int): Rational =
    new Rational(numer, denom * i)

  def lessThan(that: Rational) =
    this.numer * that.denom < that.numer * this.denom

  def max(that: Rational) =
    if (this lessThan that) that else this

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}

val oneHalf = new Rational(1, 2)
val oneThird = new Rational(1, 3)
val twoThirds = new Rational(2, 3)
val five = new Rational(5)
//val notValid = new Rational(5, 0)

oneHalf + oneThird
oneHalf.numer
oneHalf lessThan oneThird
oneHalf max oneThird

new Rational(66, 42)

new Rational(2, 1) * new Rational(3, 4)

new Rational(1, 3) * 2

implicit def intToRational(x: Int) = new Rational(x)

2 * new Rational(2, 3)

(oneHalf / 7) + (1 - twoThirds)