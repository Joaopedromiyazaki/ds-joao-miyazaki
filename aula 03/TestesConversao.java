public class TestesConversao {
  public static void main(String[] args) {
    int tentativas = 56;
    int acertos = 34;
    int erros = tentativas - acertos;
    float aproveitamento = (float) acertos / tentativas * 100.0f;
    char frescura = '%';

    System.out.println("seu aproveitamento é de " + aproveitamento + frescura);
    System.out.println("e seu numero de erros é " + erros );
  }
}

