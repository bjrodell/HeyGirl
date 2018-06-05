
package heygirl;

/**
 *
 * @author Marcus
 */

import java.util.Scanner; 

public class HeyGirl {

    /**
     * @param args the command line arguments
     */
   
        Scanner scan = new Scanner(System.in);

        System.out.println("Hey Girl!!");
        System.out.println("Do you say hi back? (Y/N)");
       
        String s = scan.next();

        while(!(s.equalsIgnoreCase("Y") || s.equalsIgnoreCase("N"))){
            System.out.println("Y or N");
            s = scan.next();
        }
        
        System.out.println("Weirdo....");
        
    }
}
    

