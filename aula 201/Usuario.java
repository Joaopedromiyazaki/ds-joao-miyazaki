//define a classe usuario (modelo/objeto)
//diagrama de classe -> NomeDaClasse / Atributos / Metodos (ações)
public class Usuario {

    //atributos privados (encapsulamento)
    private String nome;
    private String email;
    private int idade;

    // Construtor: chamado ao criar um novo usúario 
    public Usuario(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
    // metodos getters e setters(permitem acessar e modificar os atributos com segurança)
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email =email;
    }

    public int getIdade() {
        return idade; 
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Metodo personalizado para exibir informações do usuario 
    public void exibirInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail ());
        System.out.println("Idade: " + getIdade());
    }





}