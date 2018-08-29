package Super_keyword;

public class Family {
    public String mother;
    public String father;
    public int motherage;

    public Family(){
        System.out.println("From family");
    }
    public Family(String mother,int motherage){
        this.mother = mother;
        this.motherage= motherage;
        System.out.println(mother + " " +motherage);
    }
}
