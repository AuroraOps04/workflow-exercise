package Manage;

import java.util.Scanner;

public class Menu {
    Shop shop = new Shop();

    public void start(Shop shop) {
        loadMenu(shop);
    }

    //�˵�
    public void showMenu(Shop shop) {
        System.out.println("��ӭ����ͼ�����");
        System.out.println("------------------------");
        System.out.println("1.�Ƽ��鼮");
        System.out.println("2.�����鼮");
        System.out.println("3.�鿴�鼮");
        System.out.println("4.ɾ���鼮");
        System.out.println("5.�޸��鼮");
        System.out.println("6.�˳�");
        System.out.println("--------------------------");
    }

    Scanner input = new Scanner(System.in);
    // ѡ��˵�
    public void loadMenu(Shop shop) {
        boolean n = true;
        while (n) {
            showMenu(shop);
            System.out.print("��ѡ��");
            int choice = input.nextInt();
            if (choice == 6) {
                System.out.println("ϵͳ���˳�");
                break;
	}
            switch (choice) {
                case 1:
                    shop.initialBOOK1();
                    shop.BOOKRank();
                    break;
                case 2:
                    shop.addBOOK();
                    break;
                case 3:
                    shop.listBOOK();
                    break;
                case 4:
                    shop.deleteBOOK();
                    break;
                case 5:
                    shop.alterBOOK();
                    break;
                default:
                    System.out.println("�������������");
                    break;
            }
            System.out.println("********************");
            System.out.print("����0���ز˵���");
            if (input.nextInt() == 0) {
                n = true;
            } else {
                n = false;
                System.out.println("���������ϵͳ���˳�");
            }
        }
    }

}