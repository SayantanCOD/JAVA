class abc{
    void accept ()
    {
       int x=3;
       int y = 4;
       
       int ave;
       ave = x+y/2;

       System.out.println("the average is "+ave);

    }
}

class ave_class{
    public static void main (String []args)
    {
        abc a1=new abc();
        a1 .accept();
    }
}