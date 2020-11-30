case class Airport(Id:Int, Ident:String, Type:String, Name:String,
                   latitude_deg:Float, longitude_deg:Float, elevation_ft:Float,
                   continent:String, iso_country:String, iso_region: String, municipality: String, scheduled_service: String,
                   gps_code:String, iata_code:String, local_code:String, Home_link : String, wikipedia_link:String, keyword:String)
/** Contrainte: id 4 chiffre, ident 4 caractère, type soit small_airport soit Heliport, continent 2 lettres