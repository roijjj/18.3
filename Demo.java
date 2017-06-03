/*
Create an Employee class that stores an employee’s ID number and name. 
Then create an EmployeeMap class that allows you to add Employee objects and 
look them up by their ID numbers. The EmployeeMap class should use a Map object 
to map ID numbers to Employee objects. Create an application to demonstrate the classes. 
 */
package demo;
import java.util.Scanner;

/**
 *
 * @author cody
 */
public class Demo {

 
  public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //String name;
        //create some  objects
        EmployeeMap employeeMap = new EmployeeMap();

        employeeMap.add(new Employee("Bill", 1));
        employeeMap.add(new Employee("Lucy", 3));
        employeeMap.add(new Employee("CEO", 0));
        employeeMap.add(new Employee("George", 432));

        
        System.out.print("add an employee: ");
                String na = scanner.nextLine();
                
                 System.out.print("add the id number of the emplyee: ");
                int id1 = scanner.nextInt();
                
         employeeMap.add(new Employee(na, id1));

        while(true)
        {
            try
            {
                                    /*System.out.print("add an employee: ");
                    System.out.print("add an employee: ");
                int d = scanner.nextInt();

                if(d == 1){
                    System.out.println("add an employee: ");
                String na = scanner.nextLine();
                
                 System.out.println("add the id number of the emplyee: ");
                int id1 = scanner.nextInt();
                
                         employeeMap.add(new Employee(na, id1));

                }
                else if(d == 2){*/
                System.out.print("Enter the id number you want to search for: ");
                int id = scanner.nextInt();

                
                //lookup the emplyee id
                String name = employeeMap.lookUp(id);

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
}
    

