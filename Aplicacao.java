// Classe que implementa a interface Sistema
public class Aplicacao implements Sistema {
    @Override
    public void iniciar() {
        System.out.println("Aplicação iniciada!");
        log("Sistema iniciado"); // Usa o método padrão da interface
    }
}