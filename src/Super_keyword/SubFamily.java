package Super_keyword;

public class SubFamily extends Family {

    public String parents;
    public SubFamily(){
        super();
        System.out.println("Default sub");
    }

    public SubFamily(String parents, int motherage, String father){
        super(parents,motherage);
        this.parents = parents;
        this.motherage= motherage;
        this.father = father;
        System.out.println(parents+" "+ motherage+" "+ father);

    }

    public void parentsInfo(){
        System.out.println("parents information");
    }

}
