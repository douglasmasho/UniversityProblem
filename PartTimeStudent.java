import java.util.ArrayList;

public class PartTimeStudent extends Student {
	private String CompanyName;
	PartTimeStudent(String newFN, String newSN, int newAcademicYear, ArrayList<Module> newModules, String newCompanyName){
		super(newFN, newSN, newAcademicYear, newModules);
		this.CompanyName = newCompanyName;
	}
	
}
