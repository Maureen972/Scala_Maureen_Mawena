package fp

import scala.io.Source

object Main {
  def countrycsv(args: Array[String]): Unit = {
    val sourceC = Source.fromFile("src/main/scala/source/Countries.csv")
    val linec = sourceC.getLines()
    val country = linec.map(line => line.split(" , ").map(_.toDouble)).toArray
    sourceC.close()
  }

  def airportcsv(args: Array[String]): Unit = {
    val source = Source.fromFile("src/main/scala/source/fp.Airport.csv")
    val linea = source.getLines()
    val airport = linea.map(line => line.split(" , ").map(_.toDouble)).toArray
    source.close()
  }










}
