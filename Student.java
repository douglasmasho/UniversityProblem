import java.util.ArrayList;

public class Student {

	private String fullName;
	private String studentNumber;
	private int academicYear;
	private ArrayList<Module> modules;
	
	public Student(String fullName, String studentNumber, int academicYear, ArrayList<Module> newModules) {
		this.fullName = fullName;
		this.studentNumber = studentNumber;
		this.academicYear = academicYear;
		this.modules = newModules;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}
	
	public Double getAverage() {
		if(modules.size() == 0) {
			return (double) 0;
		}
		int sum = 0;
		for(int i = 0; i < modules.size(); i++) {
			sum += modules.get(i).getMark();
		}
		return (double) (sum/modules.size());
	}
	

	
	
	
	
}
