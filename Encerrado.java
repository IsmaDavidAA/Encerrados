import java.util.Scanner;
public class Encerrado{
    private String [] tablero;
    private String[] poniente={"G", "┬", "S", "├","B","☻","L","┴","R"};
    private Integer jugador;
    private Boolean despuesDeIngresar;
    private Boolean jugando;
    private Scanner sc = new Scanner(System.in);
    private String reinoLibre;
    public Encerrado(){      
        tablero = new String[9];
        this.llenarMatriz();
        jugador = 1;
        despuesDeIngresar = false;
        jugando = false;
        sc = new Scanner(System.in);
        reinoLibre = "B";
        /*
        System.out.println(">>  Encerrados  <<");
        do {
            System.out.println("Turno Jugador ["+jugador+"]");
            while(!despuesDeIngresar ) {
                imprimirTablero();
                System.out.println("     Ingresa Fila:");
                int px=Integer.parseInt(sc.nextLine());
                System.out.println("     Ingresa Columna:");
                int py=Integer.parseInt(sc.nextLine());
                despuesDeIngresar  = agregaPosicion();
                if (!despuesDeIngresar ) System.out.println("ERROR: Casilla ya ingresada o Fuera del Rango");
            }
            
            if (compruebaGana()) {
                imprimirTablero();
                System.out.println("Jugador ["+jugador+"] ha ganado ");
                return;
            }
            
            jugador++;
            if (jugador == 3) jugador = 1;
            despuesDeIngresar = false;
            
        } while(jugando);
        */
        
    }
    
    public void llenarMatriz(){
        tablero[0] = "♦";
        tablero[1] = "┬";
        tablero[2] = "♣";
        tablero[3] = "├";
        tablero[4] = "B";
        tablero[5] = "☻";
        tablero[6] = "♣";
        tablero[7] = "┴";
        tablero[8] = "♦";
    }
    
    /*public String imprimirTablero(){
        return "♦┬♣" +"\n"+
               "├B☻" +"\n"+
               "♣┴♦" +"\n";
    }*/
    
    public String imprimirTablero(){
        String tableroImprimir = "";
        for(int i=0; i < 9; i++) {
            tableroImprimir = tableroImprimir + this.tablero[i]; 
            if((i + 1)%3 == 0){    
                tableroImprimir = tableroImprimir + "\n";
            }
        }
        return tableroImprimir;
    }
    
    
    /*public void iniciarConquista(String conquistador, String conquistado){
        tablero[0] = "G";
        tablero[4] = "♦";
    }*/
    
    public void iniciarConquista(String conquistador, String conquistado){
        if(sePuedeConquistar(conquistador, conquistado, "♦") == true){
            
        }
    }
    
    /*public Boolean sePuedeConquistar(String conquistador,String conquistado, String jugador){
        return true;
    }*/
    
    public Boolean sePuedeConquistar(String conquistador,String conquistado, String jugador){
        Boolean esConquistable = false;
        if(conquistador == "G" && conquistado != "R" && reinoLibre == conquistado) esConquistable = true;
        else if(conquistador == "S" && conquistado != "L" && conquistado != "R" && reinoLibre == conquistado) esConquistable = true;
        else if(conquistador == "B" && reinoLibre == conquistado) esConquistable = true;
        else if(conquistador == "L" && conquistado != "S" && reinoLibre == conquistado) esConquistable = true;
        else if(conquistador == "R" && conquistado != "G" && conquistado != "S" && reinoLibre == conquistado) esConquistable = true;
        return esConquistable; 
    }
    
    /*public void conquistar(String conquistador,String conquistado){
        tablero[4] = tablero[0];
        tablero[0] = "G";
    }*/
    
    public void conquistar(String conquistador,String conquistado){
        Integer posConquistador = 0, posConquistado = 0;   
        for(int i=0; i < 9; i++){
            if(this.poniente[i] == conquistador) posConquistador = i;
            if(this.poniente[i] == conquistado) posConquistado = i;
        }
        tablero[posConquistado] = tablero[posConquistador];
        tablero[posConquistador] = conquistador;
        reinoLibre = conquistador;
    }
    
    public Boolean gano(String jugador){
        Boolean esPerdedor = true;
        if(jugador == tablero[0] && jugador == tablero[2] && reinoLibre == tablero[8]){
            esPerdedor = false;
        }else if(jugador == tablero[6] && jugador == tablero[8] && reinoLibre == tablero[2]){
            esPerdedor = false;
        }
        return esPerdedor;
    }
    
    
}