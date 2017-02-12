class Rational(n: Int, d: Int) {
  val num: Int = n;
  val denum: Int = d;

  def add(that: Rational): Rational = {
    new Rational(
      num * that.denum + that.num * denum,
      denum * that.denum
    )
  }

  override def toString() = num + "/" + denum
}

val oneHalf = new Rational(1, 2)
val twoThird = new Rational(2, 3)
println(oneHalf)
println(twoThird)
println(oneHalf add twoThird)