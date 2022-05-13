package cat.intro

import cat.intro.Monoid.intAdder
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class MonoidTest extends AnyFlatSpec with Matchers {

  // associativity
  intAdder.combine(intAdder.combine(5, 2), 2) shouldBe 9

  // identity
  intAdder.combine(intAdder.empty, 5) shouldBe 5
  intAdder.combine(5, intAdder.empty) shouldBe 5
}
