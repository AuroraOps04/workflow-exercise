package information_system;

import java.util.HashMap;
import java.util.Scanner;

public class Service {       //菜单类 controller控制层
	Scanner input = new Scanner(System.in);
	DataOperate data_operate = new DataOperate();
	public Service() {          //无参构造方法
    }
	public boolean login(String username,String password) //管理员登录操作
    {
        return data_operate.login(username,password);
    }
	public void selectall() { //调用数据库查询全部图书信息操作
		data_operate.selectall();
	}
	public void insert() { //调用数据库插入操作
		String id=null;  
		String name=null;
		 
        try{
            System.out.println("请输入图书ID：");
            id=input.next();
            System.out.println("请输入图书名字：");
            name=input.next();
            Book book=new Book(id,name);
            data_operate.insert(book);
        }
        catch (Exception e)
        {
            System.out.println("请输入正确格式");
        }

	}
	public void update() { //调用数据库修改操作
		System.out.println("请输入需要修改的图书ID:");
        String id=input.next();
        System.out.println("请输入需要更新的名字：");
        String name=input.next();
        data_operate.update(id,name);
	}
	public void delete() { //调用数据库删除操作
		System.out.println("请输入删除的图书ID：");
        String id=input.nextLine();
        data_operate.delete(id);
	}
	public void recommend() {     //调用数据库根据学号查询信息
		System.out.println("今日推荐图书:");
        data_operate.recommend();
	}
	public void studentSelect(String studentnumber) {      //调用数据库查询个人信息
		data_operate.recommend();
	}


}