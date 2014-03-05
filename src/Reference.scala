/**
 * Created by Jędrzej Kalinowski on 27.02.14.
 */
class Reference [T]{

  private var contents: T = _

  def set(value: T) { contents = value }
  def get: T = contents

}


object IntegerReference {

  def main (args: Array[String]){
    val cell = new Reference[Int]
    cell.set(42)
    println("Cell = "+cell.get)
  }
}