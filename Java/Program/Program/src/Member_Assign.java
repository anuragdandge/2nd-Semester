
class Member {
    private String Name, Address, Phone_number;
    private int Age, Salary;

    protected int Age(int age) {
        this.Age = age;
        return this.Age;
    }

    protected int Salary(int sal) {
        this.Salary = sal;
        return this.Salary;
    }

    protected String Name(String name) {
        this.Name = name;
        return this.Name;
    }

    protected String Phone_Number(String phn) {
        this.Phone_number = phn;
        return this.Phone_number;
    }

    protected String Address(String addr) {
        this.Address = addr;
        return this.Address;
    }

    public void printSalary() {
        System.out.println("\n Name = " + this.Name + "\n Age = " + this.Age + "\n Phone Number = " + this.Phone_number
                + "\n Address = " + this.Address
                + "\n Salary = " + this.Salary);
    }
}

class Employee extends Member {

    private String Specialization, Department;

    Employee(int age, int sal, String dept, String name, String spec, String addr, String phn) {
        this.Age(age);
        this.Salary(sal);
        this.Department = dept;
        this.Specialization = spec;
        this.Name(name);
        this.Address(addr);
        this.Phone_Number(phn);
    }

    public void printEmp() {
        printSalary();
        System.out.println(" Department = " + this.Department + "\n Specialization = " + this.Specialization);
    }
}

class Manager extends Member {

    private String Specialization, Department;

    Manager(int age, int sal, String dept, String name, String spec, String addr, String phn) {
        this.Age(age);
        this.Salary(sal);
        this.Department = dept;
        this.Specialization = spec;
        this.Name(name);
        this.Address(addr);
        this.Phone_Number(phn);
    }

    public void printMan() {
        printSalary();
        System.out.println(" Department = " + this.Department + "\n Specialization = " + this.Specialization);
    }

}

public class Member_Assign {

    public static void main(String[] args) {
        Employee e1 = new Employee(21, 12000, "IT", "Anurag", "Android", "Kothrud", "9145369970");
        e1.printEmp();
        Manager m1 = new Manager(22, 13000, "ECOM", "Naresh", "Trading", "Beed", "9145369972");
        m1.printMan();

    }
}
