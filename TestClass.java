public class TestClass {
    public static void main(String[] args) {
        Aereomobile a = new Aereomotore("AA71", 20.0);
        Aereomobile a1 = new Aereomotore("AA75", 40.0);

        System.out.println(a.superiore(a1));

        Aereomobile b = new Aliante("AL100", 50);
        Aereomobile b1 = new Aliante("AL100", 80);

        System.out.println(b.superiore(b1));
    }

}