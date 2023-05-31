package Employee;

public class Employee {
    private String name, category;
    private int age, emp_id;
    private double basic_pay, HRA, DA, net_pay, provident_fund, gross_pay, income_tax, allowance;

    public Employee(String name, int age, int eid, String cat, int bp) {
        this.name = name;
        this.age = age;
        this.basic_pay = bp;
        this.category = cat;
        this.emp_id = eid;
    }

    public double calHRA() {
        HRA = 0.5 * basic_pay;
        return HRA;
    }

    public double calDA() {
        DA = 0.4 * basic_pay;
        return DA;
    }

    public double calNetPay() {
        net_pay = basic_pay + HRA + DA + allowance;
        return net_pay;
    }

    public double calPF() {
        provident_fund = 0.12 * basic_pay;
        return provident_fund;
    }

    public double calGP() {
        gross_pay = calNetPay() - calPF();
        return gross_pay;
    }

    public double calIT() {
        if (gross_pay >= 5000) {
            income_tax = 0.3 * gross_pay;
            return income_tax;
        } else if (gross_pay >= 3000) {
            income_tax = 0.2 * gross_pay;
            return income_tax;
        } else if (gross_pay >= 1000) {
            income_tax = 0.1 * gross_pay;
            return income_tax;
        } else {
            return income_tax = 0;
        }
    }

    public void Calculate() {
        System.out.println(
                "\n-------------------------------------------------------------------------------------------------");
        System.out.println("\n Name = " + name + "\n Age = " + age + "\n Employee ID = " + emp_id
                + "\n Category = " + category + "\n DA = " + calDA() + "\n HRA = " + calHRA() + "\n Gross Pay = "
                + calGP() + "\n Provident Fund = " + calPF() + "\n Income Tax = " + calIT() + "\n Net Pay = "
                + calNetPay());
    }
}
