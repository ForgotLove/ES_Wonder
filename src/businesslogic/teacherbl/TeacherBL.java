package businesslogic.teacherbl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import dataservice.teacherdataservice.TeacherDataService;

import businesslogicservice.teacherblservice.TeacherBLService;

public class TeacherBL implements TeacherBLService {
	TeacherDataService tbs = new TeacherBL_Stub();

	public String modifyLessonInfo() {
		String s = tbs.getTeacherDatabase();
		return s;
	}

	public String getMyLessons() {
		String s = tbs.getLessonsDatabase();
		return s;
	}

	public String getStus() {
		String stu = "";
		try {
			System.out.println("����ѡ�еĿγ�1.������� 2.���Դ���");
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			String s = br.readLine();
			stu = tbs.getLessonsDatabase(s);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			return stu;
		}
	}
}
