package testeimovel;

public class Imovel {
    
    String endereco;
    double area;
    double precoM2;
    
    public double calculaPreco(){
    return area * precoM2;
    }
    
}
