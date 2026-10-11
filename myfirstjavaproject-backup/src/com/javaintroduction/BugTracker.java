package com.javaintroduction;

public class BugTracker {
	int bugId;
	String applicationName;
	String bugTitle;
	String severity;
	String priority;
	String status;
	String assignedDeveloper;

	public static void main(String[] args) {
		BugTracker b = new BugTracker();
		b.bugId = 101;
		b.applicationName = "studenttracker";
		b.bugTitle = "student marks not upadting";
		b.severity = "high";
		b.priority = "high";
		b.status = "in process";
		b.assignedDeveloper = "divya";
		b.getBugId();
		b.getapplicationName();
		b.getbugTitle();
		b.getseverity();
		b.getpriority();
		b.getstatus();
		b.getassignedDeveloper();
		b.getupdatedassignedDeveloper(101, "nashitha");
		b.getassignedDeveloper();
		b.updatedStatus(101, "updated");
		b.getstatus();



	}

	void getBugId() {
		System.out.println("bugid is:" + bugId);
	}

	void getapplicationName() {
		System.out.println("applicationName is:" + applicationName);
	}

	void getbugTitle() {
		System.out.println("bugTitle is:" + bugTitle);
	}

	void getseverity() {
		System.out.println("severity is:" + severity);
	}

	void getpriority() {
		System.out.println("priority is:" + priority);
	}

	void getstatus() {
		System.out.println("status is:" + status);
	}

	void getassignedDeveloper() {
		System.out.println("assignedDeveloper is:" + assignedDeveloper);
	}
	void getupdatedassignedDeveloper(int bugid,String assigneddeveloper) {
		bugId=bugid;
		assignedDeveloper=assigneddeveloper;
		
	}
	void updatedStatus(int bugid,String statuss) {
		bugId=bugid;
		status=statuss;
		
	}
	
	
}
