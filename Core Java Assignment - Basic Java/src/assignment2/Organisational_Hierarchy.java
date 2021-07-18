package assignment2;


	class Employee{
		private double salary;
		public Employee(double salary) {
			this.salary=salary;
		}
		public double getSalary() {
			return salary;
		}
	}
	class Manager extends Employee{
		public double incentive;
		public Manager(double salary,double incentive) {
			super(salary);
			this.incentive=incentive;
		}
		@Override
		public double getSalary() {
			return super.getSalary()+incentive;
		}
	}
	class Labour extends Employee{
		private double overtime;
		public Labour(double salary,double overtime) {
			super(salary);
			this.overtime=overtime;
		}
		@Override
		public double getSalary() {
			return super.getSalary()+overtime;
		}
	}

	public class Organisational_Hierarchy {

		public Organisational_Hierarchy() {
			
		}
		public static void main(String args[]) {
			Manager m=new Manager(30000,5000);
			Labour l=new Labour(15000,3000);
			System.out.println("Manager Salary : "+m.getSalary());
			System.out.println("Labour Salary : "+l.getSalary());
		}

}
