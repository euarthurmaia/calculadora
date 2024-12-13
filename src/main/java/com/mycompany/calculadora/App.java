package com.mycompany.calculadora;

import view.EstiloSimples;
import model.CalculadoraModel;
import interfaces.Controlador;
import interfaces.Model;
import interfaces.View;
import controller.ControladorTeclado;
import controller.ControladorMouse;

public class App {

    public static void main(String[] args) {
        Model model = new CalculadoraModel();
        View view = new EstiloSimples();
        Controlador controladorMouse = new ControladorMouse();
        Controlador controladorTeclado = new ControladorTeclado();
        model.addView(view);
        view.addControllers(controladorMouse, controladorTeclado);
    }
}