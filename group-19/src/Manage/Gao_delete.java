package Manage;

public class Gao_delete {
    //ɾ��BOOK
    public void deleteBOOK() {
        System.out.println("--->ɾ���鼮");
        System.out.print("������ɾ��ͼ������:");
        String name = input.next();
        int index = -1;
        for (BOOK d : book) {
            if (name.equals(d.getName())) {
                index = book.indexOf(d);
                if (d.getStatus().equals("�ѽ��")) {
                    System.out.println("��" + name + "��" + "Ϊ���״̬������ɾ����");
                }
            }
        }
        if (index < 0)
            System.out.println("�����ڸ�ͼ��");
        else {
            book.remove(index);
            System.out.println("ɾ����" + name + "���ɹ�!");
        }
    }
}
