import java.util.Scanner;

public class softDrink{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int p=sc.nextInt();
        int nl=sc.nextInt();
        int np=sc.nextInt();

        int total=k*l;
        int drink=total/(n*nl);
        int limes=(c*d)/n;
        int salt=p/(n*np);

        System.out.print(Math.min(salt,Math.min(drink,limes)));

    }
}