package exemplo_02;

public class Cliente extends Pessoa{
    private double valorDivida;

    public Cliente(String n, String f, double v) {
        super(n, f);
        this.setValorDivida(v);
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
    
    @Override
    public void print(){
        super.print();
        System.out.println("Valor da Divida: " + this.getValorDivida());
    }
    
    public double calcularJuros(double tx){
        return this.valorDivida * tx / 100;
    }
}
