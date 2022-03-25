public class Aliante extends Aereomobile {

    private int efficienza;

    @Override
    public Boolean superiore(CMP x) {
        if (x == null)
                return false;

        if (!(x instanceof Aliante)) {
            return false;
        } else {
            Aliante al = (Aliante) x;
            if(al.efficienza < efficienza)
                return false;
                return true;


        }
    }
}
