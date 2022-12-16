import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String bullsN;
        String cowsN;
        int bulls ;
        int cows ;
        int[] number = new int[2];
        int[] inputMass = new int[2];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < number.length; i++) {
            number[i] = getRandomDiceNumber();
        }
        System.out.println("0- Exit");
        while (true) {
            bulls = 0;
            cows = 0;

/*
            for (int i = 0; i < number.length; i++) {
                System.out.print(number[i] + " ");
            }
*/
            System.out.println("Угадайте 2 числа. Каждое от 1 - 8 ");

            for (int i = 0; i < number.length; i++) {

                int input = scanner.nextInt();
                inputMass[i]= input;

            }
            for (int i = 0; i < inputMass.length; i++) {
                if (inputMass[i] == number[i]) { bulls++;}
for (int j = 0; j < number.length; j++) {
                    if ((inputMass[i] != number[i]) && (inputMass[i] == number[j])) {
                        cows++;
                    }
}

                }

if (bulls >1) { bullsN = " Быка ";  } else  { bullsN = " Бык "; }
            if (cows >1) { cowsN = " Коров ";  } else  { cowsN = " Корова \n "; }
System.out.println(bulls + bullsN+ cows + cowsN);
            if (bulls == number.length) { System.out.println("Угадали !");break; }
        }

    }
    public static int getRandomDiceNumber()
    {
        return (int) (Math.random() * 8) + 1;
    }

}