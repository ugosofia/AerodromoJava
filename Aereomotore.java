public class Aereomotore extends Aereomobile {

    private double potenza;


    @Override
    public Boolean superiore(CMP x) {
        if (x == null)
            return false;

        if (!(x instanceof Aereomotore)) {
            return false;
        } else {
            Aereomotore al = (Aereomotore) x;
            if (al.potenza < potenza)
                return false;
            return true;
        }
    }
}
