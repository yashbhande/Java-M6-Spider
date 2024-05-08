class Employee
{
	String fullName;
	String gender;

	Employee(String fullName, String gender)
	{
		super();
		this.fullName = fullName;
		this.gender = gender;
	}

	void work(){System.out.println("Working");}
	void attendMeeting(){System.out.println("Attending Meeting");}
	void solveProblems(){System.out.println("Solving Problems");}
	void communicate(){System.out.println("Communicating");}

	void displayEmployee()
	{
		System.out.println("Full Name: " + this.fullName);
		System.out.println("Gender: " + this.gender);
	}
}

class EntryLevel extends Employee
{
	String department;
	int yearsOfExperience;
	String position;
	String company;
	String hireYear;

	EntryLevel(String department, int yearsOfExperience, String position, String company, String hireYear, String fullName, String gender)
	{
		super(fullName, gender);
		this.department = department;
		this.yearsOfExperience = yearsOfExperience;
		this.position = position;
		this.company = company;
		this.hireYear = hireYear;
	}

	void displayEntryLevel()
	{
		System.out.println("Department: " + this.department);
		System.out.println("Years of Experience: " + this.yearsOfExperience);
		System.out.println("Position: " + this.position);
		System.out.println("Company: " + this.company);
		System.out.println("Hire Year: " + this.hireYear);
	}
}

class MidLevel extends EntryLevel
{
	String specialization;
	int yearsInPosition;
	String companyAchievements;

	MidLevel(String specialization, int yearsInPosition, String companyAchievements, String department, int yearsOfExperience, String position, String company, String hireYear, String fullName, String gender)
	{
		super(department, yearsOfExperience, position, company, hireYear, fullName, gender);
		this.specialization = specialization;
		this.yearsInPosition = yearsInPosition;
		this.companyAchievements = companyAchievements;
	}

	void displayMidLevel()
	{
		System.out.println("Specialization: " + this.specialization);
		System.out.println("Years in Position: " + this.yearsInPosition);
		System.out.println("Company Achievements: " + this.companyAchievements);
	}
}

class SeniorLevel extends MidLevel
{
	String managementRole;
	int teamSize;
	int salary;

	SeniorLevel(String managementRole, int teamSize, int salary, String specialization, int yearsInPosition, String companyAchievements, String department, int yearsOfExperience, String position, String company, String hireYear, String fullName, String gender)
	{
		super(specialization, yearsInPosition, companyAchievements, department, yearsOfExperience, position, company, hireYear, fullName, gender);
		this.managementRole = managementRole;
		this.teamSize = teamSize;
		this.salary = salary;
	}

	void displaySeniorLevel()
	{
		System.out.println("Management Role: " + this.managementRole);
		System.out.println("Team Size: " + this.teamSize);
		System.out.println("Salary: $" + this.salary);
	}
}

class CareerProgression
{
	public static void main(String[] args) {
		// String managementRole, int teamSize, int salary, String specialization, int yearsInPosition, String companyAchievements, String department, int yearsOfExperience, String position, String company, String hireYear, String fullName, String gender
		SeniorLevel employeeProgress = new SeniorLevel("Project Manager", 10, 90000, "Software Engineering", 5, "Increased project efficiency by 20%", "IT", 12, "Senior Developer", "Tech Solutions", "2012", "Yash", "Male");
		employeeProgress.displayEmployee();
		employeeProgress.displaySeniorLevel();
	}
}
