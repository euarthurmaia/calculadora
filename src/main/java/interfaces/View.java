package interfaces;

import model.CalculadoraModel;

public interface View {
    void addModel(CalculadoraModel model);
    public void addControllers(Controlador controladorMouse, Controlador controladorTeclado);
}