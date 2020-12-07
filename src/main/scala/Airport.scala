case class Airport(id : AirportId,
                   ident:IdentNb,
                   airport_type: AirportType,
                   airport_name:String,
                   latitude_deg:Float,
                   longitude_deg:Float,
                   elevation_ft:Float,
                   continent:String,
                   iso_country:CountryCode,
                   iso_region: String,
                   municipality: String,
                   scheduled_service: String,
                   gps_code:String,
                   iata_code:String,
                   local_code:String,
                   home_link : String,
                   wikipedia_link:String,
                   keyword:String)

/** Contrainte: id , ident , type , iso_country**/

sealed abstract class AirportId(val value: Int)
object AirportId {
  def fromInt(int: Int) = {
    if (int.toString.length == 4 )
      Some(new AirportId(int){})
    else
      None
  }
}

sealed abstract class IdentNb (val value: String)
object IdentNb {
  def fromInt(int: Int) = {
    if (int.toString.length == 4) {
      Some(new IdentNb(String) {})
    } else {
      None
    }
  }
}

/**sealed abstract class CountryCode(val value: String)
object CountryCode {
  def fromInt(int: Int): Option[CountryCode] = {
    if (int.toString.length == 2 )
      Some(new CountryCode(String){})
    else
      None
  }
}*/
sealed trait AirportType
case object SmallAirport extends AirportType
case object Heliport extends AirportType



object ReadAirport extends App {

  val Airport = io.Source.fromFile("/src/main/scala/source/Airport.csv")
  for (line <- Airport.getLines) {
    val cols = line.split(",").map(_.trim)
    // do whatever you want with the columns here
    println(s"${cols(0)}${cols(1)}|${cols(2)}|${cols(3)}|${cols(4)}|${cols(5)}|${cols(6)}|${cols(7)}|${cols(8)}|${cols(9)}|${cols(10)}|${cols(11)}|${cols(12)}|${cols(13)}|${cols(14)}|${cols(15)}|${cols(16)}|${cols(17)}}")
  }
  Airport.close
}