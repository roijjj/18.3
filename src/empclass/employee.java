/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empclass;

/**
 *
 * @author cody
 */
public class employee {
    private String n;//the name
    private int id;//the eployee id number

    
     //Creates a new Employee
     employee(String n, int id)
    {
        this.n = n;
        this.id = id;
    }

      //Returns the name of the employee.
    String getname()
    {
        return n;
    }
    
//Returns the id of the employee.
    int getid()
    {
        return id;
    }

}
