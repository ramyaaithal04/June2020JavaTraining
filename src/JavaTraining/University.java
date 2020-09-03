package JavaTraining;

import java.util.ArrayList;

public class University {

	public String name;
	public String country;
	public String establishedDate;
	public ArrayList<String> coursesOffered;
	
	public University(String name, String country, String establishedDate, ArrayList<String> coursesOffered) {
		
		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;
		this.coursesOffered = coursesOffered;
	}

	public University(String name, String country) {

		this.name = name;
		this.country = country;
	}

	public University(String establishedDate, ArrayList<String> coursesOffered) {

		this.establishedDate = establishedDate;
		this.coursesOffered = coursesOffered;
	}

	public String getName()
	{
		return name;
	}
	
	public String getCountry()
	{
		return country;
	}
	
	public String getEstablishedDate()
	{
		return establishedDate;
	}
	
	public ArrayList<String> getCoursesOffered()
	{
		return coursesOffered;
	}
	}
