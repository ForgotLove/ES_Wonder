package dataservice.teacherdataservice;

import po.TeacherPO;


public interface TeacherDataService {

	public String getTeacherDatabase();//�õ�teacher���ݿ�ķ��������

	public void insert(TeacherPO tpo);//����teacherPO����

	public String getLessonsDatabase();//�õ�lesson���ݿ�ķ��������

	public String getLessonsDatabase(String s);//�õ�lesson���ݿ��¿γ���ѧ���б������
	
	public String getApartDatabase();//�õ�apartment���ݿ�ķ��������
}
