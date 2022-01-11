import java.util.ArrayList;
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer
{
    private String name;
    private double sale;
    
    /**
     * Constructor for objects of class Customer
     */
    public Customer(String name, double sale)
    {
      this.name = name;
      this.sale = sale;
    }

    public String getName()
    {
        return this.name;
    }
    
    public double getSale()
    {
        return this.sale;
    }
    
    public void setName(String newName)
    {
        this.name = newName;
    }
    
    public void setSale(double newSale)
    {
        this.sale = newSale;
    }
}
