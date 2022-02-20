public class Main {

    public static void main(String[] args) {
        int balance = 1;
        int up_balance = 2000;
        int bonus = up_balance / 100;

//        int total1 = balance + up_balance + bonus;
//        int total2 = balance + up_balance;

//         int sum = up_balance >= 1100? total1 : total2;
//         System.out.println ("На счету: " + sum);

        if (up_balance >= 1100) {
            int total = balance + up_balance + bonus;
            System.out.println("Бонус: " + bonus + " р. Денег на счету: " + total + " р.");
        } else {
            int total = balance + up_balance;
            System.out.println("Бонус: 0 " + "Денег на счету: " + total);
        }

    }
}
