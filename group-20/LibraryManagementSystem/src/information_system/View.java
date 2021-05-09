package information_system;

import java.util.Scanner;

public class View {     //view视图层
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		Service ser = new Service();
		boolean flag = false;
		int time=3;     //定义输入次数
		System.out.println("欢迎进入图书管理系统！");
			while(!flag && time>0) {
				System.out.println("========图书信息管理系统========");
				System.out.println("[Locked]请先登录！");
				System.out.println("请输入账号：");
				System.out.print("-->");
				String username = input.next();
				System.out.println("请输入密码：");
				System.out.print("-->");
				String password = input.next();
				flag = ser.login(username,password);
				if(flag==false) {
					time--;
					System.out.println("账号或密码错误，请重试，还剩"+time+"次");
				}
			}
			if(time==0) {
				System.out.println("登录次数已用光，退出系统！");
				System.exit(0);
			}
			System.out.println("[Pass]登录成功！");
			while(true) {
				System.out.println("========学生信息管理系统========");
				System.out.println("[1] 查询全部图书信息");
				System.out.println("[2] 添加图书信息");
				System.out.println("[3] 删除图书信息");
				System.out.println("[4] 修改图书信息");
				System.out.println("[5] 图书推荐功能");
				System.out.println("[6] 退出系统");
				System.out.println("请输入：");
				System.out.print("-->");
				int chioce=input.nextInt();
				switch(chioce) {
					case 1:
						ser.selectall();             //查看全部图书信息
						break;
					case 2:
						ser.insert();                //添加图书信息
						break;
					case 3:
						ser.delete();                //删除图书信息
						break;
					case 4:
						ser.update();                //更新图书信息
						break;
					case 5:
						ser.recommend();                //图书推荐
						break;
					case 6:
						System.out.println("欢迎下次登陆！");          //退出
						System.exit(0);
	                    break;
	                default:
	                	System.out.println("请输入正确的数字");          //输入错误，重新输入
				}
				System.out.println("======================================");
			}
		}
		
	}

