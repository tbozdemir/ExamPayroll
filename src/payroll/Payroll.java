/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/** This code calculates the salary including bonus.
 * bonus is 10% of salary and applied to the employees whose salary is <=3000
 * @author srinivsi
 */
public class Payroll 
{

   private double _Salary;
   private double _bonus;
   private String _emp;
 
     /**constructor that takes the salary and employee name
      * 
      */
   public Payroll(double Sal,String givenUser)
        {
       setSalary(Sal);
       setEmp(givenUser);
                 
        }
         /**The method for calculating salary including bonus.Bonus is 10% of salary 
      */ 
        
        
     /**The getter for the Salary
     * @return the Salary
     */
   public void setSalary(double Sal){
       _Salary=Sal;
   }
   public void setEmp(String givenUser){
       _emp=givenUser;
   }
        public double getSalary() 
        {
            if(_Salary<=3000){
              
                _Salary=_Salary+getBonus();
                return _Salary;
            }
        return _Salary;
        }

    /*The getter for bonus
     * @return the bonus*/
        
        public double getBonus()        
        {
      
            _bonus=(_Salary*10/100);
            return _bonus;
        }

    /**user is the read only field
     * @return the user
     */
    public String getEmp() {
        return _emp;
    }
    
    
}
