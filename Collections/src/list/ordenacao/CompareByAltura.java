import java.util.Comparator;

public class CompareByAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        if(p1.getAltura() > p2.getAltura()) return 1;
        if(p1.getAltura() < p2.getAltura()) return -1;
        return 0;
    }

}
