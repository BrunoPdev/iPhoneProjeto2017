public class iPhone2017 {

    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Testando Reprodutor Musical
        meuIphone.selecionarMusica("Minha Alma");
        meuIphone.tocarMusica();
        meuIphone.pausarMusica();

        // Testando Aparelho Telefônico
        meuIphone.ligar("7199909-4567");
        meuIphone.atenderChamada();
        meuIphone.iniciarCorreioVoz();

        // Testando Navegador de Internet
        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
