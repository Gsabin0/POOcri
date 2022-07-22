package SegAula;
public class Appcarro {
    public static void main(String[] args) {
        Carro c []= new Carro[3];
        
        
        
        c[0] = new Carro("Samus","ford ka",1223.4f,"mot",2001,"Sabino");
        c[1] = new Carro("Car","fiat unno",12.4f,"fire",1999,"Juca");
        c[2] = new Carro("One","gol bolinha",12223.4f,"Torre",2005,"Mitico");
        
        Corrida k = new Corrida();
        k.mcorrida(c[0], c[1]);
        k.correr();
        
        c[0].apresentar();
        c[1].apresentar();
    }
    
}
