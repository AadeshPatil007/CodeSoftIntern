import java.util.Scanner;

public class CurrencyCalculator {
     public static void main(String args[]){
        Scanner user = new Scanner(System.in);

        System.out.println("Various CURRENCIES are given below: ");
        System.out.println(" Enter 1: Indian Rupee \n Enter 2: Euro \n Enter 3: US Dollar \n Enter 4: Japanese Yen \n Enter 5: British Pound \n");

        System.out.print("Choose the base currency which is to be converted: ");
        int base = user.nextInt();
        if(base != 1 && base != 2 && base != 3 && base != 4 && base != 5){
            System.out.println("Invalid Entry");
            System.exit(0);
        }

        System.out.print("Choose the target currency: ");
        int target = user.nextInt();
        if(target != 1 && target != 2 && target != 3 && target != 4 && target != 5){
            System.out.println("Invalid Entry");
            System.exit(0);
        }

        System.out.println();
        System.out.print("Enter The Amount: ");
        double amount = user.nextDouble();
        double result = 0 ;
        

        if(base == 1 && target == 1 ){
            result = amount;
            System.out.println("Hence, "+ amount +" Indian Rupee " + " = "+ result +" Indian Rupee");
        }
        else if(base == 1 && target == 2){
            result = (amount* 0.011);
            System.out.println("Hence, "+ amount +" Indian Rupee " + " = "+ result +" Euro");
        }
        else if(base == 1 && target == 3){
            result = (amount* 0.012);
            System.out.println("Hence, "+ amount +" Indian Rupee " + " = "+ result +" US Dollar");
        }
        else if(base == 1 && target == 4){
            result = (amount* 1.74);
            System.out.println("Hence, "+ amount +" Indian Rupee " + " = "+ result +" Japanese Yen");
        }
        else if(base == 1 && target == 5){
            result = (amount* 0.0095);
            System.out.println("Hence, "+ amount +" Indian Rupee " + " = "+ result +" British Pound");
        }
        else if(base == 2 && target == 2){
            result = amount;
            System.out.println("Hence, "+ amount +" Euro " + " = "+ result +" Euro");
        }
        else if(base == 2 && target == 3){
            result = (amount* 1.09);
            System.out.println("Hence, "+ amount +" Euro " + " = "+ result +" US Dollar");
        }
        else if(base == 2 && target == 4){
            result = (amount* 158.69);
            System.out.println("Hence, "+ amount +" Euro " + " = "+ result +" Japanese Yen");
        }
        else if(base == 2 && target == 5){
            result = (amount* 0.86);
            System.out.println("Hence, "+ amount +" Euro " + " = "+ result +" British Pound");
        }
        else if(base == 2 && target == 1){
            result = (amount* 90.83);
            System.out.println("Hence, "+ amount +" Euro " + " = "+ result +" Indian Rupee");
        }
        else if(base == 3 && target == 3){
            result = amount;
            System.out.println("Hence, "+ amount +" US Dollar " + " = "+ result +" US Dollar");
        }
        else if(base == 3 && target == 4){
            result = (amount* 144.97);
            System.out.println("Hence, "+ amount +" US Dollar " + " = "+ result +" Japanese Yen");
        }
        else if(base == 3 && target == 5){
            result = (amount* 0.79);
            System.out.println("Hence, "+ amount +" US Dollar " + " = "+ result +" British Pound");
        }
        else if(base == 3 && target == 1){
            result = (amount* 83.00);
            System.out.println("Hence, "+ amount +" US Dollar " + " = "+ result +" Indian Rupee");
        }
        else if(base == 3 && target == 2){
            result = (amount* 0.91);
            System.out.println("Hence, "+ amount +" US Dollar " + " = "+ result +" Euro");
        }
        else if(base == 4 && target == 4){
            result = amount;
            System.out.println("Hence, "+ amount +" Japanese Yen " + " = "+ result +" Japanese Yen");
        }
        else if(base == 4 && target == 5){
            result = (amount* 0.0054);
            System.out.println("Hence, "+ amount +" Japanese Yen " + " = "+ result +" British Pound");
        }
        else if(base == 4 && target == 3){
            result = (amount* 0.0069);
            System.out.println("Hence, "+ amount +" Japanese Yen " + " = "+ result +" US Dollar");
        }
        else if(base == 4 && target == 1){
            result = (amount* 0.57);
            System.out.println("Hence, "+ amount +" Japanese Yen " + " = "+ result +" Indian Rupee");
        }
        else if(base == 4 && target == 2){
            result = (amount* 0.0063);
            System.out.println("Hence, "+ amount +" Japanese Yen " + " = "+ result +" Euro");
        }
        else if(base == 5 && target == 5){
            result = amount;
            System.out.println("Hence, "+ amount +" British Pound " + " = "+ result +" British Pound");
        }
        else if(base == 5 && target == 4){
            result = (amount* 184.57);
            System.out.println("Hence, "+ amount +" British Pound " + " = "+ result +" Japanese Yen");
        }
        else if(base == 5 && target == 3){
            result = (amount* 1.27);
            System.out.println("Hence, "+ amount +" British Pound " + " = "+ result +" US Dollar");
        }
        else if(base == 5 && target == 1){
            result = (amount* 105.61);
            System.out.println("Hence, "+ amount +" British Pound " + " = "+ result +" Indian Rupee");
        }
        else if(base == 5 && target == 2){
            result = (amount* 1.16);
            System.out.println("Hence, "+ amount +" British Pound " + " = "+ result +" Euro");
        }
        else{
            System.out.println("Invalid Entry... ");
            System.exit(0);
        } 

        

        user.close();
    }
}
