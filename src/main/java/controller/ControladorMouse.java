package controller;

import model.CalculadoraModel;
import interfaces.Controlador;

public class ControladorMouse implements Controlador {

    private CalculadoraModel model;

    @Override
    public void addModel(CalculadoraModel m) {
        model = m;
    }

    public void receberComando(String comando) {
        if (comando.equalsIgnoreCase("+")) {
            model.operadorDigitado("+");
        } else if (comando.equalsIgnoreCase("-")) {
            model.operadorDigitado("-");
        } else if (comando.equalsIgnoreCase("*")) {
            model.operadorDigitado("*");
        } else if (comando.equalsIgnoreCase("/")) {
            model.operadorDigitado("/");
        } else if (comando.equalsIgnoreCase("=")) {
            model.operadorDigitado("=");
        } else if (comando.equalsIgnoreCase("C")) {
            model.operadorDigitado("C");
        } else {
            model.numeroDigitado(comando);
        }
    }
}
