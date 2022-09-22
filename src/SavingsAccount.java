public class SavingsAccount {
    private float annualInterestRateClient; // taxa de juros anual para todos os correntistas
    private float savingsBalance; // indicar a quantidade que o poupador atualmente tem em depósito

    private double monthlyInterest;

    public void calculateMonthlyInterest() { // calcular os juros mensais multiplicando o savingsBalance por annualInterestRate dividido por 12
         this.monthlyInterest = this.savingsBalance * this.annualInterestRateClient / 12;

         this.savingsBalance -= this.monthlyInterest;
    }

    SavingsAccount(float rate) {
        modifyInterestRate(rate);
    }

    public double getBalance(){
        return this.savingsBalance;
    }

    public void setSavingBalance(float balance) {
        this.savingsBalance = balance;
    }

    public void modifyInterestRate(float rate) { //  configure o annualInterestRate com um novo valor
        this.annualInterestRateClient = rate;
    }
}
