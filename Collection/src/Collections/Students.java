package Collections;

public class Students implements Comparable<Students>{
	
	private int RolNo;
	private String Name;
	private String Place;
	
	public Students (int RolNo, String Name, String Place) {
		this.RolNo=	RolNo;
		this.Name=Name;
		this.Place=Place;
	}
	
	public int getRolNo() {
		return RolNo;
	}
	public void setRolNo(int rolNo) {
		RolNo = rolNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPlace() {
		return Place;
	}
	public void setPlace(String place) {
		Place = place;
	}
	@Override
	public String toString() {
		return "Students [RolNo=" + RolNo + ", Name=" + Name + ", Place=" + Place + "]";
	}

	@Override
	public int compareTo(Students Std2) {
		
		if(this.getRolNo() > Std2.getRolNo()) 
			return 1;
		else
 		return -1;
	}
	

}
