import com.TP_MR.CaseClass.Country
import scala.collection.mutable.MutableList
import scala.io.{BufferedSource, Source}


object Main extends App {

override def main ( args: Array [String] ): Unit = {
  //val country = readC( C,0, MutableList(Country("id", "code", "continent", "wikipedia_link", "keywords")))
  val Countrycsv = io.Source.fromFile("/src/main/scala/source/Country.csv")

  val C = Countrycsv.getLines.toList


}

  def readC(l: List[String],x: Int, xs: MutableList[Country]): MutableList[Country] = {
  if (l.isEmpty) return null
  else if (x < l.size){
    val columns = l.apply(x).split(",").map(_.trim)
    val size = l.size
    val c = Country(columns(0), columns(1), columns(2), columns(3), columns(4))
    xs += (Country(columns(0), columns(1), columns(2), columns(3), columns(4)))
    println(c)
    val y = x +1
    read(l,y,xs)
  }
  return xs
}

}