import java.util.Scanner;

public class soalMudah2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int input_user = input.nextInt();
        if (input_user % 2 == 0) {
            System.out.println("Bilangan " + input_user + "Genap");
        } else {
            System.out.println("Bilangan " + input_user +"Ganjil");
        }

        input.close();
    }
}
