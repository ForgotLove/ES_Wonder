package businesslogic.teacherbl;

import po.TeacherPO;
import dataservice.teacherdataservice.TeacherDataService;

public class TeacherBL_Stub implements TeacherDataService {

	public String getTeacherDatabase() {
		String lessoninfo = "发布软件工程";
		return lessoninfo;
	}

	public void insert(TeacherPO tpo) {

	}// 桩中暂时不需要使用此方法。

	public String getLessonsDatabase() {
		String mylesson = "线性代数";
		return mylesson;
	}

	public String getLessonsDatabase(String s){
		String stu="";
		switch(s){
		case "1":stu="乌鸡煲";break;
		case "2":stu="无敌";break;
		default:break;
		}
		return stu;
	}

	public String getApartDatabase() {
		return "";
	}// 桩中暂时不需要使用此方法。

}
