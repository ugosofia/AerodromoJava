public class Aereomotore extends Aereomobile {

    private double potenza;

    public Aereomotore(String sigla, double potenza) {
        super(sigla);
        this.potenza = potenza;
    }

    @Override
    public void superiore(CMP x) {
        if (x == null)
            System.out.println("Il valore passato è nullo");

        if (!(x instanceof Aereomotore am)) {
            throw new ClassCastException("Errore di tipo!!");
        } else {
            if (am.potenza == potenza) {
                System.out.println("I due aereomotori hanno la stessa efficienza");
            } else
            if(am.potenza < potenza) {
                System.out.println("L'aereomotore " + am.sigla + " è meno efficiente di " + this.sigla);
            } else {
                System.out.println("L'aliante " + am.sigla + " è più efficiente di " + this.sigla);
            }
        }
    }
}
