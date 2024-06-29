import java.util.Scanner;
public class Hotel_Billing_Machine {
        public static void main(String[] args) {
            System.out.println("Welcome to Taj Tiffen Center");
            Scanner sc=new Scanner(System.in);
            int amount=0;
            int bill=0;
            System.out.println("Get 10% discount above 500/- bill");
            StringBuilder s=new StringBuilder();
            boolean m=true;
            System.out.println("Do you want to see Tiffen Menu\nPress y");
            if(sc.next().toLowerCase().equals("y")){
                System.out.print("1.Idly(4)-35/-\n2.Vada(2)-25/-\n3.Dosa(1)-50/-\n4.Puri(2)-35/-\n5.Pongal-50/-\n6.Curd_vada(2)-50/-\n7.Chitti_idly(8)-35/-\n8.EggBonda(2)-50/-\n");
                while(m){
                    System.out.println("Which item do you want");
                    System.out.println("press 1-8 numbers one at a time");
                    int a=sc.nextInt();
                    System.out.println("No of plates");
                    int b=sc.nextInt();
                    switch (a) {
                        case 1:idly(amount,b);
                            bill=bill+idly(amount,b);
                            s.append("\nIdly "+b+" plates"+"="+35*b);
                            break;
                        case 2: vada(amount,b);
                            bill=bill+vada(amount,b);
                            s.append("\nVada "+b+" plates"+"="+25*b);
                            break;
                        case 3:dosa(amount,b);
                            bill=bill+dosa(amount,b);
                            s.append("\nDosa "+b+" plates"+"="+50*b);
                            break;
                        case 4:puri(amount,b);
                            bill=bill+puri(amount,b);
                            s.append("\nPuri "+b+" plates"+"="+35*b);
                            break;
                        case 5:pongal(amount,b);
                            bill=bill+pongal(amount,b);
                            s.append("\nPongal "+b+" plates"+"="+50*b);
                            break;
                        case 6:curdVada(amount,b);
                            bill=bill+curdVada(amount,b);
                            s.append("\nCurdVada "+b+" plates"+"="+50*b);
                            break;
                        case 7:chittiIdly(amount,b);
                            bill=bill+chittiIdly(amount,b);
                            s.append("\nChittiIdly "+b+" plates"+"="+35*b);
                            break;
                        case 8:eggBonda(amount,b);
                            bill=bill+eggBonda(amount,b);
                            s.append("\nEggBonda "+b+" plates"+"="+50*b);
                            break;
                        default:System.out.println("Currently the item is not available in my Motel");
                    }
                    System.out.println("Do you want to Continue to press Y\nif you want to stop the process press except Y");
                    char msg=sc.next().toLowerCase().charAt(0);
                    if(msg=='y'){
                        m=true;

                    }else m=false;
                }
                System.out.println(" ");
                System.out.println("* * *Bill* * *");
                System.out.println(s);
                if(bill>500){
                    System.out.println("You can applicable for the 10% discount");
                    System.out.println("Before applying discount\nTotal bill:"+bill);
                    double d=bill-0.1*bill;
                    System.out.println("After applying discount\nTotal bill: "+d);
                }else{
                    System.out.println("You not applicable for 10% discount");
                    System.out.println("Total amount: "+bill);
                }
                System.out.println("Amount Paid take your bill\nVisit Again :)");

            }else{
                System.out.println("Ok have a great day");
            }
        }


        public static int idly(int a,int b){
            return a+(35*b);
        }
        public static int vada(int a,int b){
            return a+(25*b);
        }
        public static int dosa(int a,int b){
            return a+(50*b);
        }
        public static int puri(int a,int b){
            return a+(35*b);
        }
        public static int pongal(int a,int b){
            return a+(50*b);
        }
        public static int curdVada(int a,int b){
            return a+(50*b);
        }
        public static int chittiIdly(int a,int b){
            return a+(35*b);
        }
        public static int eggBonda(int a,int b){
            return a+(50*b);
        }
}
