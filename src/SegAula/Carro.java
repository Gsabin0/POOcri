package SegAula;
public class Carro {
    //atributos
    private String nomeCarro;
    private String modelo;
    private float potencia;
    private String motor;
    private int ano;
    private String piloto;
    private int vitorias; 
    private int derrotas;
    private int empates;
    //construtor

    public Carro(String nomeCarro, String modelo, float potencia, String motor, int ano, String piloto) {
        this.nomeCarro = nomeCarro;
        this.modelo = modelo;
        this.potencia = potencia;
        this.motor = motor;
        this.ano = ano;
        this.piloto = piloto;
        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;
    }
    
    //metoods
    public void apresentar(){
        System.out.println("apresento o carro "+this.nomeCarro+" do modelo "+this.getModelo()+" do corredor "+this.getPiloto());
        System.out.println("vitorias "+this.getVitorias()+"\nEmpates "+this.getEmpates()+"\nDerrotas "+this.getDerrotas());
    }
    public void ganhar(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void perder(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatar(){
        this.setEmpates(this.getEmpates()+1);
    }
    //metodos especiais 

    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
}
