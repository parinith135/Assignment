/*51. Find the hexadecimal equivalent for a given 4-digit binary number.*/
class BinaryToHexadecimal{
   public static void main(String args[]) 
   {
	  int bin = 1010;
      int [] hex = new int [100];
      int i = 1, j = 0,k;
      int rem, dec = 0;
 
      while (bin > 0) 
      {
         rem = bin % 2;
         dec = dec + rem * i;
         i = i * 2;
         bin = bin/10;
      }
      i = 0;
      while (dec != 0)
      {
         hex[i] = dec % 16;
         dec = dec / 16;
         i++;
      }
      System.out.println("Hexadecimal: ");
      for (k = i-1; k >= 0; k--)
      {
         if(hex[k] > 9)
         {
            System.out.print((char)(hex[k]+55));
         }
         else
         {
            System.out.print(hex[k]);
         }
      }
   }
}