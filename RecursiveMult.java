/*15. Implement a JAVA program to multiply two numbers using recursive multiplication.*/
class RecursiveMult {
    static int Mult(int x, int y)
    {
        if (x < y)
            return Mult(y, x);
        else if (y != 0)
            return (x + Mult(x, y - 1));
        else
            return 0;
    }

    public static void main (String[] args)
    {
        int x = 5, y = 2;
        System.out.println(Mult(x, y)); 
    }
}
		