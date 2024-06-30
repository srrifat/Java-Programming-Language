import java.util.*;

public class input {    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("You entered: " +name);
        int numebr =sc.nextInt();
        System.out.println("You entered: "+numebr);

        float price = sc.nextFloat();
        System.out.println("You entered: "+price);   
        sc.close();
    }
}
