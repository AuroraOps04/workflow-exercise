package information_system;

import java.util.Scanner;

public class View {     //view��ͼ��
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		Service ser = new Service();
		boolean flag = false;
		int time=3;     //�����������
		System.out.println("��ӭ����ͼ�����ϵͳ��");
			while(!flag && time>0) {
				System.out.println("========ͼ����Ϣ����ϵͳ========");
				System.out.println("[Locked]���ȵ�¼��");
				System.out.println("�������˺ţ�");
				System.out.print("-->");
				String username = input.next();
				System.out.println("���������룺");
				System.out.print("-->");
				String password = input.next();
				flag = ser.login(username,password);
				if(flag==false) {
					time--;
					System.out.println("�˺Ż�������������ԣ���ʣ"+time+"��");
				}
			}
			if(time==0) {
				System.out.println("��¼�������ù⣬�˳�ϵͳ��");
				System.exit(0);
			}
			System.out.println("[Pass]��¼�ɹ���");
			while(true) {
				System.out.println("========ѧ����Ϣ����ϵͳ========");
				System.out.println("[1] ��ѯȫ��ͼ����Ϣ");
				System.out.println("[2] ���ͼ����Ϣ");
				System.out.println("[3] ɾ��ͼ����Ϣ");
				System.out.println("[4] �޸�ͼ����Ϣ");
				System.out.println("[5] ͼ���Ƽ�����");
				System.out.println("[6] �˳�ϵͳ");
				System.out.println("�����룺");
				System.out.print("-->");
				int chioce=input.nextInt();
				switch(chioce) {
					case 1:
						ser.selectall();             //�鿴ȫ��ͼ����Ϣ
						break;
					case 2:
						ser.insert();                //���ͼ����Ϣ
						break;
					case 3:
						ser.delete();                //ɾ��ͼ����Ϣ
						break;
					case 4:
						ser.update();                //����ͼ����Ϣ
						break;
					case 5:
						ser.recommend();                //ͼ���Ƽ�
						break;
					case 6:
						System.out.println("��ӭ�´ε�½��");          //�˳�
						System.exit(0);
	                    break;
	                default:
	                	System.out.println("��������ȷ������");          //���������������
				}
				System.out.println("======================================");
			}
		}
		
	}

