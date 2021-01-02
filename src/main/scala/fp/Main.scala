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
    val sourceA = Source.fromFile("src/main/scala/source/fp.Airport.csv")
    val linea = sourceA.getLines()
    val airport = linea.map(line => line.split(" , ").map(_.toDouble)).toArray
    sourceA.close()
  }

  def runwaycsv(args: Array[String]): Unit = {
    val sourceR = Source.fromFile("src/main/scala/source/fp.Runway.csv")
    val liner = sourceR.getLines()
    val runway = liner.map(line => line.split(" , ").map(_.toDouble)).toArray
    sourceR.close()
  }










}
