/**
 * @author mvven
 *
 */
class Main {

	public static void compare(Employee employee1, Employee employee2) {
		if (employee1.getEmpSalary() > employee2.getEmpSalary()) {
			System.out.println(employee1.getEmpName() + " has bigger salary");
		} else {
			System.out.println(employee2.getEmpName() + " has bigger salary");
		}
	}

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setEmpNumber(1);
		employee1.setEmpName("Monesh");
		employee1.setEmpSalary(5000);
		employee1.display();
		Employee employee2 = new Employee();
		employee2.setEmpNumber(2);
		employee2.setEmpName("Tony");
		employee2.setEmpSalary(10000);
		employee2.display();

		compare(employee1, employee2);
		employee1.update("venkul");

	}

}