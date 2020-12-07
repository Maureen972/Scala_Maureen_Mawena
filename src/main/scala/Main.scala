import scala.collection.MapView
import scala.io.BufferedSource

object Main extends App {

override def main ( args: Array [String] ): Unit = {
  val Airportcsv = io.Source.fromFile("/src/main/scala/source/Airport.csv")
  val lst = read (lines, 0, MutableList(Country("id", "code", "continent","wikipedia_link","keywords")))
}

def readc(l: List[String],x: Int, xs: MutableList[Country]): MutableList[Country] = {
  if (l.isEmpty) return null
  else if (x < l.size){
    val cols = l.apply(x).split(",").map(_.trim)
    val s = l.size
    val c = Country(cols(0), cols(1), cols(2), cols(3), cols(4))
    xs += (Country(cols(0), cols(1), cols(2), cols(3), cols(4)))
    println(c)
    val y = x +1
    read(l,y,xs)
  }
  return xs
}

}