package businesslogic.teacherbl;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import businesslogicservice.teacherblservice.TeacherBLService;

public class TeacherBL_Driver {
	public static void main(String[] args) {
		TeacherBLService tbs = new TeacherBL();
		TeacherBL_Driver driver = new TeacherBL_Driver();
		driver.drive(tbs);
	}

	public void drive(TeacherBLService tbs) {
		try {
			System.out.println("������Ҫ���ԵĹ��ܣ�1.�����γ� 2���鿴�Լ��Ŀγ� 3.����ѡ�пγ̵�ѧ����");
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			String s = br.readLine();
			String output="";
			switch(s){
			case "1":output=tbs.modifyLessonInfo();break;
			case "2":output=tbs.getMyLessons();break;
			case "3":output=tbs.getStus();break;
			default:break;
			}
			System.out.println(output);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
