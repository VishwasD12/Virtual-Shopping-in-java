package Project;

import java.util.Scanner;

public class A3 extends A2 {
	 int m,n;
		int r;
		Object math;
void push()
	{
	int a,y,c=0,l=0;
	int top=-1;
	if(top>r)
	{
	System.out.println("MAX NO OF CARS REACHED\n");
	}
	else
	{
	   Scanner o=new Scanner(System.in);
	   System.out.println("PAYMENT OPTION\n");
	  System.out.println("1.GOOGLE PAY\n2.PHONE PAY\n3.paytm\n");
	  a=o.nextInt();
int aa=1;
	 while(aa==1)
 {
   if(a<=3)
	  {
		 c=500;
	System.out.println("YOUR AMOUNT IS %u\n"+c);
	}
	  if(a<=3)
	  {
	  System.out.println("PAY THE AMOUNT");
	  Scanner k=new Scanner(System.in);
	  l=k.nextInt(); 
	   }
     if(c==l)
	{
	System.out.println("AMOUNT PAID SUCCESSFULLY\n");
	aa=0;break;
  }
	else
	{
	System.out.println("AMOUNT NOT PAID\n");
	System.out.println("PAY THE NEW CORRECT AMOUNT\n");
continue;
}
}
int ii=1;
while(ii==1)
	{
     n=12456;m=(int)(n*Math.random()+12*Math.random());
       y=m;n+=123;
	System.out.println("YOUR OTP IS :"+y);
	top++;
	Scanner ch=new Scanner(System.in);
	System.out.println("\n enter ur OTP\n");
	int d=ch.nextInt();
	if(y==d)
	{
	 System.out.println("\t\t************************************************\n");
	 System.out.println("\t\t       YOU SUCCESSFULLY BOOKED YOUR ORDER\n");
	 System.out.println("\t\t************************************************\n");
	ii=0;
   break;
   }
	else
	{ii=1;
	  System.out.println("WRONG OTP !!!!!!!!!!!.....\n PLEASE RE ENTER THE NEW OTP\n");
	  top--;
 continue;
	}}}}}



