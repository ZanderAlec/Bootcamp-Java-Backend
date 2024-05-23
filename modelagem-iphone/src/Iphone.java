public class Iphone {

   public static ReprodutorMusical reprodutorMusical;
   public static AparelhoTelefonico telefone;
   public static NavegadorInternet navegador;

    public static void main(String[] args) throws Exception {

        reprodutorMusical = new ReprodutorMusical();
        telefone = new AparelhoTelefonico();
        navegador = new NavegadorInternet();
    }
}
