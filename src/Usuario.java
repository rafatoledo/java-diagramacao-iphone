import navegador.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;
import smartPhone.IPhone;
import telefone.AparelhoTelefonico;

public class Usuario {
    public static void main(String[] args) throws Exception {        
        
        ReprodutorMusical musIphone = new IPhone();
        AparelhoTelefonico telIphone = new IPhone();
        NavegadorInternet navIphone = new IPhone();

        //Funcionalidades do reprodutor musical
        musIphone.selecionarMusica();
        musIphone.tocarMusica();
        musIphone.pausarMusica();

        //Funcionalidades do telefone
        telIphone.atenderLigacao();
        telIphone.efetuarLigacao();
        telIphone.iniciarCorreioDeVoz();

        //Funcionalidades do navegador
        navIphone.exibirPagina();
        navIphone.atualizarPagina();
        navIphone.adicionarNovaAba();
    }
}
