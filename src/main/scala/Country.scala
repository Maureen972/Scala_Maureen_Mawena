case class Country(id:IdCountry,
                   code:CountryCode,
                   continent:String,
                   wikipedia_link:String,
                   keywords:String)

/** Contraintes sur :  Id, Code **/

sealed abstract class IdCountry(val value: Int)
object IdCountry {
  def fromInt(int: Int) = {
    if (int.toString.length == 6 )
      Some(new IdCountry(int){})
    else
      None
  }
}


