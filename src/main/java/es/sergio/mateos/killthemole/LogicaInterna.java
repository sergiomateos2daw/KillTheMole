package es.sergio.mateos.killthemole;

public class LogicaInterna {
    
    short tamXTablero;
    short tamYTablero;
    char[][] tablero;
    final char JUGADOR1 = 'T';
    final char JUGADOR2 = '2';
    final char VACIO = '.';
    
    //Método constructor
    public LogicaInterna(){
        tamXTablero = 7;
        tamYTablero = 6;
        tablero = new char[tamXTablero][tamYTablero];
        for(int x=0;x<tamXTablero;x++){
            for(int y=0;y<tamYTablero;y++){
                tablero[x][y] = VACIO;
            }
        }
    }
    
    //Método constructor
    public LogicaInterna(short tamX, short tamY){
        tamXTablero = tamX;
        tamYTablero = tamY;
        tablero = new char[tamXTablero][tamYTablero];
        for(int x=0;x<tamXTablero;x++){
            for(int y=0;y<tamYTablero;y++){
                tablero[x][y] = VACIO;
            }
        }
    }
    
    public void mostrarTableroConsola(){
        for(int y=0;y<tamYTablero;y++){
            for(int x=0;x<tamXTablero;x++){
                System.out.print(tablero[x][y]);
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public void borrarTableroConsola(){
        for(int y=0;y<tamYTablero;y++){
            for(int x=0;x<tamXTablero;x++){
                System.out.print(tablero[x][y]);
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public boolean colocarFicha(int columna, int fila, int jugador){
        if(columna >= 0 && columna < tamXTablero) {
            switch(jugador) {
            case 1:
                tablero[columna][fila] = JUGADOR1;
                break;
            case 2:
                tablero[columna][fila] = VACIO;
                break;
        }
            return true;
        } else {
            return false;
        }
    }
    
    public int buscarFila(int columna){
        int fila = 0;
        while(fila < tamYTablero && tablero[columna][fila] == VACIO){
            fila++;
        }
        return fila - 1;
    }
}
