import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Teste {
    public static void main(String[] args) {

        String caminho = "teste.txt";
        BufferedWriter escrever = new BufferedWriter(new FileWriter(caminho));
    }
}
