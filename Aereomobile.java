public abstract class Aereomobile implements CMP {

    private String sigla;

    public Aereomobile() {
    }

    public Aereomobile(String sigla) {
        this.sigla = sigla;
    }


    @Override
    public Boolean superiore(CMP x) {
        return null;
    }
}
