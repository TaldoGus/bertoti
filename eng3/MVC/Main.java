package estruturaMVC;

public class Main {
    public static void main(String[] argumentos) {
        ModeloForma modelo = new ModeloForma();
        VisaoForma visao = new VisaoForma(modelo);

        modelo.atualizarEstado();  // Notifica a visão sobre a alteração
    }
}