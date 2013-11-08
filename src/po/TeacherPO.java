package po;

import java.io.Serializable;

public class TeacherPO implements Serializable {
	String id = "";
	String password = "";
	String mylesson="";

	public TeacherPO(String i, String p) {
		id = i;
		password = p;
		

	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}
	
	public String getMylesson(){
		return mylesson;
	}


}