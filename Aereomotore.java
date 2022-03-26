public class Aereomotore extends Aereomobile {
    // ATTRIBUTI

    private double potenza;

    //CONSTRUTTORI

    /**
     *
     * @param sigla
     * @param potenza
     */
    public Aereomotore(String sigla, double potenza) {
        super(sigla);
        this.potenza = potenza;
    }

    //METODI

    /**
     *
     * @param x
     */
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

    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aereomotore)) return false;
        if (!super.equals(o)) return false;
        Aereomotore aereomotore = (Aereomotore) o;
        return sigla == aereomotore.sigla;
    }

    @Override
    public String toString() {
        return "Aereomotore{" +
                "sigla='" + sigla + '\'' +
                ", potenza=" + potenza +
                '}';
    }
}
