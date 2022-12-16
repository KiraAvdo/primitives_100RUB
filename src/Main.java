public class Main {
    public static void main(String[] args) {
        System.out.println("Приветствуем! ");

        int startScore = 100;
        int amount = 1100;
        int bonus = (amount / startScore);
        int total = bonus + startScore + amount;
        if (amount > 1000) {
            System.out.println("Вы пополнили счет более, чем на 1000 рублей. Ваш бонус составил " + bonus + " бонусных рублей, итоговая сумма на вашем счете = " + total + " рублей.");
        } else {
            System.out.println("Спасибо за пополнение счета. На вашем счету = " + (startScore+amount) + " рублей/рубля");
        }

        System.out.println("Рады, что вы являетесь нашим клиентом!");

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}