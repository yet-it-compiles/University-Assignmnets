
/**
 *
 * @author bmxfr
 */
public class Employee {
    protected String name, title;
    protected double pay;
    
    public Employee(){
        this.name = "blank";
        this.title = "MSR";
        this.pay = 14.00;
    }
    
    public Employee(String name, String title, double pay){
        this.name = name;
        this.title = title;
        this.pay = pay;  
    }
    
    public String toString(){
        return "Employee Info - \n " + this.name + " \n " + this.title + " \n " + this.pay;
    }
    
    
}
