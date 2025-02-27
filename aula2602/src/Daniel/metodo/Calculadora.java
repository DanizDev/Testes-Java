package Daniel.metodo;

public class Calculadora {

    int numberOne = 10;
    int numberTwo = 10;

    void adicao() {

        int resultado = numberOne + numberTwo;
        System.out.println("O valor da soma dos dois numeros é: " + resultado);

    }

    
    void subtrair(){
        
        int resultado = numberOne - numberTwo;
        System.out.println("O valor da subtração dos dois numeros é: " + resultado);
        
    }
    
    void multiplicacao(){
        
        int resultado = numberOne * numberTwo;
        System.out.println("O valor da multiplicação dos dois numeros é: " + resultado);
        
        
        
    }
    
    void divisao(){
        
        int resultado = numberOne / numberTwo;
        System.out.println("O valor da divisão dos dois numeros é: " + resultado);
        
        
    }
    
}
