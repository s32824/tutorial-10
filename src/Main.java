public class Main {
    public static void main(String[] args) {
        //exercise 1
        UserValidator validator = new UserValidator();

        validator.addRule(form -> form.email().contains("@"));
        validator.addRule(form -> form.password().length() >= 8);
        validator.addRule(form -> form.age() >= 18);

        UserForm form = new UserForm("anna@example.com", "password123", 20);
        System.out.println("Is form valid: " + validator.isValid(form));

        //exercise 2
        ServiceOrder order = new ServiceOrder("Alpha Company", 10, 120.0);
        PriceCalculator calculator = new PriceCalculator();

        PriceStrategy standard = o -> o.hours() * o.hourRate();
        PriceStrategy discount = o -> o.hours() * o.hourRate() * 0.90;
        PriceStrategy weekend = o -> o.hours() * o.hourRate() * 1.25;

        System.out.println(calculator.calculate(order, standard));
        System.out.println(calculator.calculate(order, discount));
        System.out.println(calculator.calculate(order, weekend));

        //exrecise 3
        Order orde = new Order("ORD-100", "Anna Kowalska");

        orde.addItem(new Order.OrderItem("Keyboard", 249.99, 1));
        orde.addItem(new Order.OrderItem("Mouse", 99.99, 2));

        OrderSummary summary = new OrderSummary(
                orde.getOrderNumber(),
                orde.getCustomerName(),
                orde.total()
        );

        System.out.println(summary);
    }
}