public class Main {

    public static void main(String)[]args {
        int balance = 100;
        int up_balance = 1100;
        int bonus = 1 * up_balance / 100;
        int total = balance + up_balance + bonus;

        if (up_balance >= 1100) {
            System.out.println("Бонус:" + bonus + "Денег на счету:" + balance);
        } else {
            System.out.println("Денег на счету:" + balance);
        }

    }
}
