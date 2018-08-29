package staticvariable;

public class TestBackYeard {

    public static void main(String[] args) {

        BackYeard by1 = new BackYeard();
        by1.backYeardSize = 5;
        System.out.println(by1.backYeardSize);

        BackYeard by2 = new BackYeard();
        by2.backYeardSize = 10;
        System.out.println(by2.backYeardSize);

        System.out.println(by1.backYeardSize);

    }
}
