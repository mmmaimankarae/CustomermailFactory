/* Kitthanya Teachanontkullawat (Mine) 64050027
    Factory Pattern */

package customermailapplication;
/**
 *
 * Edit from @author sarun
 */

public class CustomerMailApplication {
    
    public static void main(String[] args) {
        Customer factory = CustomerFactory.createCustomer("Mountain");
        System.out.println(factory.createMail());
    }
}