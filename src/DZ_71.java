import java.util.Scanner;

public class DZ_71 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.next();

        Integer s=null,q=null;

        try{
            s=Integer.valueOf(a);
        }
        catch (NumberFormatException numberFormatException){
            for (int i = 0; i < 1;) {
            if (s!=null)
            i++;
            else
            { System.out.println("Надо ввести 1 число");
                a = scanner.next();
                try {
                    s = Integer.valueOf(a);
                }
                catch (NumberFormatException numberFormatException1){}
            }

        }}


        try{
        q=Integer.valueOf(b);
        }
        catch (NumberFormatException numberFormatException){
            for (int i = 0; i < 1;) {
                if (q!=null)
                    i++;
                else
                { System.out.println("Надо ввести 2 число");
                    b = scanner.next();
                    try {
                        q= Integer.valueOf(b);
                    }
                    catch (NumberFormatException numberFormatException1){}
                }

            }}

        System.out.println(s+q);
    }
}
