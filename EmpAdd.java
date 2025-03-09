import com.db4o.*;
import com.db4o.query.*;

public class EmpAdd
{
    public static void main(String[] args) 
    {      
       ObjectContainer db = Db4o.openFile("emp.odb");
       Employee e1=new Employee(101,"Ram",45000,'M');
       db.set(e1);
       Employee e2=new Employee(102,"Hari",55000,'M');
       db.set(e2);
       Employee e3=new Employee(103,"Rita",35000,'F');
       db.set(e3);
       db.commit();
       db.close();
    }   
}