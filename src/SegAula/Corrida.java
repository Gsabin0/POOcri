package SegAula;

import java.util.Random;

public class Corrida {
    //atributos
   private Carro desafiante;
   private Carro desafiado;
   private boolean aprovada;
   //metodos 
   public void mcorrida(Carro l1, Carro l2){
       if (l1!=l2) {
          this.setAprovada(true);
          this.setDesafiado(l1);
          this.setDesafiante(l2);
       }else{
           this.setAprovada(false);
           this.setDesafiado(null);
           this.setDesafiante(null);
       }
   }
   public void correr(){
       if (aprovada) {
           /*System.out.println("desafiante");
           this.getDesafiante().apresentar();
           System.out.println("desafiado");
           this.getDesafiado().apresentar();*/
           
           Random aleatorio = new Random();
         int vencedor = aleatorio.nextInt(3);
         switch (vencedor){
                case 0:
                    System.out.println("");
                    System.out.println("empate");
                    this.getDesafiado().empatar();
                    this.getDesafiante().empatar();
                    break;
                case 1:
                    System.out.println("");
                    System.out.println("vitoria do "+this.desafiante.getPiloto());
                    this.getDesafiante().ganhar();
                    this.getDesafiado().perder();
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("vitoria do "+this.desafiado.getPiloto());
                    this.getDesafiado().ganhar();
                    this.getDesafiante().perder();
                    break;
         }
       }else{
           System.out.println("ERRO, Nao podem correr");
       }
   }
   //metodos especiais

    public Carro getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Carro desafiante) {
        this.desafiante = desafiante;
    }

    public Carro getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Carro desafiado) {
        this.desafiado = desafiado;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
   
   
}
