package information_system;

import java.util.HashMap;
import java.util.Scanner;

public class Service {       //�˵��� controller���Ʋ�
	Scanner input = new Scanner(System.in);
	DataOperate data_operate = new DataOperate();
	public Service() {          //�޲ι��췽��
    }
	public boolean login(String username,String password) //����Ա��¼����
    {
        return data_operate.login(username,password);
    }
	public void selectall() { //�������ݿ��ѯȫ��ͼ����Ϣ����
		data_operate.selectall();
	}
	public void insert() { //�������ݿ�������
		String id=null;  
		String name=null;
		 
        try{
            System.out.println("������ͼ��ID��");
            id=input.next();
            System.out.println("������ͼ�����֣�");
            name=input.next();
            Book book=new Book(id,name);
            data_operate.insert(book);
        }
        catch (Exception e)
        {
            System.out.println("��������ȷ��ʽ");
        }

	}
	public void update() { //�������ݿ��޸Ĳ���
		System.out.println("��������Ҫ�޸ĵ�ͼ��ID:");
        String id=input.next();
        System.out.println("��������Ҫ���µ����֣�");
        String name=input.next();
        data_operate.update(id,name);
	}
	public void delete() { //�������ݿ�ɾ������
		System.out.println("������ɾ����ͼ��ID��");
        String id=input.nextLine();
        data_operate.delete(id);
	}
	public void recommend() {     //�������ݿ����ѧ�Ų�ѯ��Ϣ
		System.out.println("�����Ƽ�ͼ��:");
        data_operate.recommend();
	}
	public void studentSelect(String studentnumber) {      //�������ݿ��ѯ������Ϣ
		data_operate.recommend();
	}


}