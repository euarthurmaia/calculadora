package interfaces;

import interfaces.Observador;

public interface CoisaObservada {
    public void registrarObservador(Observador observador);
    
    public void avisar(Observador observador);
}