case class Airport(Id:Int, Ident:String, Type:String, Name:String,
                   latitude_deg:Float, longitude_deg:Float, elevation_ft:Float,
                   continent:String, iso_country:String, iso_region: String, municipality: String, scheduled_service: String,
                   gps_code:String, iata_code:String, local_code:String, Home_link : String, wikipedia_link:String, keyword:String)

sealed abstract class Ident_nb (val value: String)
object Ident_nb {
  def Four(int: Int): Some[Ident_id] = {
    if (int.toString.length == 4 )
      Some(new Ident_id(String){})
    else
      None
  }
}


def obj(item: Type) = item match {
  case A => small_airport
  case B => heliport
}
/** Contrainte: id 4 chiffre, ident 4 caractère, type soit small_airport soit Heliport, continent 2 lettres
