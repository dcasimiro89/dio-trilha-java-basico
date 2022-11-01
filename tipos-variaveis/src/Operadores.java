public class Operadores {
    
    static void op1() {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
		
        //qual o resultado das expressoes abaixo?
        String concatenacao = "?"; 

        concatenacao = 1+1+1+"1";
        System.out.println("1: " + concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println("2: " +concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println("3: " +concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println("4: " +concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println("5: " +concatenacao);
    }
    
    static void op2() {


        int numero = 5;

        numero = - numero;
        System.out.println(numero);

        numero = + numero;
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);

        boolean variavel = true;

        variavel = !variavel;
        System.out.println(variavel);
    }

    static void ternario() {

        int a = 6;
        int b = 6;

        String resultado = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado);
    }

    static void relacionais() {

        String nomeUm = "Deivison";
        String nomeDois = new String("Deivison");

        System.out.println(nomeUm.equals(nomeDois)); // compara conteúdo dos objetos

        int numero1 = 1;
        int numero2 = 2;

        if(numero1 < numero2) {
            System.out.println("A nossa condição é verdadeira");
        }

        boolean simNao = numero1 == numero2;   
        System.out.println("NúmeroUm é igual a númeroDois? " + simNao);

        simNao = numero1 != numero2;   
        System.out.println("NúmeroUm é diferente a númeroDois? " + simNao);

        simNao = numero1 > numero2;   
        System.out.println("NúmeroUm é maior que númeroDois? " + simNao);
    }

    static void logicos() {
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        } 

        if(condicao1 && (7 > 4)) {
            System.out.println("As duas condições são verdadeiras");
        } 

        if(condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
        }
    }
    public static void main(String[] args) {
        
        //op1();        
        //op2();        
        //ternario();
        //relacionais();
        logicos();
        
    }  
}
