package fp

sealed abstract class CountryCode (val value: String)
object CountryCode {
  def fromInt(int: Int): Option[CountryCode] = {
    if (int.toString.length == 2 )
      Some(new CountryCode(String){})
    else
      None
  }
}
