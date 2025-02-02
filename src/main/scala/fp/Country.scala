package fp

case class Country private(id:Country.CountryId,
                   code:Country.CountryCode,
                   continent:String,
                   wikipedia_link:String,
                   keywords:List[String])

/** Contraintes sur :  Id, Code **/
object Country {

  sealed abstract class CountryId(val value: Int)

  object CountryId {
    def fromInt(int: Int) = {
      if (int.toString.length == 6)
        Some(new CountryId(int) {})
      else
        None
    }
  }
  def fromStrings(strs:Array[String]): Option[Country] ={
    if (strs.size == 1){
      val Country.CountryId = Country.CountryId.fromInt(strs(8).map(_.asDigit).toList).toOption
    }


  }

}


