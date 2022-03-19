package maas;

public class Employee {

    public String name;
    public int salary;
    public int workHours;
    public int hireYear;
    double tax;
    double bonus;
    double raiseSalary;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.tax = 0;
        this.bonus = 0;
        this.raiseSalary = 0;

    }

    double tax() {
        if (this.salary > 1000) {
            this.tax = this.salary * 0.03;
        } else
            this.tax = 0;
        return tax;
    }

    double bonus() {
        if (this.workHours > 40) {
            bonus = (this.workHours - 40) * 30;
        } else
            bonus = 0;
        return bonus;

    }

    double raiseSalary() {
        int yil = 2021 - this.hireYear;
        if (yil < 10) {
            this.raiseSalary = 0.05 * this.salary;
        } else if (yil > 9 && yil < 20) {
            this.raiseSalary = 0.10 * this.salary;
        } else if (yil > 19)
            this.raiseSalary = 0.10 * this.salary;
        return this.raiseSalary;

    }

    void Info() {
        System.out.println("******");
        System.out.println("Çalışan adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma saati : " + this.workHours);
        System.out.println("Başlangıç yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + (this.salary - tax() + bonus()));
        System.out.println("Toplam Maaş : " + (this.salary + raiseSalary()));
    }
}

