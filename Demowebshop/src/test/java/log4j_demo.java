




import org.apache.log4j.Appender;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
public class log4j_demo {
    
    static Logger l = Logger.getLogger(log4j_demo.class.getName());
    public static void main(String[] args) {
    Layout l1 = new SimpleLayout();
    Appender a;
    try
    {
    a = new FileAppender(l1,"mylog.txt", false);
    l.addAppender(a);
    }
    catch(Exception e) {}
    l.info("user enters valid Registration details system enters into home page");
    l.fatal("user enters invalid  Registration details system displayes enter valid details");
    l.fatal("user didnt enter any values and performed registration and system shows error  ");
    l.info("user enters valid login details system enters into home page");
    l.fatal("user enters invalid  login details system displayes enter valid details");
    l.fatal("user didnt enter any values in username and password ");
    l.info("user enters emailid and the email is sent to his mail");
    l.fatal("user enters invalid email and system shows error");
    l.fatal("user didnt enter any mail and system shows error");
    l.info("user search for valid product in the search tab and system displays valid product");
    l.fatal("user search for a invalid product and system shows item is not present");
    l.fatal("user search a product with singleword the system doesnt show any product");
    l.info("user selects Electronics and system displays Electronics category");
    l.info("user selects Books and system displays Books category");
    l.info("user selects Computer and system displays sesktop Computer");
    l.info("user selects Appearel&shoes and system displays Appearel&shoes category");
    l.info("user selects DigitalDownloads and system displays Digital downloads");
    l.info("user selects Jewallary and system displays Jewallary category");
    l.info("user selects Giftcards and system displays Giftcards");
    l.info("user selected view as list to view products as list");
    l.info("user selected view as grid to view products as grid");
    l.info("user selects filter by costs below 1000 and system displays accordingly");
    l.info("user selects filter by costs between 1000 to 1200 and system displays accordingly");
    l.info("user selects filter by costs above 1200 and system displays accordingly");
    l.info("user selects filter by position and system displays accordingly");
    l.info("user selects filter by Name A-Z and system displays accordingly");
    l.info("user selects filter by Name Z-A and system displays accordingly");
    l.info("user add items to cart");
    l.info("user updated the quantity of products in wishlist");
    l.info("user updates the shipping cart and system shows the updated cart");
    l.info("user checkout his details,address,payment and confirms order");
    l.info("user selected trencities to show about manufactures");
    l.info("User selected youtube and System displays youtube");
    l.info("User selected rss and System displays rss");
    l.info("User selected twitter and System displays twitter");
    l.info("User selected facebook and System displays facebook");
    l.info("User selected google+ and System displays google+");
    l.info("User selected news and System displays news");
    l.info("User selected blog and System displays blog");
    l.info("User selected recently viewed product and System displays recently viewed product");
    l.info("User selected compare products list and System displays compare products list");
    l.info("User selected News product and System displays News product");
    l.info("User selected sitemap and System displays sitemap");
    l.info("User selected Shipping&returns and System displays Shipping&returns");
    l.info("User selected Privacy Notice and System displays Privacy Notice");
    l.info("User selected Conditions of use and System displays Condition of use");
    l.info("User selected About us and System displays About us");
    l.info("User selected Contact us and System displays Contact us");
    l.info("User selected Myaccount and System displays Myaccount");
    l.info("user enters same password and confirm password");
    l.fatal("user enters different password as password and confirm password");
    l.info("User selected orders and System displays orders");
    l.info("User selected Addresses and System displays Addresses");
    l.info("user enters valid email in newsletter and subscribbed");
    l.fatal("user enters invalid email in newsletter and subscribbed");
    l.info("user perform logout and user logged out of demo web shop");
    l.info("User selects good in community poll after login");
    l.fatal("User selects good in community poll without login");
    l.fatal("User doesnt selects anything in community poll ");
    
    System.out.println("Your logic executed successfully....");
    
    }
}

