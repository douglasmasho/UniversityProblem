import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		University Sigma_Academy = new University();
		
		Sigma_Academy.AddStudent("Kenan Thompson", "219015686", 2022, new ArrayList<Module>(List.of(new Module("Object Oriented Programming 2", 75.0), new Module("Computer Networks 2", 60.0), new Module("Advanced Databases", 80.0))));
		Sigma_Academy.AddStudent("Kel Mitchell", "219025930", 2022, new ArrayList<Module>(List.of(new Module("Object Oriented Programming 2", 90.0), new Module("Computer Networks 2", 87.0), new Module("Advanced Databases", 70.0))));
		Sigma_Academy.AddStudent("Drake Bell", "219015032", 2022, new ArrayList<Module>(List.of(new Module("Object Oriented Programming 2", 85.0),new Module("Advanced Databases", 90.0))), "Obsidian Technologies");
		Sigma_Academy.AddStudent("Josh Peck", "219029021", 2022, new ArrayList<Module>(List.of(new Module("Object Oriented Programming 2", 72.0), new Module("Advanced Databases", 85.0))), "Aperture Industries");
		
		System.out.println(Sigma_Academy.getHighestAverage());
	}
}
