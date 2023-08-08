/* Kitthanya Teachanontkullawat (Mine) 64050027
    Factory Pattern */

package customermailapplication;
/**
 *
 * Edit from @author sarun
 */

public class CustomerFactory {
    public static Customer createCustomer(String type) {
        switch(type) {
            case "Regular":
                return new RegularCustomer();

            case "Mountain":
                return new MountainCustomer();

            case "Delinquent":
                return new DelinquentCustomer();
            default:
                return null;
        }
    }
}