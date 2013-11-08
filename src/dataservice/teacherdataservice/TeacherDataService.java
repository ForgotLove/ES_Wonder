package dataservice.teacherdataservice;

import po.TeacherPO;


public interface TeacherDataService {

	public String getTeacherDatabase();//得到teacher数据库的服务的引用

	public void insert(TeacherPO tpo);//插入teacherPO对象

	public String getLessonsDatabase();//得到lesson数据库的服务的引用

	public String getLessonsDatabase(String s);//得到lesson数据库下课程中学生列表的引用
	
	public String getApartDatabase();//得到apartment数据库的服务的引用
}
