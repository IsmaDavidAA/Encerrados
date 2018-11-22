import java.util.Scanner;
public class Encerrado
{
    private char [][] tablero;
    public Encerrado() {      
        tablero = new char[5][5];
    }
    
    public void mover(char jugador, int i, int j){}
    
    public void llenarMatriz(){
        
    }
    
    public String imprimirTablero() {
        char b = 92;    
        return "* - - - +" +"\n"+"  " + b + "   / |" +"\n"+"    o   |" +"\n"+"  /   "+ b + " |"+"\n"+"+ - - - *";
    }
}