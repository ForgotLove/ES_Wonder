package businesslogic.teacherbl;

import po.TeacherPO;
import dataservice.teacherdataservice.TeacherDataService;

public class TeacherBL_Stub implements TeacherDataService {

	public String getTeacherDatabase() {
		String lessoninfo = "�����������";
		return lessoninfo;
	}

	public void insert(TeacherPO tpo) {

	}// ׮����ʱ����Ҫʹ�ô˷�����

	public String getLessonsDatabase() {
		String mylesson = "���Դ���";
		return mylesson;
	}

	public String getLessonsDatabase(String s){
		String stu="";
		switch(s){
		case "1":stu="�ڼ���";break;
		case "2":stu="�޵�";break;
		default:break;
		}
		return stu;
	}

	public String getApartDatabase() {
		return "";
	}// ׮����ʱ����Ҫʹ�ô˷�����

}
