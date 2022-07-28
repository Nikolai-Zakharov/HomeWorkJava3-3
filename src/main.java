public class main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Ежемесячный платеж при займе на 1 000 000 рублей, с процентной ставкой 9.99 % годовых, сроком на 1 год составляет:");
        System.out.println(service.calculate(1_000_000, 9.99, 12));
        System.out.println("Рублей");

        System.out.println("Ежемесячный платеж при займе на 1 000 000 рублей, с процентной ставкой 9.99 % годовых, сроком на 2 года составляет:");
        System.out.println(service.calculate(1_000_000, 9.99, 24));
        System.out.println("Рублей");

        System.out.println("Ежемесячный платеж при займе на 1 000 000 рублей, с процентной ставкой 9.99 % годовых, сроком на 3 года составляет:");
        System.out.println(service.calculate(1_000_000, 9.99, 36));
        System.out.println("Рублей");
    }
}
