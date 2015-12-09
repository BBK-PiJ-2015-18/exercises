import java.util.Scanner;

public class SpyRunner {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the id of the first spy");
        String str1 = in.nextLine();
        int int1 = Integer.parseInt(str1);
        Spy spy001 = new Spy(int1);

        Spy spy002 = new Spy(002);
        Spy spy003 = new Spy(003);
        Spy spy004 = new Spy(004);
        Spy spy005 = new Spy(005);
        Spy spy006 = new Spy(006);

        spy004.die();
        spy002.die();
    }
}