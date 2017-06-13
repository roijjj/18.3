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
public class employeemap {
    
  //create a hashmap to store the employees
    private Map<Integer, String> emp = new HashMap<Integer, String>();

    // Adds an employee to the map.
  void add(employee employee) {
        emp.put(employee.getid(), employee.getname());//puts employee in the map    }
    }
   // gets the eployee in the map
     String get(int id)
    {
        return emp.get(id);
    }  

    
}
