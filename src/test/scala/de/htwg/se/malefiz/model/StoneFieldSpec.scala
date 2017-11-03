package de.htwg.se.malefiz.model
import org.scalatest._
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
@RunWith(classOf[JUnitRunner])
class StoneFieldSpec extends WordSpec with Matchers {
  "A Field" when {
    "new" should {
      val field:StoneField = StoneField(1, 1, true, FreeStone(null))

      "have a x coordinate" in {
        field.x should be(1)
      }
      "have a y coordinate" in {
        field.y should be(1)
      }
      "have a stone" in {
        field.stone should be(FreeStone(field))
      }
    }
  }
}
