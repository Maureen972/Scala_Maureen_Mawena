package fp

case class Runway(id:RunwayId,
                  airport_ref: AirportRef,
                  airport_ident: AirportIdent,
                  length_ft: Int,
                  width_ft: Int,
                  surface:String,
                  lighted:Boolean,
                  closed:Boolean,
                  le_ident:String,
                  le_latitude_deg:Float,
                  le_longitude_deg:Float,
                  le_elevation_ft:Float,
                  le_heading_degT:Float,
                  le_displaced_threshold_ft:Float,
                  he_ident:String,
                  he_latitude_deg:Float,
                  he_longitude_deg:Float,
                  he_elevation_ft:Float,
                  he_heading_degT:Float,
                  he_displaced_threshold_ft:Float )

/** Contraintes: Id, Airport_ref, Airport_ident**/
object Runway {

  sealed abstract class RunwayId(val value: Int)

  object RunwayId {
    def fromInt(int: Int) = {
      if (int.toString.length == 6)
        Some(new RunwayId(int) {})
      else
        None
    }
  }

}

