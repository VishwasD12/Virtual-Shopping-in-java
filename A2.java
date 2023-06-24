package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class A2  {
	int B,e,n=0;
	int x = 0;
	int arr[]=new int[5];
	
void inner1() {

	int f,x;
	do {
		// create table kid1 (kid int(11) primary key auto_increment,kname varchar(100) not null ,kcost int(100)) ;
		n= n+1;
	Scanner Sc = new Scanner(System.in);
	System.out.println("choose the CATOGIRES");
	System.out.println("1.ELECTRONICS");
	System.out.println("2.KIDS STORE");
	System.out.println("3.DAILY PRODUCTS");
	
	int z=Sc.nextInt();	
	if(z<=3) {
	
			switch(z)
			{
			case 1:{
			     System.out.println("Select the product ");
			     System.out.println("___________________________________");
			     System.out.println("|s.no| PRODUCTS          |  COST  |");
			     System.out.println("|____|___________________|________|");
			     System.out.println("|1.  | MOBILE            |  15000 |");
			     System.out.println("|2.  | TV                |  35000 |");
			     System.out.println("|3.  | RADIO             |  5000  |");
			     System.out.println("|4.  | SPEAKER           |  4000  |");
			     System.out.println("|5.  | IRON BOX          |  2500  |");
			     System.out.println("|6.  | FAN               |  900   |");
			     System.out.println("|7.  | CAMERA            |  45000 |");
			     System.out.println("|8.  | AC                |  55000 |");
			     System.out.println("|9.  | MIXER             |  5000  |");
			     System.out.println("|10. | XBOX              |  66000 |");
			     System.out.println("|____|___________________|________|");
				                  int c =Sc.nextInt();
				                  switch(c) 
				                  {
				                    case 1:{ B = 15000;
				                   arr[n]=B; 
				                    }break;
				                  
			                      case 2:{
				                    B = 35000;
				                   arr[n]=B; 
		                          	}break;
			                       case 3:{
				                     B = 5000;
				                    arr[n]=B; 
			                               }break;
			                      case 4:{
				                     B = 4000;
				                    arr[n]=B; 
			                          }break;
			                        case 5:{
			                     	 B = 2500;
			                     	 arr[n]=B; 
		                               	}break;
		                        	case 6:{
			                  	 B = 900;
			                  	 arr[n]=B; 
		                    	}break;
		                     	case 7 :{
		                     	
			                   	 B = 45000;
			                    arr[n]=B; 
		                          	}break;
			                    case 8:{
				                   B = 55000;
				                  arr[n]=B; 
		                         	}break;
			                        case 9:{
				                     B = 5000;
				                    arr[n]=B; 
		                                	}break;
		                        	case 10:{
			                    	 B = 66000;
			                    	
			                    	 arr[n]=B; }
		                        	break;
		                        	}
		                        		
			                  break;
			}				                  
			case 2:{
			    System.out.println("Select the product");
			    
			     System.out.println("___________________________________");
			     System.out.println("|s.no| PRODUCTS          |  COST  |");
			     System.out.println("|____|___________________|________|");
			     System.out.println("|1.  | WATER GUN         |  200   |");
			     System.out.println("|2.  | GAME BOX          |  500   |");
			     System.out.println("|3.  | CHESS             |  550   |");
			     System.out.println("|4.  | BABY SAFETY SOFA  |  2000  |");
			     System.out.println("|5.  | ROCKING CHAIR     |  2000  |");
			     System.out.println("|6.  | BABY WALKER       |  1000  |");
			     System.out.println("|7.  | BULIDING BLOCKS   |  600   |");
			     System.out.println("|8.  | TOOL KIT FOR KIDS |  500   |");
			     System.out.println("|9.  | TOYS              |  2000  |");
			     System.out.println("|10. | TRI CYCLE         |  3000  |");
			     System.out.println("|____|___________________|________|");
					                  int y =Sc.nextInt();
					                  switch(y) {
					                  case 1:{B = 200;
					                  arr[n]=B; 
					                  }
					                  break;
			                   	case 2:{
			                		 B = 500;
			                		 arr[n]=B; 
			                    	}
			                   	break;
			                   	case 3:{
			                		 B = 550;
			                		 arr[n]=B; 
			                  	}
			                   	break;
			                  	case 4:{
			               		 B = 2000;
			               	     arr[n]=B; 
			                    	}
			                  	break;
		                    		case 5:{
		                 			 B = 2000;
		                 			 arr[n]=B; 
			                     	}
		                    		break;
				                 case 6:{
				             	 B = 1000;
				             	 arr[n]=B; 
			                 	}
				                 break;
				                case 7 :{
				             	 B = 600;
				             	 arr[n]=B; 
				               }
				                break;
			                 	case 8:{
			              		 B = 500;
			              		 arr[n]=B; 
			                 	}
			                 	break;
				                case 9:{
				             	 B = 2000;
				             	 arr[n]=B; 
				             	
				                 }break;
				                case 10:{
				            	 B = 3000;
				            	 arr[n]=B; 
				            	 
			                 	}break; 
				               
				
				  } break;}
			case 3:{
			     System.out.println("Select the product");
			     System.out.println("___________________________________");
			     System.out.println("|s.no| PRODUCTS          |  COST  |");
			     System.out.println("|____|___________________|________|");
			     System.out.println("| 1. | DAIRY MILK        |  120   |");
			     System.out.println("| 2. | COOL DRINKS       |  75    |");
			     System.out.println("| 3. | FRUITS SET        |  100   |");
			     System.out.println("| 4. | VEGETABLE SET     |  80    |");
			     System.out.println("| 5. | MEAT              |  650   |");
			     System.out.println("| 6. | GHEE              |  700   |");
			     System.out.println("| 7. | ICE CREAM         |  100   |");
			     System.out.println("| 8. | BISKETS           |  80    |");
			     System.out.println("| 9. | BREAD             |  100   |");
			     System.out.println("| 10.| CORN FLAKES       |  120   |");
			     System.out.println("|____|___________________|________|");
		                      int g =Sc.nextInt();
			                  switch(g) {
			                  case 1:{ B = 120;
			                 arr[n]=B; 
			                  }break; 
		                       case 2:{
		                      	 B = 75;
		                      	 arr[n]=B; 
	                           	}break; 
		                       case 3:{
			                     B = 100;
			                    arr[n]=B;
		                       }break; 
		                     case 4:{
			                  B = 80;
			                 arr[n]=B;
	                        	}break; 
		                      case 5:{
		                    	 B = 650;
		                    	arr[n]=B;
	                         	}break; 
		                       case 6:{
			                      B = 700;
			                     arr[n]=B;
	                          	}break; 
		                        case 7 :{
		                     	 B = 100;
		                     	arr[n]=B;
		                     	  }break; 
	 	                      case 8:{
			                   B = 80;
			                  arr[n]=B;
			                  break; 
			                  
	                      	}
		                      case 9:{
			                   B = 100;
			                  arr[n]=B;
		                       }
		                      case 10:{
		                    	 B = 120;
		                    	arr[n]=B;
		                    
	                            	}	break; 	
	
		                    
				               
			                  }  break;        } 
			default:System.out.println("you can choose from given only ");
			
			}
}
else {
	System.out.println("you can select from given options only  ");
	inner1();}

Scanner o=new Scanner(System.in);
System.out.println("if you want to add any other product to your list ");
System.out.println("click 1\nclick 2");
 e=o.nextInt();}
while(e==1);
}

int m,a;
int r;
Object math;


void push()
{
	 System.out.println("Amount of your product is : " +x);
int a,y,c=0,l=0;
int top=-1;
if(top>r)
{
System.out.println("MAX NO OF products REACHED\n");
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
	 c=x;
System.out.println("YOUR AMOUNT IS %u\n"+x);
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
//System.out.println("AMOUNT NOT PAID\n");
System.out.println("PAY THE NEW CORRECT AMOUNT\n");
continue;
}
}
int ii=1;
while(ii==1)
{
 n=12456;m=(int)(n*Math.random()+12*Math.random());
   y=m;a+=123;
System.out.println("YOUR OTP IS :"+y);
top++;
Scanner ch=new Scanner(System.in);
System.out.println("\n enter ur OTP\n");
int d=ch.nextInt();
if(y==d)
{
	System.out.println("AMOUNT PAID SUCCESSFULLY\n");
 System.out.println("\t\t********************************************\n");
 System.out.println("\t\t  YOU SUCCESSFULLY BOOKED YOUR PRODUCT\n");
 System.out.println("\t\t********************************************\n");
ii=0;
break;
}
else
{ii=1;
  System.out.println("WRONG OTP !!!!!!!!!!!.....\n PLEASE RE ENTER THE NEW OTP\n");
  top--;
continue;
}}}}


void total() {
	for(int i = 0;i<arr.length;i++) {
		 x = x+ arr[i]; 
		// System.out.println("total = "+x);
	}
}
}
