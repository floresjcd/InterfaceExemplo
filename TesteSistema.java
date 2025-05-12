// Classe principal para teste
public class TesteSistema {
    public static void main(String[] args) {
        Aplicacao app = new Aplicacao();
        app.iniciar(); // Chama método abstrato e método padrão
        app.log("Sistema funcionando"); // Chama método padrão
        Sistema.verificarVersao(); // Chama método estático
    }
}