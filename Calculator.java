import java.util.Scanner;

class Grade{
    public String grade(int avgp){
        switch (avgp / 10) {
            case 10:
                return "A+";
            case 9:
                return "A";
            case 8:
                return "B+";
            case 7:
                return "B";
            case 6:
                return "C";
            case 5:
                return "D";
            default:
                return "F";
        }
    }
}

public class Calculator{
    public static void main(String[] args){
        Grade g = new Grade();
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the number of subjects");
        int totalsub = sc.nextInt();
        int totalno= 0;

        for (int i = 0; i < totalsub; i++) {
            System.out.println("Enter the number obtained in subject " + (i + 1));
            int number = sc.nextInt();
            totalno += number;
        }

        int avgp = totalno/ totalsub;

        String Grade = g.grade(avgp);
        System.out.println("Total marks obtained :- " + totalno);
        System.out.println("Percentage obtained :- " + avgp+"%");
        System.out.println("Grade obtained :- " + Grade);

        sc.close();
    }
}
