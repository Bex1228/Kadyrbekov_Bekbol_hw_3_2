public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(15000);

        double withdrawalAmount = 6000;

        while (true) {
            try {
                account.withdraw(withdrawalAmount);
                System.out.println("На счету: " + withdrawalAmount + " KGS");
            } catch (LimitException e) {
                double remainingAmount = e.getRemainingAmount();
                System.out.println("Достигнут лимит вывода. Оставшееся количество: " + remainingAmount + " KGS");
                break;
            }
        }
    }
}