/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;
import java.util.SortedMap;
import java.util.TreeMap;
/**
 *
 * @author cody
 */
public class EmployeeMap
{
  //create a tree map to store the ogjects
    private SortedMap<Integer, String> map = new TreeMap<Integer, String>();

    // Adds an employee to the map.
     
    public void add(Employee employee)
    {
        map.put(employee.getId(), employee.getName());
    }

   // Look up an employee in the map.
   
    public String lookUp(int id)
    {
        return map.get(id);
    }
}
