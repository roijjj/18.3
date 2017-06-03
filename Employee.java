/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author cody
 */
public class Employee
{
    private String name;
    private int id;

    
     //Creates a new Employee
    public Employee(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

   //Returns the id of the employee.
    public int getId()
    {
        return id;
    }

    
      //Returns the name of the employee.
      
    public String getName()
    {
        return name;
    }
}