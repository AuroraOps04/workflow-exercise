import  java.util.*
public void Recommend() {
        System.out.println("****************************今日推荐书单****************************");
        BookSystem bs = new BookSystem();
        List<BS> table = new ArrayList<>();
        table = bs.query("", "");
        String str = new String(String.valueOf(table));
        String[] split = str.split("\\[|\\{|,|}|\\]| |=");
        List<String> list = new ArrayList<String>();
        List<String> list1 = new ArrayList<String>();
        List<Integer> num = new ArrayList<Integer>();
        num.add(-1);
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("作者")) {
                String newstr = split[i + 1];
                newstr = newstr.replace("'", "");
                list.add(newstr);
            }
        }
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("书名")) {
                String newstr1 = split[i + 1];
                newstr1 = newstr1.replace("'", "");
                list1.add(newstr1);
            }
        }
        Random random = new Random();
        int index1 = random.nextInt(list.size() - 0) + 1;
        for (int i = 0; i < index1; i++) {
            int flag = 0;
            int index = random.nextInt(list.size() - 0);
            for (int j = 0; j < num.size(); j++) {
                if (num.get(j) == index) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("书名：" + list1.get(index) + "(作者:" + list.get(index) + ")");
                num.add(index);
            }
        }
        System.out.println("********************************************************************");
    }