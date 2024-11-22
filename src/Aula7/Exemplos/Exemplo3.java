package Aula7.Exemplos;

public class Exemplo3 {
    public static void main(String[] args) {
        int retorno = funçaoComParametroComRetorno();
        System.out.println(retorno);
    }
    static int funçaoComParametroComRetorno(int numero1, int numero2) {
        System.out.println("a seguir o resultado");
        return numero1 + numero2;
    }
}
