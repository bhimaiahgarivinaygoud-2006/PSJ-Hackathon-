import java.util.Scanner;
public class WasteCollection
{
     public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    //3a
    int vnumber=1234;
    int Collectionpts=5678;
    Double weight=55.5;
    char vstatus='A';
    System.out.println("Vehicle Number: "+vnumber);
    System.out.println("Collection Points: "+Collectionpts);
    System.out.println("Weight: "+weight);
    System.out.println("Vehicle Status: "+vstatus);
    //3b
    System.out.println("Enter the collected weight:");
    int weightX=sc.nextInt();
    if(weightX>=100)
    {
        System.out.println("Collection target Achieved");
    }
    else
    {
        System.out.println("More Waste Collection Required");
    }
}
}