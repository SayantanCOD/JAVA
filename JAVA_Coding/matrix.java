import java.util.Scanner;
class matrix{
	public static void main(String args[]){
	
	int a[][]=new int[3][3];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Array");
	
	for(int i=0;i<3;i++)
	
		{
            for(int j=0;j<3;j++ )
            {
                a[i][j]=sc.nextInt();

            }
        }
	
	
	
    sc.close();
	
	System.out.println("matrix\n");
	

for (int i = 0; i < 3; i++)
    {
      
      for (int j = 0; j < 3; j++)
      {
     
      System.out.print( a[i][j]  + "\t");
       }
       System.out.println();
     }

}

}
