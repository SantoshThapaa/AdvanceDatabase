import com.db4o.*;
import com.db4o.query.*;

public class EmpDelete
{
    public static void main(String[] args) 
    {      
       ObjectContainer db = Db4o.openFile("emp.odb");      
       Employee e=new Employee();
       
     // Delete record of employee having id 101    
       Query query = db.query();
       query.constrain(Employee.class);      
       query.descend("eid").constrain(101);       
       ObjectSet result = query.execute();
       Employee found = (Employee) result.next();
       db.delete(found);
       db.commit();
       
       Query q = db.query();       
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