/* Kitthanya Teachanontkullawat (Mine) 64050027
    Factory Pattern */

package customermailapplication;
/**
 *
 * Edit from @author sarun
 */

//make this class a subclass of customer
public class RegularCustomer extends Customer {

    @Override
    public String createMail() {
        return "Regular Customer";
    }
    
}