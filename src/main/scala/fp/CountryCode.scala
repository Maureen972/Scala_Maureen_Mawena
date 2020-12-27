package fp

sealed abstract class CountryCode (val value: String)
object CountryCode {
  def fromInt(int: Int): Option[CountryCode] = {
    if (int.toString.length == 2 )
      Some(new CountryCode(String){})
    else
      None
  }
  /*def fromStrings(strs:Array[String]): Option[CountryCode] ={
    if (strs.size == 1){
      val Country.CountryCode = Country.CountryCode.fromInt(strs(8).map(_.asDigit).toList)


    }*/
}