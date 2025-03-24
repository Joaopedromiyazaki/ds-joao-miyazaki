

import java.util.Scanner; 

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite o nome do funcionario, sua idade, quantas horas no mes ele trabalha,seu salario p/hora, seus filhos (-14) e a quanto tempo ele está na empresa");
        char dinheiro = '$';
        
        //nome do funcionario     
        String nomeFunc = myObj.nextLine();
        //Idade
        int idadeFunc = myObj.nextInt();
        //horas mensais
        float horasTrabalhadas = myObj.nextFloat();
        //Salario/hora
        float salarioHora = myObj.nextFloat();
        //Crias Sub-14
        int filhos = myObj.nextInt();
        //tempo de empresa
        int tempoDeEscravidao = myObj.nextInt();

        float salarioBruto = (horasTrabalhadas * salarioHora);
        float salarioLiquido = salarioBruto;
        System.out.println("Seu salario no mes vai ser de: " + salarioBruto + dinheiro);
        if (salarioBruto > 1500) {
             salarioLiquido = (-salarioBruto/100) * 15 + salarioBruto;
            System.out.println("Seu salario liquido é de " + salarioLiquido + dinheiro);  
        } else if (salarioBruto < 1500 & salarioBruto > 500){
             salarioLiquido = (-salarioBruto/100) * 8 +salarioBruto;
            System.out.println("Seu salario liquido é de " + salarioLiquido + dinheiro);
        } else {
            System.out.println("Salario liquido: " + salarioBruto + dinheiro);
        }
        float bonus = (filhos * 100);
        float salarioLiquidoBonus = (salarioLiquido + bonus);
        System.out.println("Seu salario com o bonus familia será de: " + salarioLiquidoBonus + dinheiro);
        
        }

      





    }
