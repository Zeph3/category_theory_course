package cat.intro

import cat.intro.CatBasics.*
import org.scalatest.*
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.*

import scala.annotation.nowarn


class CatBasicsTest extends AnyFlatSpec with Matchers {

  addAndMultiplyAndToStringAssociative_1(3) shouldBe addAndMultiplyAndToStringAssociative_2(3)

  identityAndMultiply(3) shouldBe multiplyAndIdentity(3)
}
