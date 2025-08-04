public class Main {
    public static void main(String[] args) {

        //cria um novo objeto usuario usando o construtor
        Usuario usuario1 = new Usuario("Joao", "joao@email.com", 37);

        //exibe as informações do usuario 
        usuario1.exibirInfo();

        //Altera o nome usando o setter
        usuario1.setNome("Joao Siles");

        //exibe novamente após alteração 
        System.out.println("\nApós alteraçao do nome:");
        usuario1.exibirInfo();
    } }