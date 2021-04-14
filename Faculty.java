/* Assignment #: 4
 Name: Joseph Kharzo
 StudentID: 1218555299
 Lecture: TTH 1:30-2:45
 Time spent: 15 minutes
Description: This class creates a faculty member, giving them a first name, last name, and an academic level.
 */

public class Faculty{
	
	// Instance variables
	private String firstName;
	private String lastName;
	private String academicLevel;
	
	// Default constructor initializes the instance variables
	public Faculty(){
		firstName = "?";
		lastName = "?";
		academicLevel = "?";
	}
	
	// Getters
	/**
 	* returns the first name of the faculty member
 	*
 	* @param
 	* @return firstName	 	
 	*/
	public String getFirstName(){
		return firstName;
	}
	
	/**
 	* returns the last name of the faculty member
 	*
 	* @param
 	* @return lastName 
 	*/ 
	public String getLastName(){
		return lastName;
	}
	
	/**
 	* returns the academic level of the faculty member
 	*
 	* @param
 	* @return academicLevel
	*/
	public String getAcademicLevel(){
		return academicLevel;
	}

	// Mutators
	/**
 	* changes the first name of the faculty member
 	*
 	* @param firstName
 	* @return
	*/
	public void setFirstName(String firstName){
		this.firstName = firstName;	
	}
	
	/**
 	* changes the last name of the faculty member
 	*
 	* @param lastName
 	* @return 
	*/
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	/**
 	* changes the academic level of the faculty member
 	*
 	* @param academicLevel
 	* @return 
	*/
	public void setAcademicLevel(String academicLevel){
		this.academicLevel = academicLevel;
	}
	
	/**
 	* Overriding the toString() method to provide information pertaining to the Faculty class
 	*
 	* @param
 	* @return facultyMember
	*/
	public String toString(){
		String facultyMember = lastName + "," + firstName + "(" + academicLevel + ")";
		return facultyMember;
	}
}
