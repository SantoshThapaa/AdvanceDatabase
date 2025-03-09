import com.db4o.*;
import com.db4o.query.*;
public class EmpUpdate
{
    public static void main(String[] args) 
    {      
       ObjectContainer db = Db4o.openFile("emp.odb");      
       Employee e=new Employee();
       
       System.out.println("******Before Update******");
       Query q = db.query();       
       q.constrain(Employee.class);                
       ObjectSet result = q.execute();
       while(result.hasNext())
       {
            e = (Employee)result.next();
            String d=e.toString();
            System.out.println("Data:"+d);
       }
       
     // update Salary of employee 103 by 20%    
       q = db.query();
       q.constrain(Employee.class);      
       q.descend("eid").constrain(103);       
       result = q.execute();
       Employee found = (Employee) result.next();
       found.setSalary(found.getSalary()*1.2f);
       db.set(found);
       db.commit();
       
       System.out.println("******After Update******");
       q = db.query();       
       q.constrain(Employee.class);                
       result = q.execute();
       while(result.hasNext())
       {
            e = (Employee)result.next();
            String d=e.toString();
            System.out.println("Data:"+d);
       }
       db.close();
    }   
}