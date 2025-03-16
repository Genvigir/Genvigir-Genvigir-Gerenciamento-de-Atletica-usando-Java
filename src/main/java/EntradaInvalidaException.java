//Lucas Carvalho Batista Canhadas Genvigir

public class EntradaInvalidaException extends Exception {

    public EntradaInvalidaException(String todos_os_campos_devem_ser_preenchidos) {
    }

    Leitura l = new Leitura();

    public void impEntradaInvalida() {
        System.out.println("Entrada inválida. Deve ser uma string não vazia e não numérica.");
    }

    public String corEntradaInvalida(String entradaAtual) {
        while (true) {
            String novaEntrada = l.entDados("\nInforme uma entrada válida: ");
            if (novaEntrada == null || novaEntrada.trim().isEmpty()) {
                System.out.println("\nA entrada não pode ser vazia.");
            } else if (novaEntrada.matches("\\d+")) {
                System.out.println("\nA entrada não pode ser um número.");
            } else {
                return novaEntrada; 
            }
        }
    }
}
