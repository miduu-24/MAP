import java.util.Scanner;

//prime numbers
// 1 2 3 4 5 6 a 70 117 113
public class Main {
    public static boolean prim(int x){

        boolean p = true;
        int nr_div = 0;

        for (int d = 1; d <= x; d++)
            if(x % d == 0)
                nr_div++;

        if (nr_div > 2 || x == 1)
            p = false;

        return p;
    }

    public static void main(String[] args) {
        if(args.length == 0) {
            Scanner myObj = new Scanner(System.in);

            int n = 0;
            boolean done = false;
            while (!done) {
                try{
                System.out.print("Length: ");
                n = myObj.nextInt();
                done = true;
                }
                catch (Exception e){
                    System.out.println("Please add a number, not a string");
                    myObj.next ();
                }

            }

            int [] nr = new int[n];

            for (int i = 0; i < n; i++){
                done = false;
                while (!done) {
                    try{
                        System.out.print("nr[" + i + "]= ");
                        nr[i] = myObj.nextInt();
                        done = true;
                    }
                    catch (Exception e){
                        System.out.println("Please add a number, not a string");
                        myObj.next ();
                    }
                }
            }
            for (int i = 0; i < n; i++)
                if(prim(nr[i]))
                    System.out.println(nr[i]);
        }
        else{
            for (String arg : args) {
                try {
                    int x = Integer.parseInt(arg);
                    if (prim(x))
                        System.out.println(arg);
                } catch (Exception e) {

                }
            }
        }


    }
}