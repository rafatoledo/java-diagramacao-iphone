package reprodutorMusical;

public class IPod implements ReprodutorMusical {

    public void tocarMusica() {
        System.out.println("Tocando música pelo IPOD");
    }

    public void pausarMusica() {
        System.out.println("Música pausada pelo IPOD");
    }

    public void selecionarMusica() {
        System.out.println("Música selecionada pelo IPOD");
    }    
}
