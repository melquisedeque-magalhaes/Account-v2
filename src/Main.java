import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float annualInterestRate;

        Scanner input = new Scanner(System.in);

        System.out.println("Qual e o valor da taxa anual ?");
        annualInterestRate = Float.parseFloat(input.nextLine());

        SavingsAccount save1 = new SavingsAccount(annualInterestRate);
        SavingsAccount save2 = new SavingsAccount(annualInterestRate);

        System.out.println("Digite o saldo do cliente 1");
        float balance1 = Float.parseFloat(input.nextLine());
        save1.setSavingBalance(balance1);

        System.out.println("Digite o saldo do cliente 2");
        float balance2 = Float.parseFloat(input.nextLine());
        save2.setSavingBalance(balance2);

        save1.calculateMonthlyInterest();
        save2.calculateMonthlyInterest();

        System.out.println("O saldo do cliente 1 é " + save1.getBalance());
        System.out.println("O saldo do cliente 2 é " + save2.getBalance());
    }
}