
package calculadora;
import javax.swing.JOptionPane;
import java.io.*;
import java.text.*;

public class Calculadora {
    int tipo;
    int num1;
    int num2;
    
    public void Calculo(){
         String lerNum1 = JOptionPane.showInputDialog("Digite 1 para somar."+"\n"+
                                                      "Digite 2 para subtrair." +"\n"+
                                                      "Digite 3 para multiplicar."+"\n"+
                                                      "Digite 4 para dividir.");
         tipo = Integer.parseInt(lerNum1);
         
         if(tipo==1){
             String lerNum = JOptionPane.showInputDialog("Digite o primeiro número.");
             String lerNum2 = JOptionPane.showInputDialog("Digite o segundo número.");
             num1= Integer.parseInt(lerNum);
             num2 = Integer.parseInt(lerNum2);
             float soma= num1 +num2;
             JOptionPane.showMessageDialog(null, "A Soma de " + num1 + " e " + num2 + " é: " + soma + ".");
         }if(tipo==2){
             String lerNum = JOptionPane.showInputDialog("Digite o primeiro número.");
             String lerNum2 = JOptionPane.showInputDialog("Digite o segundo número.");
             num1= Integer.parseInt(lerNum);
             num2 = Integer.parseInt(lerNum2);
             float subtrair= num1 - num2;
             JOptionPane.showMessageDialog(null, "A Subtração de " + num1 + " e " + num2 + " é: " + subtrair + ".");    
         }if(tipo==3){
             String lerNum = JOptionPane.showInputDialog("Digite o primeiro número.");
             String lerNum2 = JOptionPane.showInputDialog("Digite o segundo número.");
             num1= Integer.parseInt(lerNum);
             num2 = Integer.parseInt(lerNum2);
             float multiplicar= num1 * num2;
             JOptionPane.showMessageDialog(null, "A Multiplicação de " + num1 + " e " + num2 + " é: " + multiplicar + ".");         
         }if(tipo==4){
             String lerNum = JOptionPane.showInputDialog("Digite o primeiro número.");
             String lerNum2 = JOptionPane.showInputDialog("Digite o segundo número.");
             num1= Integer.parseInt(lerNum);
             num2 = Integer.parseInt(lerNum2);
             float dividir= num1 / num2;
             JOptionPane.showMessageDialog(null, "A Divisão de " + num1 + " e " + num2 + " é: " + dividir + "."); 
         }if(tipo>=5){
             JOptionPane.showMessageDialog(null, "Este número não é válido.");   
         }
    }

public static void main(String[] args) {
    Calculadora calc = new Calculadora();
        calc.Calculo();
    }    
}

