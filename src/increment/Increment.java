/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package increment;

public class Increment {
    
    public static void main(String[] args)
    {
        // demonstrate postfix increment operator
        int c = 5;
        System.out.printf("c before postincrement: %d%n", c); // prints 5
        System.out.printf("    postincrement: %d%n", c++); // prints 5
        System.out.printf("c after postincrement: %d%n", c); // prints 6
        
        System.out.println(); // skip a line
        // demonstrate prefix increment operator
        c = 5;
        System.out.printf(" c before preincrement: %d%n", c); // prints 5
        System.out.printf("    preincrement: %d%n", ++c); // prints 6
        System.out.printf("c after preincrement: %d%n", c); // prints 6
    }
} // end class Increment
