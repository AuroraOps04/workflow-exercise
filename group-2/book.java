package book;
import java.util.Random;
public class book {
	private int id;              //ͼ����
    private String name;         //����
    private String work;       //ͼ��״̬
    private int outtimes;           //�������
    private String outtime;        //���ʱ��
    private String retime;      //�黹ʱ��

    public int getid() {
        return id;
    }
    public void setid(int id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }

    public String getwork() {
        return work;
    }
    public void setwork(String work) {
        this.work = work;
    }

    public int getouttimes() {
        return outtimes;
    }
    public void setouttimes(int outtimes) {
        this.outtimes = outtimes;
    }

    public String getouttime() {
        return outtime;
    }
    public void setouttime(String outtime) {
        this.outtime = outtime;
    }

    public String getretime() {
        return retime;
    }
    public void setretime(String retime) {
        this.retime = retime;
    }

    public book(){
    	
    }                                  

    public book(int id, String name) {         
        this.id = id;
        this.name = name;
        setwork("�ɽ�");
    }
    public void print(){                             
        if (this.getwork().equals("�ѽ��"))
            System.out.println(id + "\t\t" + name + "\t\t" + work+ "\t\t"  + outtime+ "\t\t");
        else
            System.out.println(id + "\t\t" + name + "\t\t" + work);
    }
    public void lend(String outtime) {             
        setwork("�ѽ��");
        setouttime(outtime);
        this.outtimes++;
    }

    public void returnBack(String retime) {    
        setwork("�ɽ�");
        setretime(retime);
    }


}