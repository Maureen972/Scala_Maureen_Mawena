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

sealed abstract class CountryCode(val value: String)
object CountryCode {
  def fromInt(int: Int): Option[CountryCode] = {
    if (int.toString.length == 2 )
      Some(new CountryCode(String){})
    else
      None
  }
}

