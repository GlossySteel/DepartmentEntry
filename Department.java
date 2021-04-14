/* Assignment #: 4
 Name: Joseph Kharzo
 Lecture: TTH 1:30-2:45
 Time spent: 25 minutes
Description: This class creates a department. This is accomplished by assigning the department a name, a certain amount of faculty members, a university name, and a specific faculty member. The Faculty class has an aggregated relationship with this class.
 */

public class Department{
	// Instance variables
	private String departName;
	private int numberOfMembers;
	private String university;
	private Faculty currentFaculty;
	
	// Default constructor
	Department(){
		departName = "?";
		numberOfMembers = 0;
		university = "?";
		currentFaculty = new Faculty();
	}
	
	// Getters
	/**
 	* returns the department name
 	*
 	* @param
 	* @return departName 
	*/
	public String getDeptName(){
		return departName;
	}
	
	/**
 	* returns the number of members in the department
 	*
 	* @param
 	* @return numberOfMembers 
	*/
	public int getNumberOfMembers(){
		return numberOfMembers;
	}
	
	/**
 	* returns the university name
 	*
 	* @param
 	* @return university 	
	*/
	public String getUniversity(){
		return university;
	}
	
	// Mutators
	/**
 	* changes the number of members in a department
 	*
 	* @param numberOfMembers
 	* @return
	*/
	public void setNumberOfMembers(int numberOfMembers){
		this.numberOfMembers = numberOfMembers;
	}
	
	/**
 	* changes the university name
 	*
 	* @param university
 	* @return
	*/
	public void setUniversity(String university){
		this.university = university;
	}
	
	/**
 	* gives a faculty member a first name, last name, and academic level
 	*
 	* @param firstName
 	* @param lastName
 	* @param academicLevel
 	* @return
	*/
	public void setCurrentFaculty(String firstName, String lastName, String academicLevel){
		currentFaculty.setFirstName(firstName);
		currentFaculty.setLastName(lastName);
		currentFaculty.setAcademicLevel(academicLevel);
	}
	
	/**
 	* changes the department name
 	*
 	* @param departName
 	* @return
	*/
	public void setDeptName(String departName){
		this.departName = departName;
	}
	
	/**
 	* overrides the toString() method and displays information that is relavent to the Department class
 	*
 	* @param
 	* @return departmentInformation
	*/
	public String toString(){
		String departmentInformation = "\nDepartment Name:\t\t" + departName + "\nNumber Of Members:\t"+ numberOfMembers + "\nUniversity:\t\t" + university + "\nFaculty:\t\t" + currentFaculty.toString() + "\n\n";

		return departmentInformation; 	
	}
}
