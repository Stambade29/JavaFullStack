import java.util.Scanner;

public class marksavg {

	public static void main(String[] args) { int a,b,c,d,e,total,ch;
    System.out.println("Enter the marks of subject");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    d=sc.nextInt();
    e=sc.nextInt();
    total=a+b+c+d+e;
    System.out.println("Total of marks is:"+total);

    double avg=total/5;
    System.out.println("Average of marks is"+avg);
 
System.out.println("Enter your choice");
ch=sc.nextInt();
switch (ch)
   {
   
    case 1:
if(total<50){
         System.out.println("The class is second class");}
        break;

        case 2:
if(total>50){
    System.out.println("The class is first class");

}

        break;
        case 3:
        if(total>70)
        {
            System.out.println("The class is First class with distinction");
        }
        break;

    default:
        break;

   }System.out.println("DO you want to continue");
	
   // switch(ch==1);
    System.out.println("Thank you");
}
		// TODO Auto-generated method stub

	}


