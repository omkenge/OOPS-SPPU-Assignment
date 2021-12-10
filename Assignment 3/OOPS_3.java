
class Employee {
	String name, add, mail;
	float id, mobile, basic;

	void salary() {
		float da, hrcf, hra, cf, pf, gross;
		da = basic * 97 / 100;
		hra = basic * 10 / 100;
		pf = basic * 12 / 100;
		cf = basic * 0.1f / 100;
		gross = basic + da + hra - pf - cf;
		System.out.println("Name : " + name);
		System.out.println("Basic Salary:  " + basic);
		System.out.println("Gross Salary : " + gross);
	}
}

class Programmer extends Employee {
	Programmer(String name, String Add, int sal) {
		this.name = name;
		add = Add;
		basic = sal;
	}

}

class TeamLead extends Employee {
	TeamLead(String name, String Add, int sal) {
		basic = sal;
		add = Add;
		this.name = name;

	}
}

class AssitantProjectManager extends Employee {
	AssitantProjectManager(String name, String Add, int sal) {
		basic = sal;
		add = Add;
		this.name = name;
	}
}

class ProjectManager extends Employee {
	ProjectManager(String name, String Add, int sal) {
		basic = sal;
		add = Add;
		this.name = name;
	}
}

public class OOPS_3 {
	public static void main(String[] args) {
		Programmer p = new Programmer("Ketan", "pune", 40000);
		p.salary();
		System.out.println("");
		ProjectManager pm = new ProjectManager("OM", "kolkata", 60000);
		pm.salary();
		System.out.println("");
		AssitantProjectManager apm = new AssitantProjectManager("piyush", "nanded", 80000);
		apm.salary();
		System.out.println("");
		TeamLead tl = new TeamLead("yash", "banglore", 100000);
		tl.salary();

	}
}