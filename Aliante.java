import java.util.Objects;

public class Aliante extends Aereomobile {

    //ATTRIBUTI
    private int efficienza;

    //COSTRUTTORI

    /**
     *
     * @param sigla
     * @param efficienza
     */
    public Aliante(String sigla, int efficienza) {
        super(sigla);
        this.efficienza = efficienza;
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

    @Override
    public String toString() {
        return "Aliante{" +
                "sigla='" + sigla + '\'' +
                ", efficienza=" + efficienza +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aliante)) return false;
        if (!super.equals(o)) return false;
        Aliante aliante = (Aliante) o;
        return sigla == aliante.sigla;
    }


}
