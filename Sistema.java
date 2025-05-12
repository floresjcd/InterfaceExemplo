// Interface com todos os componentes
public interface Sistema {
    // 1. Método abstrato (obrigatório implementar)
    void iniciar();

    // 2. Constante pública (implicitamente static final)
    int VERSAO = 1; // Constante

    // 3. Método padrão (default method)
    default void log(String mensagem) {
        validar(); // Chama método privado
        System.out.println("[Log] " + mensagem);
    }

    // 4. Método estático
    static void verificarVersao() {
        System.out.println("Versão do sistema: " + VERSAO);
    }

    // 5. Método privado (só acessível dentro da interface)
    private void validar() {
        System.out.println("Validando sistema...");
    }
}