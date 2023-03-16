import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int shc=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n");
        n= scanner.nextInt();
        for (int i=1;i<n;i++){
            if (n%i==0){
                shc=shc+i;
            }
        }
        if (shc==n){
            System.out.println("la so hoan chinh");
        }else {
            System.out.println("khong phai so hoan chinh");
        }
    }
}