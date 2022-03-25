public class Aliante extends Aereomobile {

    private int efficienza;

    public Aliante(String sigla, int efficienza) {
        super(sigla);
        this.efficienza = efficienza;
    }

    @Override
    public Boolean superiore(CMP x) {
        if (x == null)
                return false;

        if (!(x instanceof Aliante)) {
            return false;
        } else {
            Aliante al = (Aliante) x;
            if(al.efficienza < efficienza)
                return true;
                return false;


        }
    }
}
