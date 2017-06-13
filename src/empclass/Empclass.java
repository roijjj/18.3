/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empclass;
import java.util.*;

/**
 *
 * @author cody
 */
public class Empclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner scanner = new Scanner(System.in);

            employeemap employeeMap = new employeemap();

            
             employeeMap.add(new employee("dave",1));
        employeeMap.add(new employee("bob",2));
        employeeMap.add(new employee("cody",3));
        employeeMap.add(new employee("tom",4));

        //ask use to add a employee name
        System.out.print("add an employee: ");
                String na = scanner.nextLine();
                
                //add an employee id
                 System.out.print("add the id number of the emplyee: ");
                int id1 = scanner.nextInt();
                
         employeeMap.add(new employee(na, id1));

          try
            {
                     
                //ask user to search fo an id 
                System.out.print("Enter the id number you want to search for: ");
                int id = scanner.nextInt();

                
                //gets the emplyee id
                String name = employeeMap.get(id);

                if(name == null)
                {
                    throw new Exception();
                }

                System.out.println(name + " is the employee's name.");
            }
            catch(Exception e)
            {
                System.out.println("Please enter a valid employee id!");
            }
    }
    
}
