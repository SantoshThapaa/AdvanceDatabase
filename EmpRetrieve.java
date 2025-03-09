import com.db4o.*;
import com.db4o.query.*;

public class EmpRetrieve
{
    public static void main(String[] args) 
    {      
       ObjectContainer db = Db4o.openFile("emp.odb");
       Employee e=new Employee();
       
       //Retrieves all objects from database
       Query query = db.query();
       query.constrain(Employee.class);                
       ObjectSet result = query.execute();
       while(result.hasNext())
       {
            e = (Employee)result.next();
            String d=e.toString();
            System.out.println("Data:"+d);
       }
      
         
	//Selects objects having salary>40000 
      /*
       Query query = db.query();
       query.constrain(Employee.class);
       query.descend("salary").constrain(40000).greater();        
       ObjectSet result = query.execute();
       while(result.hasNext())
       {
           e = (Employee)result.next();
           String d=e.toString();
           System.out.println("Data:"+d);
       }
    */

	//Displays data of female employees having salary<50000
     /*  
       Query query = db.query();
       query.constrain(Employee.class);      
       query.descend("salary").constrain(50000).smaller();
       query.descend("sex").constrain('F');
       ObjectSet result = query.execute();
       while(result.hasNext())
       {
           e = (Employee)result.next();
           String d=e.toString();
           System.out.println("Data:"+d);
       }
       */
     db.close();
    }   
}