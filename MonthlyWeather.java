/*
 * Michael Masters
 * 9/17/2023
 * Module 5 CTA Option 2
 */

 import java.util.*;

 public class MonthlyWeather 
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int userChoice = 0;
            int monthNum = 1;

            // Average Monthly Temperature (in Fahrenheit) in the U.S. in 2022. 
            // Source: https://www.statista.com/statistics/513628/monthly-average-temperature-in-the-us-fahrenheit
            Double[] avgTemperature = new Double[]
                {31.17, 33.69, 44.08, 50.65, 61.88, 70.79, 76.41, 74.59, 68.02, 55.26, 40.89, 33.06};

            String[] months = new String[]
                {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", "Yearly"};
            
            // Display months or yearly and ask the user to make a selection.
            for (String i : months)
                {
                    System.out.println(monthNum++ + ". " + i);
                }
            System.out.print("Please make a selection: ");
            userChoice = sc.nextInt();

            switch (userChoice)
                {
                    case 1:
                        System.out.print("The average temperature in " + months[0] + " was " + avgTemperature[0] + " °F.");
                        break;
                    case 2:
                        System.out.print("The average temperature in " + months[1] + " was " + avgTemperature[1] + " °F.");
                        break;
                    case 3:
                        System.out.print("The average temperature in " + months[2] + " was " + avgTemperature[2] + " °F.");
                        break;
                    case 4:
                        System.out.print("The average temperature in " + months[3] + " was " + avgTemperature[3] + " °F.");
                        break;
                    case 5:
                        System.out.print("The average temperature in " + months[4] + " was " + avgTemperature[4] + " °F.");
                        break;
                    case 6:
                        System.out.print("The average temperature in " + months[5] + " was " + avgTemperature[5] + " °F.");
                        break;
                    case 7:
                        System.out.print("The average temperature in " + months[6] + " was " + avgTemperature[6] + " °F.");
                        break;
                    case 8:
                        System.out.print("The average temperature in " + months[7] + " was " + avgTemperature[7] + " °F.");
                        break;
                    case 9:
                        System.out.print("The average temperature in " + months[8] + " was " + avgTemperature[8] + " °F.");
                        break;
                    case 10:
                        System.out.print("The average temperature in " + months[9] + " was " + avgTemperature[9] + " °F.");
                        break;
                    case 11:
                        System.out.print("The average temperature in " + months[10] + " was " + avgTemperature[10] + " °F.");
                        break;
                    case 12:
                        System.out.print("The average temperature in " + months[11] + " was " + avgTemperature[11] + " °F.");
                        break;
                    case 13:
                        double minAverage = Collections.min(Arrays.asList(avgTemperature));
                        double maxAverage = Collections.max(Arrays.asList(avgTemperature));

                        for (int i = 0; i < avgTemperature.length; i++) {
                            String month = months[i];
                            double temperature = avgTemperature[i];
                            System.out.println (month + " : " + temperature + "°F.");
                        }
                        System.out.println("The lowest average temperature was: " + minAverage + " °F.");
                        System.out.println("The highest average temperature was: " + maxAverage + " °F.");
                }
            sc.close();
        }   
    }