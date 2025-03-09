
public class Employee 
{
        private int eid;
        private String ename;
        private float salary;
        private char sex;
        public Employee()
        {
            eid=0;
            ename="NA";
            salary=0;
            sex='N';
        }
        public Employee(int id,String n,float sal,char s) 
        {
            eid=id;
            ename=n;
            salary=sal;
            sex=s;
        }
        public int getEid() 
        {
            return eid;
        }
        public String getName() 
        {
            return ename;
        }
        public float getSalary() 
        {
            return salary;
        } 
        public int getSex() 
        {
            return sex;
        } 
        public void setEid(int id) 
        {
            eid=id;
        }
        public void setName(String n) 
        {
            ename=n;
        }
        public void setSalary(float sal) 
        {
            salary=sal;
        } 
        public void setSex(char s) 
        {
            sex=s;
        }
        public String toString() 
        {
            return eid+","+ename+","+salary+","+sex;
        }        
}

        
