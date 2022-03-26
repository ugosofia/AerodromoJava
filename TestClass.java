public class TestClass {
    public static void main(String[] args) {
        Aereomobile a = new Aereomotore("AA71", 20.0);
        Aereomobile a1 = new Aereomotore("AA75", 40.0);
        Aereomobile a2 = new Aereomotore("AA100", 40.0);

        a.superiore(a1);
        System.out.println();

        a1.superiore(a);
        System.out.println();

        a1.superiore(a2);
        System.out.println();


        Aereomobile b = new Aliante("AL100", 50);
        Aereomobile b1 = new Aliante("AL150", 80);
        Aereomobile b2 = new Aliante("AL200", 80);

        b.superiore(b1);
        System.out.println();

        b1.superiore(b);
        System.out.println();

        b1.superiore(b2);
        System.out.println();

    }

}