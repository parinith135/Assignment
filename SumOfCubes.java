/*32. Implement java program to find any number between 1 and n that can be expressed as the sum of two cubes in two (or more) different ways*/
class SumOfCubes{
   public static void main(String args[]) { 
        int num = 10000;
		int i,j,k,l;
        for (i = 1; i <= num; i++) {
            int cube1 = i*i*i;
            if (cube1 > num) break;

            for (j = i; j <= num; j++) {
                int cube2 = j*j*j;
                if (cube1 + cube2 > num) break;

                 for (k = i + 1; k <= num; k++) {
                    int cube3 = k*k*k;
                    if (cube3 > cube1 + cube2) break;

                    for (l = k; l <= num; l++) {
                        int cube4 = l*l*l;
                        if (cube3 + cube4 > cube1 + cube2) 
							break;
                        if (cube3 + cube4 == cube1 + cube2){
                            System.out.println((cube1+cube2) + " = ");
                            System.out.println(i + "^3 + " + j + "^3 = "); 
                            System.out.println(k+ "^3 + " + l + "^3"); 
                        }
                    }
                }
            }
        }
    }
}