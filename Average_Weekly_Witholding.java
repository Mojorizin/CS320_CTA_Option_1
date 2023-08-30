import java.util.Scanner;

public class Average_Weekly_Witholding
    {
        public static void main(String [] args)
            {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter your weekly gross pay: ");
                double userWage = input.nextDouble();
                input.close();

                double taxRate;
                double netPay;
                if (userWage >= 2500) {
                    taxRate = 0.25;
                    netPay = (userWage - (taxRate*userWage));
                    System.out.printf("Your weekly net pay is: $" + "%.2f", netPay);
                }
                else if (userWage >= 1500 && userWage < 2500) {
                    taxRate = 0.20;
                    netPay = (userWage - (taxRate*userWage));
                    System.out.printf("Your weekly net pay is: $" + "%.2f", netPay);
                }
                else if (userWage >= 500 && userWage < 1500) {
                    taxRate = 0.15;
                    netPay = (userWage - (taxRate*userWage));
                    System.out.printf("Your weekly net pay is: $" + "%.2f", netPay);
                }
                else {
                    taxRate = 0.10;
                    netPay = (userWage - (taxRate*userWage));
                    System.out.printf("Your weekly net pay is: $" + "%.2f", netPay);
                }
            }
    }       
