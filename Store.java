
/**
 * Write a description of class Store here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Store
{
    // instance variables - replace the example below with your own
    private ArrayList<Customer> customers;

    /**
     * Constructor for objects of class Store
     */
    public void addSale(String customerName, double amount)
    {
        customers.add(new Customer(customerName, amount));
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String nameOfBestCustomer()
    {
        String topCustomer = customers(0);
        
    }
}
