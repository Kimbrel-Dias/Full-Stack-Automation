package ClassesL;

public class Employee {
	int id;
	String name;
	double basicSalary;
	double totalSalary;

	Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }
	
	void calculateSalary() {
        double hra = 0.20 * this.basicSalary;   // 20% HRA
        double bonus = 0.10 * this.basicSalary; // 10% Bonus
        this.totalSalary = this.basicSalary + hra + bonus;
    }
	
	void display() {
        System.out.println("Employee ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Basic Salary: " + this.basicSalary);
        System.out.println("Total Salary: " + this.totalSalary);
    }
	
}
