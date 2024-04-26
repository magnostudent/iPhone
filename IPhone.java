public interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

public interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

public interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba(String url);
    void atualizarPagina();
}

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public void tocar() { }
    public void pausar() { }
    public void selecionarMusica(String musica) { }

    public void ligar(String numero) { }
    public void atender() { }
    public void iniciarCorreioVoz() { }

    public void exibirPagina(String url) { }
    public void adicionarNovaAba(String url) { }
    public void atualizarPagina() { }
}
