import javax.swing.*;
import java.io.IOException;

public class Main {
    public static <integer> void main(String[] args) throws IOException {
        String x = JOptionPane.showInputDialog("Dame el primer numero:");
        System.out.println(x);
        String y = JOptionPane.showInputDialog("Dame el segundo numero:");
        System.out.println(y);
        String z = JOptionPane.showInputDialog("Dame el tercer numero:");
        System.out.println(z);
        float sumaa = Integer.parseInt(x) + Integer.parseInt(y) + Integer.parseInt(z);
        float resultado = sumaa / 3;
        System.out.println("El resultado es: " + resultado);
    }
}