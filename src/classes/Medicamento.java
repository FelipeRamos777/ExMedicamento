package classes;
   
import java.util.ArrayList;

public class Medicamento {
    
    private String nome, val;
    private int cod, qtd;
    
    static ArrayList<Medicamento> vetmed = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public static ArrayList<Medicamento> getVetmed() {
        return vetmed;
    }

    public static void setVetmed(ArrayList<Medicamento> vetmed) {
        Medicamento.vetmed = vetmed;
    }
    
    
    
}
