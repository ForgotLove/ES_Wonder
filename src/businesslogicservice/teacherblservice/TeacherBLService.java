package businesslogicservice.teacherblservice;

import java.util.ArrayList;

public interface TeacherBLService {
	public String modifyLessonInfo();
	//��ʦ������Ͽγ̣�������
	public String getMyLessons ();//����ʱ��ʱʹ��String�������ͣ���ʽ����ʹ��ArrayList<lesson>��������
	//���ظ��ο���ʦ�Ŀγ���Ϣ
	public String getStus ();//����ʱ��ʱʹ��String�������ͣ���ʽ����ʹ��ArrayList<student>��������
	//���ر�ѡ�γ̵�ѧ����
}
