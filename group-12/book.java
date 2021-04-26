package book;

public class book {
    private String name;
    private int id;
    private boolean inout;
    private String lendName;
    public book(){}
    public book(String name,int id){
        setId(id);
        setName(name);
        inout=true;
    }

    public String getLendName() {
        return lendName;
    }

    public void setLendName(String lendName) {
        this.lendName = lendName;
    }

    public boolean isInout()
    {
        return inout;
    }
    public String getInout(){
        if (inout){
            return "未借出";
        }else {
            return "借出";
        }
    }
    public void setInout(boolean inout) {
        this.inout = inout;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}
