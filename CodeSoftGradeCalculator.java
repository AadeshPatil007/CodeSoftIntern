import java.util.Scanner;

public class CodeSoftGradeCalculator {
    public static void main(String args[]){
    Scanner user = new Scanner(System.in);
    
    System.out.println("Enter your Marks out of 100: ");
    System.out.print("English: ");
    int eng = user.nextInt();
    System.out.print("Mathematics: ");
    int math = user.nextInt();
    System.out.print("Marathi: ");
    int mar = user.nextInt();
    System.out.print("Physics: ");
    int phy = user.nextInt();
    System.out.print("Chemistry: ");
    int chem = user.nextInt();

    if(eng>100 || eng<0 || math>100 || math<0 || mar>100 || mar<0 || phy>100 || phy<0 || chem>100 || chem<0){
        System.out.println("Invlaid entry");
        System.out.println("Please enter the valid marks");
    }
    else{
    System.out.println("Total Marks obtained: "+ (eng+math+mar+phy+chem));

    int avg = ((eng+math+mar+phy+chem)/5);
    System.out.println("Average Percentage obtained: "+ avg);

    if(avg> 90){
        System.out.println("Grade Obtained: A");
    }
    else if(avg<= 90 && avg>80){
        System.out.println("Grade Obtained: B");
    }
    else if(avg<= 80 && avg>70){
        System.out.println("Grade Obtained: C");
    }
    else if(avg<= 70 && avg>60){
        System.out.println("Grade Obtained: D");
    }
    else{
        System.out.println("Result Failed");
    }

    }

    user.close();
    }
}
