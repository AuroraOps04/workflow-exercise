package Manage;
//�鿴�鼮
public class Xie_list {
    public void listBOOK() {
        System.out.println("--->�鿴�鼮");
        System.out.println("���\t״̬\t����\t�������");
        for (BOOK d : book) {
            System.out.println(d.getId() +"\t" + d.getStatus() +"\t��" + d.getName() + "��\t" + d.getBorrowTime());
        }
    }
}
