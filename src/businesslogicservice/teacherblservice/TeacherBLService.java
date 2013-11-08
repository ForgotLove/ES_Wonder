package businesslogicservice.teacherblservice;

import java.util.ArrayList;

public interface TeacherBLService {
	public String modifyLessonInfo();
	//老师发布完毕课程，并保存
	public String getMyLessons ();//测试时暂时使用String返回类型，正式代码使用ArrayList<lesson>返回类型
	//返回该任课老师的课程信息
	public String getStus ();//测试时暂时使用String返回类型，正式代码使用ArrayList<student>返回类型
	//返回被选课程的学生组
}
