class Pizza{

     private static int orderCounter = 0;
    private int orderId;         
    private String customerName;  
    private String pizzaType;     
    {
        orderId = ++orderCounter; 
    }
    Pizza(String customerName, String pizzaType) {
        this.customerName = customerName;
        this.pizzaType = pizzaType;
    }
    public int getOrderId() {
        return orderId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getPizzaType() {
        return pizzaType;
    }
}
public class Pizzarestaurant {
    public static void main(String[] args) {
        
        Pizza order1 = new Pizza("Ali", "Pepperoni");
        Pizza order2 = new Pizza("Khalid", "Margherita");
        Pizza order3 = new Pizza("Jabbir", "BBQ Chicken");
        Pizza order4 = new Pizza("Bulbul", "Rabbit pizza");

        System.out.println("Order ID: " + order1.getOrderId() + ", Customer: " + order1.getCustomerName() + ", Pizza: " + order1.getPizzaType());
        System.out.println("Order ID: " + order2.getOrderId() + ", Customer: " + order2.getCustomerName() + ", Pizza: " + order2.getPizzaType());
        System.out.println("Order ID: " + order3.getOrderId() + ", Customer: " + order3.getCustomerName() + ", Pizza: " + order3.getPizzaType());
        System.out.println("Order ID: " + order4.getOrderId() + ", Customer: " + order4.getCustomerName() + ", Pizza: " + order4.getPizzaType());

    }
}
