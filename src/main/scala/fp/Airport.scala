package fp

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
object Airport {

  sealed abstract class AirportId(val value: Int)

  object AirportId {
    def fromInt(int: Int) = {
      if (int.toString.length == 4)
        Some(new AirportId(int) {})
      else
        None
    }
  }

  sealed abstract class IdentNb(val value: String)

  object IdentNb {
    def fromInt(int: Int) = {
      if (int.toString.length == 4) {
        Some(new IdentNb(String) {})
      } else {
        None
      }
    }
  }


  sealed abstract class AirportRef(val value: Int)

  object AirportRef {
    def fromInt(int: Int) = {
      if (int.toString.length == 4)
        Some(new AirportRef(int) {})
      else
        None
    }
  }

  sealed abstract class AirportIdent(val value: String)

  object AirportIdent {
    def fromInt(int: Int) = {
      if (int.toString.length == 3)
        Some(new AirportIdent(String) {})
      else
        None
    }
  }

  sealed trait AirportType

  case object SmallAirport extends AirportType

  case object Heliport extends AirportType


}

