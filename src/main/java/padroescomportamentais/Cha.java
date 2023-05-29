package padroescomportamentais;

public abstract class Cha {

    private int tipoBebida;
    protected String nome;
    private float valor1;
    private float valor2;

    public int getTipoBebida() {
        return tipoBebida;
    }

    public void setTipoBebida(int tipoBebida) {
        this.tipoBebida = tipoBebida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return valor1;
    }

    public void setValor1(float valor1) {
        this.valor1 = valor1;
    }

    public float getValor2() {
        return valor2;
    }

    public void setValor2(float valor2) {
        this.valor2 = valor2;
    }

    public float calcularMedia() {
        return (this.valor2 + this.valor2) / 2;
    }

    public abstract String verificarValor();

    public String getTipo() {
        return "Cliente";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "tipoBebida=" + this.tipoBebida +
                ", nome='" + this.nome + '\'' +
                ", resultado=" + this.verificarValor() +
                '}';
    }
}
