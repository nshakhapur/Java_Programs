import java.util.*;
import java.io.*;
public class Employee_write {

    public static void main(String[] args) throws Exception
    {

    
    Scanner sc=new Scanner(System.in);
    try{

    Employee emp1=new Employee(10,"ABC","ML",20000);
    Employee emp2=new Employee(20,"CDE","AI",30000);
    Employee emp3=new Employee(30,"FGH","BIOINFORMATICS",25000);

            String info1=Integer.toString(emp1.EmpId)+"-"+emp1.name+"-"+emp1.dept+"-"+Double.toString(emp1.salary);
            String info2=Integer.toString(emp2.EmpId)+"-"+emp2.name+"-"+emp2.dept+"-"+Double.toString(emp2.salary);
            String info3=Integer.toString(emp3.EmpId)+"-"+emp3.name+"-"+emp3.dept+"-"+Double.toString(emp3.salary);
            

    FileOutputStream out=new FileOutputStream("Employee.dat");
    byte[] arr1=info1.getBytes();
    byte[] arr2=info2.getBytes();
    byte[] arr3=info3.getBytes();

    out.write(arr1);
    out.write(arr2);
    out.write(arr3);

    out.flush();
    out.close();
}
catch(Exception e)
{
    e.getMessage();
}
}
}

