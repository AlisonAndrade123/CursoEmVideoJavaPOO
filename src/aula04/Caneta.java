package aula04;

public class Caneta {
    private String modelo;
    private double ponta;
    private String cor;
    private boolean tampada;

    public Caneta(String m, String c, double p ){
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public double getPonta() {
        return ponta;
    }
    public void setPonta(double p) {
        this.ponta = p;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    public void status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
