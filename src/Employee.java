import java.util.Objects;

public class Employee {
    private  int id;
    private int departments;
    private String fullName;
    private double salary;
    private static int counter =0;
    public Employee(String fullName,int departments, double salary){
        this.departments = departments;
        this.salary = salary;
        this.fullName = fullName;
        id= ++ counter;
    }
    public int getDepartments(){ return departments;}

    public int getId() {
        return id;
    }
    public String getFullName (){
        return fullName;
    }
    public double getSalary() {return salary;}

    public void setSalary(double salary) {
        salary = salary;
    }
    public void setDepartments(int departments){
        departments = departments;
    }

    @Override
    public String toString() {return String.format("%d.%s; номер отдела : %d;зарплата :%2f",id,fullName,departments,salary);

    }
    @Override
    public int hashCode(){return Objects.hash(fullName,id,salary,departments);
    }
    @Override
    public boolean equals(Object o){
        if (this == o)return true;
        if (o == null || getClass()!=o.getClass()) return false;
        Employee employee =(Employee) o;
        return id == employee.id && Double.compare(employee.salary, salary)==0 &&
                Objects.equals(fullName,employee.fullName) && Objects.equals(departments, employee.departments);
    }
}
