package smartPhone;

import navegador.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class IPhone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico{

    public void tocarMusica() {
        System.out.println("Tocando música pelo IPHONE");
    }

    public void pausarMusica() {
        System.out.println("Música pausada pelo IPHONE");
    }

    public void selecionarMusica() {
        System.out.println("Música selecionada pelo IPHONE");
    }

    public void efetuarLigacao() {
        System.out.println("Efetuando chamada pelo IPHONE");
    }

    public void atenderLigacao() {
        System.out.println("Chamada atendida pelo IPHONE");
    }

    public void iniciarCorreioDeVoz() {
        System.out.println("Efetuando chamada para o correio de voz pelo IPHONE");
    }

    public void exibirPagina() {
        System.out.println("Página exibida pelo IPHONE");
    }
    
    public void atualizarPagina() {
        System.out.println("Página atualizada pelo IPHONE");
    }
    
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada pelo IPHONE");
    }
}
