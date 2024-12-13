package interfaces;

public interface Observador {
    public void observar(CoisaObservada coisa);
    
    public void receberAviso(String dado, String sinal, float valorAnterior);
}
