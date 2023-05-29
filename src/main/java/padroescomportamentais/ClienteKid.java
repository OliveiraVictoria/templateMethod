package padroescomportamentais;

public class ClienteKid extends Cha{

    public String verificarValor() {
        if (this.calcularMedia() >= 4.0f) {
            return "Desconto";
        }
        else {
            return "Não Desconto";
        }
    }

}
