import java.util.ArrayList;

public class University {
	private ArrayList<Student> students;
	
	University(){	
		this.students = new ArrayList<Student>();
	}
	
	public void AddStudent(String newFN, String newSN, int newAcademicYear, ArrayList<Module> newModules) { 
			students.add(new FullTimeStudent(newFN,newSN, newAcademicYear, newModules));
	}
	
	public void AddStudent(String newFN, String newSN, int newAcademicYear, ArrayList<Module> newModules, String CompanyName) { 
		students.add(new PartTimeStudent(newFN,newSN, newAcademicYear, newModules, CompanyName));
    }
	
	public String getHighestAverageStudent() {
		String BestStudent = students.get(0).getFullName() + " " + students.get(0).getStudentNumber();
		double BestStudentMark = students.get(0).getAverage();		
		for(int i = 0; i < students.size(); i++) {
			if(students.get(i).getAverage() > BestStudentMark) {
				BestStudent = students.get(i).getFullName() + " " + students.get(i).getStudentNumber();
				BestStudentMark = students.get(i).getAverage();		
			}
		}
		return BestStudent;
	}
	
	
}
