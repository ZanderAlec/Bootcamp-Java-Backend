import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados(){
        /*
         *     HashSet -> Os elementos não são guardados em uma ordem específica. 
         *      A vantagem é que buscas são muito eficientes, pois os elementos são armazenados em 
         *  uma tabela hash.

         */
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        this.convidados.add(new Convidado(nome, codigoConvite));
    }

    //set não permite elementos iguais. A diferenciação se dá através do código do convite.
    //Assim, mesmo que duas instancias tenham informações identicas, elas serão diferentes, por conta do código.
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : this.convidados){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }

        this.convidados.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidados.size();
    }

    public void exibirConvidados(){
            System.out.println(this.convidados);
    }


    public static void main(String args[]){
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1);

        //graças ao hash, a lista só irá adicionar um dos elementos abaixo. Não haverá repetição.
        conjuntoConvidados.adicionarConvidado("Convidado 2", 2);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 2);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 4);

        System.out.println("Número de convidados: "+conjuntoConvidados.contarConvidados());
        
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1);
        
        System.out.println("Número de convidados: "+conjuntoConvidados.contarConvidados());

        conjuntoConvidados.exibirConvidados();
    }
    

   
}
