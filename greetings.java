import java.util.Scanner;
public class greetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose language, press\n1: English\n2: Hindi\n3: French");
        int a = sc.nextInt();
        
        if(a==1) System.out.println("Hello");
        else if(a==2) System.out.println("Namaste");
        else System.out.println("Bonjour");
    }
}
