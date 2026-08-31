import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] salary = new int[n];
        for (int i = 0; i < salary.length; i++) {
            salary[i] = sc.nextInt();
        }
        for (int i = 0; i < salary.length; i++) {
            int updatedSalary = salary[i] + (salary[i] * 10 / 100);
            System.out.println(updatedSalary);
        }
        sc.close();
    }
}