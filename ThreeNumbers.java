import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int main = 735;
        int firstNumber = main / 100;
        int secondNumber = (main / 10) % 10;
        int thirdNumber  = (main % 10);
        System.out.println(firstNumber+""+secondNumber+""+thirdNumber);

    }
}
