public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    public static void main(String[] args) throws Exception {
    }

    public void ligar(String numero){
        System.out.println("Você ligou para o número: "+numero);
    }

    public void atender(){
        System.out.println("Alou?");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Correio de voz iniciado.");
    }

    public void exibirPagina(String url){
        System.out.println("Página exibida.");
    }

    public void adicionarNovaAba(){
        System.out.println("Aba adicionada");
    }

    public void atualizarPagina(){
        System.out.println("Página atualizada");
    }

    public void tocar(){
        System.out.println("Tocando!");
    }

    public void pausar(){
        System.out.println("Pausado!");
    }

    public void selecionarMusica(String musica){
        System.out.println("Você selecionou a musica: "+ musica);
    }
}
