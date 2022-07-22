package poocri;
public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Sabino",23,"M");
        End e =  new End("Runa inamar ","Casa ",43,"09970-845");
        p.setEndereço(e);
        p.Status();
        
    }
}
