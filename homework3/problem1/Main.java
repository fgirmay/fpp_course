public class Main {
    
    public static void main(String[] args){

        //Create address
        // (String street, String city, String state, String zip)
        // Address: 1000 N 4th St, Fairfield, IA 52557
        Address address1 = new Address("1000 N 4th St", "Fairfield", "Iowa", "52557");
        Address address2 = new Address("1300 S 6th St", "Addis Ababa", "Addis Ababa", "90320");
        Address address3 = new Address("3498 E 7th St", "Chicago", "Illinois", "344298");

        //Create three instances of customer
        Customer[] customers = new Customer[3];
        Customer customer1 = new Customer("Fissehaye", "Girmay", "432972");
        customer1.setBillingAddress(address1);
        customer1.setShippingAddress(address1);

        Customer customer2 = new Customer("Selam", "Asfeha", "879782");
        customer2.setBillingAddress(address2);
        customer2.setShippingAddress(address2);

        Customer customer3 = new Customer("Temesgen", "Kahsay", "232392");
        customer3.setBillingAddress(address3);
        customer3.setShippingAddress(address3);

        customers[0] = customer1;
        customers[1] = customer2;
        customers[2] = customer3;

        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getBillingAddress().getCity().equals("Chicago")){
                System.out.println(customers[i]);
            }
        }

    }
}