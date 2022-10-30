public class NumberSorting {
    public static void main (String [] args)
        {
            int number [] = {55,40,80,65,71};
            int n =  number.length;                    // Array length
            System.out.println("the array length is "   +n);
            System.out.println("the list of elements are  ");
            for (int i =0; i<n;i++)
            {
                System.out.println("  "  +number[i]);
            }
            //Sorting begins
            for(int i = 0;i<n;i++)
            {
                for (int j = i+1 ; j<n;j++)
                {
                    if (number[i] > number[j])
                    {
                        int temp = number[j];
                        number[j] = number [i];
                        number[i] =  temp;
                    }
                }
            }
            //Sorting Ends

            System.out.println("the Sorted list is " );

            for(int i = 0 ; i<n ; i++)
            {
                System.out.println("the array length is "   +number[i]);
            }



        }

}
