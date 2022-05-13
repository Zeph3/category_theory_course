package cat.intro

trait Monoid[A] {
  def combine(x: A, y: A): A
  def empty: A
}

object Monoid {
  val intAdder: Monoid[Int] = new Monoid[Int] {
    override def combine(x: Int, y: Int): Int = x + y

    override def empty: Int = 0
  }
}
