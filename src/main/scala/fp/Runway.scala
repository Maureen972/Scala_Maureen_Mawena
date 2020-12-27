package fp

case class Runway(id:Runway.RunwayId,
                  airport_ref: Runway.AirportRef,
                  airport_ident: Runway.AirportIdent,
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


  sealed abstract class AirportRef(val value: Int)

  object AirportRef {
    def fromInt(int: Int) = {
      if (int.toString.length == 6)
        Some(new AirportRef(int) {})
      else
        None
    }
  }

  sealed abstract class AirportIdent(val value: Int)

  object AirportIdent {
    def fromInt(int: Int) = {
      if (int.toString.length == 6)
        Some(new AirportIdent(int) {})
      else
        None
    }
  }

  def fromStrings(strs:Array[String]): Option[Country] = {
    if (strs.size == 3){
      val Runway.RunwayId = Runway.RunwayId.fromInt(strs(8).map(_.asDigit).toList).toOption
      val Runway.AirportRef = Runway.AirportRef.fromInt(strs(1).toList).toOption
      val Runway.AirportIdent = Runway.AirportIdent.fromInt(strs(1).toList).toOption

    }
  }

}

