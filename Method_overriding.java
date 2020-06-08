class Human
{
   //Overridden method
   public void eat()
   {
      System.out.println("Human is eating");
   }
}
class Girl extends Human
{
   //Overriding method
   private void eat()
  {
      System.out.println("Girl is eating");
   }
}
class Method_overriding
{
	 public static void main( String args[]) {
      Girl obj = new Girl();
      //This will call the child class version of eat() which is known as methodoverriding 
      obj.eat();
   }
}

