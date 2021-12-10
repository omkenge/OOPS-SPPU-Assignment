import java.util.*;

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
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name Of Programmer :-");
		String s = sc.nextLine();
		System.out.print("Enter Location Of Programmer :-");
		String aa = sc.nextLine();
		System.out.print("Enter Salary Of Programmer :-");
		int a = sc.nextInt();
		Programmer p = new Programmer(s, aa, a);
		p.salary();
		System.out.println("");
		System.out.print("Enter Name Of ProjectManager :-");
		String s1 = sc.nextLine();
		System.out.print("Enter Location Of ProjectManager :-");
		String a1 = sc.nextLine();
		System.out.print("Enter Salary Of ProjectManager :-");
		int a2 = sc.nextInt();
		ProjectManager pm = new ProjectManager(s1, a1, a2);
		pm.salary();
		System.out.println("");
		System.out.print("Enter Name Of AssitantProjectManager :-");
		String s2 = sc.nextLine();
		System.out.print("Enter Location Of AssitantProjectManager :-");
		String a22 = sc.nextLine();
		System.out.print("Enter Salary Of AssitantProjectManager :-");
		int a3 = sc.nextInt();
		AssitantProjectManager apm = new AssitantProjectManager(s2, a22, a3);
		apm.salary();
		System.out.println("");
		TeamLead tl = new TeamLead("yash", "banglore", 100000);
		tl.salary();

	}
}