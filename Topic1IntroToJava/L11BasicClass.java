public class L11BasicClass {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.firstname = "Jon";
        customer1.lastname = "Snow";
        System.out.println(customer1.firstname);
        System.out.println(customer1.lastname);

        Customer customer2 = new Customer();
        customer2.firstname = "Jamie";
        customer2.lastname = "Lannister";
        System.out.println(customer2.firstname);
        System.out.println(customer2.lastname);

    }
    
}


class Customer {
    public String firstname = "";
    public String lastname = "";
}