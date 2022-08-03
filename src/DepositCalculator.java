import java.util.Scanner;

public class DepositCalculator {
    double random(double value, int places) {
        double ScaLe= Math.pow(10, places);

        return Math.round(value*ScaLe)/ScaLe;
    }

    double calculateComplexPercent(double a, double y, int d) {
        double pay = a * Math.pow((1 + y / 12), 12 * d);

        return random(pay, 2);
    }

    double calculateSimplePercent(double doubleAmount, double double_year_rate, int deposit_period) {
        return random(doubleAmount + doubleAmount * double_year_rate * deposit_period, 2);
    }

    void giveInfo() {
        int period;
        int action;
        double outDoubleVar = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада в рублях:") ;
        int amount = scanner.nextInt();
        System.out.println("Введите срок вклада в годах:") ;
        period = scanner.nextInt();
        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = scanner.nextInt();
        if (action ==1 ) {
            outDoubleVar = calculateSimplePercent(amount, 0.06, period);
        } else if (action == 2) {
            outDoubleVar = calculateComplexPercent(amount, 0.06, period);
        }
        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + outDoubleVar);
    }

    public static void main(String[] args) {
        new DepositCalculator().giveInfo();
    }
}