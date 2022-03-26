public class Aliante extends Aereomobile {

    private int efficienza;


    public Aliante(String sigla, int efficienza) {
        super(sigla);
        this.efficienza = efficienza;
    }

    @Override
    public void superiore(CMP x) {
        if (x == null)
            System.out.println("Il valore passato è nullo");

        if (!(x instanceof Aliante al)) {
            throw new ClassCastException("Errore di tipo!!");
        } else {
            if (al.efficienza == efficienza) {
                System.out.println("I due alianti hanno la stessa efficienza");
            } else
            if(al.efficienza < efficienza) {
                System.out.println("L'aliante " + al.sigla + " è meno efficiente di " + this.sigla);
            } else {
                System.out.println("L'aliante " + al.sigla + " è più efficiente di " + this.sigla);
            }

        }
    }
}
