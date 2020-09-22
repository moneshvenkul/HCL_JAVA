class Employee {
	private int empNumber;
	private String empName;
	private int empSalary;

	public void display() {
		System.out.println("Employee Number : " + getEmpNumber());
		System.out.println("Employee Name : " + getEmpName());
		System.out.println("Employee Salary : " + getEmpSalary());
	}

	public void update(String name) {
		setEmpName(name);
		System.out.println("Employee Number : " + getEmpNumber());
		System.out.println("Employee Name : " + getEmpName());
		System.out.println("Employee Salary : " + getEmpSalary());

	}

	/**
	 * @return the empSalary
	 */
	public int getEmpSalary() {
		return empSalary;
	}

	/**
	 * @param empSalary the empSalary to set
	 */
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the empNumber
	 */
	public int getEmpNumber() {
		return empNumber;
	}

	/**
	 * @param empNumber the empNumber to set
	 */
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}

}