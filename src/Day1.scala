object Day1 {

  def main(args: Array[String]) {
    
    val doubleVal1: Double = 5.35;
    val charVal1: Char = 'a';
    val booleanVal1: Boolean = false;
    val intVal2: Integer = 100;
    val stringVal1: String = "I am a code monkey";
    val booleanVal2: Boolean = true;
    val doubleVal2: Double = 17.3;
    val charVal2: Char = 'c';
    val stringVal2: String = "derp";

    printType(doubleVal1);
    printType(charVal1);
    printType(booleanVal1);
    printType(intVal2);
    printType(stringVal1);
    printType(booleanVal2);
    printType(doubleVal2);
    printType(charVal2);
    printType(stringVal2);
  }

  def printType[T](input: T) = input match {
    case _: Double  => println("Primitive : double")
    case _: Char    => println("Primitive : char")
    case _: Boolean => println("Primitive : boolean")
    case _: Integer => println("Primitive : int")
    case _: String  => println("Referenced : String")
  }
}
