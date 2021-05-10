package book;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class shop {
	Scanner scanner = new Scanner(System.in);
    List<book> list = new ArrayList<book>();

    public shop(){
    	
    }                                 

    public void addBook() {                  
        System.out.println("---> ����ͼ��");
        System.out.print("������ͼ�����ƣ�");
        String Name = scanner.next();
        int addid = list.size()+1;
        book b = new book(addid,Name);           
        list.add(b);
        System.out.println("������"+Name+"���ɹ���");
    }
    public void selectBook(){                       
        System.out.println("---> ����ͼ��");
        System.out.println("���\t����\t״̬\t\t�������");
        for (book b : list) {
            b.print();
        }
    }
    public void deleteBook(){                        
        System.out.println("---> ɾ��ͼ��");
        System.out.print("������ͼ������:");
        String name = scanner.next();
        for(book b : list) {
            if (b.getname().equals(name)) {
                if (b.getwork().equals("�ѽ��")) {
                    System.out.println("��"+name+"��Ϊ���״̬�����ܽ����");
                    break;
                }else {
                    int index = list.indexOf(b);
                    list.remove(index);
                    System.out.println("ɾ����"+name+"���ɹ�");
                    break;
                }
            }
        }
    }
    public void lendBook(){                          
        System.out.println("---> ���ͼ��");
        String goon;
        do{
            System.out.print("����:1Ԫ/��,�Ƿ������(Y/N):");
             goon = scanner.next();
        }while (goon=="Y");

        System.out.print("������ͼ������:");
        String dvdname = scanner.next();
        for(book b : list) {
            if (b.getwork().equals("�ѽ�")) {
                System.out.println("��"+dvdname+"��Ϊ���״̬�����ܽ����");
                break;
            }else {
                SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");  
                String lenddate = df.format(new Date());
                b.lend(lenddate);
                System.out.println("�����"+dvdname+"���ɹ���");
                break;
            }
        }
    }
    public void returnBook(){                        
        System.out.println("---> �黹ͼ��");
        System.out.print("������ͼ������:");
        String name = scanner.next();
        for(book b : list) {
            if (b.getname().equals(name)) {
                SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");  
                String returndate = df.format(new Date());
                b.returnBack(returndate);
                System.out.println("�黹��"+name+"���ɹ���");
                System.out.println("�������Ϊ��"+b.getouttime());
                System.out.println("�黹����Ϊ��"+b.getretime());
                try {
                    Date parse1 = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").parse(b.getouttime());
                    Date parse2 = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").parse(b.getretime());
//                    Long Lenddatetimestamp = parse1.getTime();
//                    Long Returndatetimestamp = parse2.getTime();
//                    Long timeprice = Returndatetimestamp - Lenddatetimestamp;
//                    System.out.println(Returndatetimestamp);
//                    System.out.println(Lenddatetimestamp);
//                    System.out.println("Ӧ�����"+timeprice+"Ԫ");
                    }
                     catch (ParseException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }
    public void borrowinglist(){
        list.sort(new Comparator<book>() {
            public int compare(book b1, book b2) {		            
                return b2.getouttimes() - b1.getouttimes();
            }
        });
        System.out.println("---> ���а�");
        System.out.println("����\t����");
        for(book b : list) {
            System.out.println(b.getouttimes() + "\t\t��" + b.getname()+"��");
        }
    }
    public void saveBook() {
        File file =new File("book.txt");
        Writer out;
        try {
            out = new FileWriter(file);
            out.write("���\t����\t״̬\t\t�������");
            for(book b : list) {
                out.write("\r\n");
                out.write(b.getid()+"\t\t" + b.getname()+"\t\t" + b.getwork() + "\t"+ b.getouttimes());
            }
            out.flush();
            out.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("����ɹ���");
    }
}
