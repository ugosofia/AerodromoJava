public class Aereomotore extends Aereomobile {

    private double potenza;

    public Aereomotore(String sigla, double potenza) {
        super(sigla);
        this.potenza = potenza;
    }

    @Override
    public Boolean superiore(CMP x) {
        if (x == null)
            return false;

        if (!(x instanceof Aereomotore)) {
            return false;
        } else {
            Aereomotore al = (Aereomotore) x;
            if (al.potenza < potenza)
                return true;
                return false;
        }
    }
}
