public class CustomerMediumYard implements Yard
{
   // PRIVATE FIELDS
   int mySize;
   String myFirstName, myLastName;
   
   // CONSTRUCTOR
   public CustomerMediumYard(String l)
   {
      myLastName = l.substring(0,l.indexOf("-"));
      myFirstName = l.substring(l.indexOf("-") + 1, l.indexOf(":"));
      mySize = Integer.parseInt(l.substring(l.indexOf(":") + 1));
   }

   public double getCost()
   {
      return getSize() * 0.004;
   }

   public int getSize()
   {
      return mySize;
   }

   public String getFirstName()
   {
      return myFirstName;
   }

   public String getLastName()
   {
      return myLastName;
   }

   public String toString()
   {
      return ("" + getLastName() + "-" + getFirstName() + ":" + getSize());
   }
   public int compareTo(Yard y)
   {
      if (myLastName.compareTo(y.getLastName()) > 0)
         return 1;
      if(myLastName.compareTo(y.getLastName()) < 0)
         return -1;
      return 0;
   }
}