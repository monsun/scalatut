



/**
 * Created by Jędrzej Kalinowski on 23.02.14.
 */
object Hello {

  def main(args: Array[String]) {
    val stringi = Array("sade", "ółąśð", "21c")

    val result = for (str <- stringi) yield str.toUpperCase

    println(result.deep.mkString(" "))
  }



}
