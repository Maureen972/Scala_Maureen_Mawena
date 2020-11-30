case class Runway(Id:Int, Airport_ref:Int, Airport_ident:String, Length_ft: Int, Width_ft: Int, Surface:String, Lighted:Boolean, Closed:Boolean,
                  Le_ident:String, Le_latitude_deg:Float, Le_longitude_deg:Float, Le_elevation_ft:Float, Le_heading_degT:Float, Le_displaced_threshold_ft:Float,
                  He_ident:String, He_latitude_deg:Float, He_longitude_deg:Float, He_elevation_ft:Float, He_heading_degT:Float, He_displaced_threshold_ft:Float )
/** Contraintes: Id, Airport_ref, Airport_ident, Le_ident, He_ident**/