import java.util.Objects;

public abstract class Aereomobile implements CMP {

    protected String sigla;

    public Aereomobile() {
    }

    public Aereomobile(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Aereomobile{" +
                "sigla='" + sigla + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aereomobile)) return false;
        Aereomobile am = (Aereomobile) o;
        return Objects.equals(sigla, am.sigla);
    }

}
