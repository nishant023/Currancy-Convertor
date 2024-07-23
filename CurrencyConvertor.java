import java.util.Scanner;
public class CurrencyConvertor {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the amount you want to convert");
            int amount= sc.nextInt(); //Enter the amount we want to convert
            System.out.println("Press 1: Dollar to Rupees");
            System.out.println("Press 2: Dollar to Yuan");
            System.out.println("Press 3: Dollar to Euro");
            System.out.println("Press 4: Rupees to Dollar");
            System.out.println("Press 5: Rupees to Yuan");
            System.out.println("Press 6: Rupees to Euro");
            System.out.println("Press 7: Yuan to Dollar");
            System.out.println("Press 8: Yuan to Rupees");
            System.out.println("Press 9: Yuan to Euro");
            System.out.println("Press 10: Euro to Dollar");
            System.out.println("Press 11: Euro to Rupees");
            System.out.println("Press 12: Euro to Yuan");
            System.out.println("Enter the choice:");
            int input=sc.nextInt();
            switch (input){
                case 1:
                    System.out.println(amount+"$ "+"= "+String.format("%.2f",amount*83.48)+"₹");
                    break;
                case 2:
                    System.out.println(amount+"$ "+"= "+String.format("%.2f",amount*7.27)+"¥");
                    break;
                case 3:
                    System.out.println(amount+"$ "+"= "+String.format("%.2f",amount*0.92)+"€");
                    break;
                case 4:
                    System.out.println(amount+"₹ "+"= "+String.format("%.2f",amount*0.012)+"$");
                    break;
                case 5:
                    System.out.println(amount+"₹ "+"= "+String.format("%.2f",amount*0.087)+"¥");
                    break;
                case 6:
                    System.out.println(amount+"₹ "+"= "+String.format("%.2f",amount*0.011)+"€");
                    break;
                case 7:
                    System.out.println(amount+"¥ "+"= "+String.format("%.2f",amount*0.14)+"$");
                    break;
                case 8:
                    System.out.println(amount+"¥ "+"= "+String.format("%.2f",amount*11.48)+"₹");
                    break;
                case 9:
                    System.out.println(amount+"¥ "+"= "+String.format("%.2f",amount*0.13)+"€");
                    break;
                case 10:
                    System.out.println(amount+"€ "+"= "+String.format("%.2f",amount*1.09)+"$");
                    break;
                case 11:
                    System.out.println(amount+"€ "+"= "+String.format("%.2f",amount*90.58)+"₹");
                    break;
                case 12:
                    System.out.println(amount+"€ "+"= "+String.format("%.2f",amount*7.89)+"¥");
                    break;
                default:
                    System.out.println("No converted currency found");
            }
            System.out.println("Currency is converted");

        }

    }

