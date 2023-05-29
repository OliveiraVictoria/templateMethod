package padroescomportamentais;

public class ClienteAdulto extends Cha {

    public String verificarValor() {
        if (this.calcularMedia() >= 4.0f) {
            return "Desconto";
        }
        else {
            return "Não Desconto";
        }
    }

    @Override
    public String getTipo() {
        return "Cliente Satisfeito";
    }
}
