package iphone;

public class iPhone implements ReprodutorMusical, AparelhoTelefônico, NavegadorInternet {
    private String modelo;
    private String númeroSérie;
    private int armazenamento;

    public iPhone(String modelo, String númeroSérie, int armazenamento) {
        this.modelo = modelo;
        this.númeroSérie = númeroSérie;
        this.armazenamento = armazenamento;
    }

    public void ligar() {
        System.out.println("iPhone ligado.");
    }

    public void desligar() {
        System.out.println("iPhone desligado.");
    }

    @Override
    public void reproduzirMusica() {
        System.out.println("Reproduzindo música no iPhone.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música no iPhone.");
    }

    @Override
    public void avançar() {
        System.out.println("Avançando faixa de música no iPhone.");
    }

    @Override
    public void retroceder() {
        System.out.println("Retrocedendo faixa de música no iPhone.");
    }

    @Override
    public void fazerLigação() {
        System.out.println("Fazendo uma ligação no iPhone.");
    }

    @Override
    public void receberLigação() {
        System.out.println("Recebendo uma ligação no iPhone.");
    }

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem no iPhone.");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem no iPhone.");
    }

    @Override
    public void abrirNavegador() {
        System.out.println("Abrindo o navegador no iPhone.");
    }

    @Override
    public void fecharNavegador() {
        System.out.println("Fechando o navegador no iPhone.");
    }

    @Override
    public void navegar() {
        System.out.println("Navegando na internet no iPhone.");
    }

    @Override
    public void buscarInformações() {
        System.out.println("Buscando informações na internet no iPhone.");
    }
}
