package fp

class Parser {

  def parseCsvFile[A](filePath: String, lineParser: Array[String] => Option[A])= io.Source.fromFile(filePath).getLines().map{line => lineParser(line.split(";")) }.toList

  def loadAllCsvs()={
    val rawCountries = parseCsvFile("Country.csv", Country.fromStrings)
    val rawAirports = parseCsvFile("Airport.csv", Airport.fromStrings)
    val rawRunways = parseCsvFile("Runway.csv", Runway.fromStrings)

  }


}
