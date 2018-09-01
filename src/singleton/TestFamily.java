package singleton;

public class TestFamily {
    public static void main(String[] args) {
        Family fm1 = Family.getSingleton();
        fm1.displayFamilymenbers();

    }
}
