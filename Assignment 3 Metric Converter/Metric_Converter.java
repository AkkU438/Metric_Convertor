

import java.util.Scanner;

public class Metric_Converter {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Please input a number 1-4");
        System.out.println("1: Kilograms to Pounds");
        System.out.println("2: Centimeters to Inches");
        System.out.println("3: Kilometers to Miles");
        System.out.println("4: Grams to Ounces");

        Scanner myNum = new Scanner(System.in);
        int scanNum = myNum.nextInt();
        
        switch (scanNum){
            case 1:
            System.out.println("Do you want to continue (press any number), or exit the program? (enter -1)");
            Scanner mykilo = new Scanner(System.in);
            int kilo = mykilo.nextInt();
            
            while(kilo != -1){
                System.out.println("Please print out the amount of kilograms");
                Scanner myKilo = new Scanner(System.in);
                float kilo1 = myKilo.nextFloat();
                if(kilo1 == -1){
                    break;
                }else{
                System.out.println("The amount in pounds is " + kilo1*2.2F);  
                } 
                
            }
            break; 
            case 2: 
            System.out.println("Do you want to continue (press any number), or exit the program? (enter -1)");
            Scanner myCenti = new Scanner(System.in);
            int centi = myCenti.nextInt();

            while(centi != -1){
                System.out.println("Please print out the amount of centimeters");
                Scanner mycenti = new Scanner(System.in);
                float centi1 = mycenti.nextFloat();
                if(centi1 == -1){
                    break;
                }else{
                System.out.println("The amount in inches is " + centi1/2.54F); 
                    
                }             
                
            }
            break;
            case 3: 
            System.out.println("Do you want to continue (press any number), or exit the program? (enter -1)");
            Scanner myMeters = new Scanner(System.in);
            int meters = myMeters.nextInt();
            while(meters != -1){
                System.out.println("Please print out the amount of kilometers");
                Scanner mymeters = new Scanner(System.in);
                float meters1 = mymeters.nextFloat();
                if(meters1 == -1){
                    break;
                }else{
                System.out.println("The amount in miles is " + meters1/1.609F);
                    
                }             
                
            }
            break;
            case 4: 
            System.out.println("Do you want to continue (press any number), or exit the program? (enter -1)");
            Scanner myGrams = new Scanner(System.in);
            int grams = myGrams.nextInt();
            while(grams != -1){
                System.out.println("Please print out the amount of grams");
                Scanner mygrams = new Scanner(System.in);
                float grams1 = mygrams.nextFloat();
                if(grams1 == -1){
                    break;
                }else{
                System.out.println("The amount in miles is " + grams1/28.35F);
                    
                }             
                
            }
            break;
            default: 
            System.out.println("Sorry, your input is not currently handled by this app, please input another query, for example, 1 kg = lb" );
            break;
        }
    }
}
