import java.util.Scanner;
import java.util.StringTokenizer;

class Customer {
    String name, dob;
    void read(){
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        dob = sc.next();
        sc.close();
    }

    void Display(){
        StringTokenizer st = new StringTokenizer(dob,"/");
        while (st.hasMoreTokens()){
            System.out.print("," + st.nextToken());
        }
    }
}
public class Token {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.read();
        c.Display();
    }
}
