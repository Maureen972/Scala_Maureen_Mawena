case class Country(Id:Id_country, Code:Country_code, Continent:String, Wikipedia_link:String, Keywords:String)

/** Contraintes sur :  Id, Code, Wikipedia_link (utiliser la fin d'une serie de caractères)**/

sealed abstract class Id_country(val value: Int)
object Id_country {
  def SixNumber(int: Int) = {
    if (int.toString.length == 6 )
      Some(new Id_country(int){})
    else
      None
  }
}

sealed abstract class Country_code(val value: String)
object Country_code {
  def fromInt(int: Int): Option[Country_code] = {
    if (int.toString.length == 2 )
      Some(new Country_code(String){})
    else
      None
  }
}

/** sealed abstract class SecurityCodeCC(val value: Int)
  object SecurityCodeCC {
    def fromInt(int: Int) = {
      if (int.toString.length >= 3 && int.toString.length <= 4)
        Some(new SecurityCodeCC(int){})
      else
        None
    }
  }
case class SecurityCodeCC private(val value: Int)
  object SecurityCodeCC {
    def fromInt(int: Int) = {
      if (int.toString.length >= 3 && int.toString.length <= 4)
        Some(new SecurityCodeCC(int){})
      else
        None
    }
  }