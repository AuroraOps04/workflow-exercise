package Manage;
//查看书籍
public class Xie_list {
    public void listBOOK() {
        System.out.println("--->查看书籍");
        System.out.println("序号\t状态\t名称\t借出日期");
        for (BOOK d : book) {
            System.out.println(d.getId() +"\t" + d.getStatus() +"\t《" + d.getName() + "》\t" + d.getBorrowTime());
        }
    }
}
