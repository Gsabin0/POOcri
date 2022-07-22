package poocri;
public class End {
    //atributos
    private String lougador;
    private String complemento;
    private int numero;
    private String cep;
    //construtor

    public End(String lougador, String complemento, int numero, String cep) {
        this.lougador = lougador;
        this.complemento = complemento;
        this.numero = numero;
        this.cep = cep;
    }
    
    //metodos 
    public void status(){
        System.out.println("-------");
        System.out.println("lougadouro: "+this.getLougador()+"\ncomplemento: "+this.getComplemento()+
                "\nnumero: "+this.getNumero()+"CEP: "+this.getCep());
    }
    //metodods especiais

    public String getLougador() {
        return lougador;
    }

    public void setLougador(String lougador) {
        this.lougador = lougador;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
}
