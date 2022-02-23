public class Main {

    public static void main(String[] args) {
        int balance = 1;
        int upBalance = 2000;
        int bonus = upBalance / 100;

//        int total1 = balance + upBalance + bonus;
//        int total2 = balance + upBalance;

//         int sum = upBalance >= 1100? total1 : total2;
//         System.out.println ("На счету: " + sum);

        if (upBalance >= 1100) {
            int total = balance + upBalance + bonus;
            System.out.println("Бонус: " + bonus + " р. Денег на счету: " + total + " р.");
        } else {
            int total = balance + upBalance;
            System.out.println("Бонус: 0 " + "Денег на счету: " + total);
        }

    }
}
