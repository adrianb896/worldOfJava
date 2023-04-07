object Sample {
   def main (args: Array[String]) = {
      var ch:Char=0
      var num1:Int=0
      var num2:Int=0
      var result:Int=0
      
      print ("Welcome to my Scala arithmetic calculator:\n")
      // The user is prompted to enter an operation to perform
      print ("Choose operation to perform (+,-,*,/,%): ")
      // readChar() method reads a character from the standard input stream
      ch = scala.io.StdIn.readChar ()
      
      // The user is prompted to enter two numbers
      // readInt() method reads an integer from the standard input stream
      print ("Enter first number: ")
      num1 = scala.io.StdIn.readInt ()
      
      print ("Enter second number: ")
      num2 = scala.io.StdIn.readInt ()
      
      // The result is calculated based on the operation entered by the user
      ch match{
         case '+'=> result = add (num1, num2)
         case '-'=> result = subtract (num1, num2)
         case '*'=> result = multiply (num1, num2)
         case '/'=> result = divide (num1, num2)
         case '%'=> result = modulus (num1, num2)
         case _=> printf ("Invalid operation.\n")
      }
      
      println ("Result: "+ result);
   }
   
   // multi parameter functions
   def add (a:Int, b:Int):Int={
      return a+b;
   }
   
   def subtract (a:Int, b:Int):Int={
      return a-b;
   }
   
   def multiply (a:Int, b:Int):Int={
      return a*b;
   }
   
   def divide (a:Int, b:Int):Int={
      return a/b;
   }
   
   def modulus (a:Int, b:Int):Int={
      return a%b;
   }
}
