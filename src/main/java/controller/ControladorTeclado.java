package controller;

import model.CalculadoraModel;
import interfaces.Controlador;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ControladorTeclado extends KeyAdapter implements Controlador {

    private CalculadoraModel model;

    @Override
    public void addModel(CalculadoraModel m) {
        model = m;
    }

    @Override
    public void keyPressed(KeyEvent ev) {
        int n1 = KeyEvent.VK_1;
        int n2 = KeyEvent.VK_2;
        int n3 = KeyEvent.VK_3;
        int n4 = KeyEvent.VK_4;
        int n5 = KeyEvent.VK_5;
        int n6 = KeyEvent.VK_6;
        int n7 = KeyEvent.VK_7;
        int n8 = KeyEvent.VK_8;
        int n9 = KeyEvent.VK_9;
        int n0 = KeyEvent.VK_0;
        int num1 = KeyEvent.VK_NUMPAD1;
        int num2 = KeyEvent.VK_NUMPAD2;
        int num3 = KeyEvent.VK_NUMPAD3;
        int num4 = KeyEvent.VK_NUMPAD4;
        int num5 = KeyEvent.VK_NUMPAD5;
        int num6 = KeyEvent.VK_NUMPAD6;
        int num7 = KeyEvent.VK_NUMPAD7;
        int num8 = KeyEvent.VK_NUMPAD8;
        int num9 = KeyEvent.VK_NUMPAD9;
        int num0 = KeyEvent.VK_NUMPAD0;
        int opMenos = KeyEvent.VK_SUBTRACT;
        int opMais = KeyEvent.VK_ADD;
        int opDivisao = KeyEvent.VK_DIVIDE;
        int opMultiplicacao = KeyEvent.VK_MULTIPLY;
        int opIgual = KeyEvent.VK_ENTER;
        int opC = KeyEvent.VK_BACK_SPACE;
        int teclaCode = ev.getKeyCode();

        if (teclaCode == n0 || teclaCode == num0) {
            model.numeroDigitado("0");
        } else if (teclaCode == n1 || teclaCode == num1) {
            model.numeroDigitado("1");
        } else if (teclaCode == n2 || teclaCode == num2) {
            model.numeroDigitado("2");
        } else if (teclaCode == n3 || teclaCode == num3) {
            model.numeroDigitado("3");
        } else if (teclaCode == n4 || teclaCode == num4) {
            model.numeroDigitado("4");
        } else if (teclaCode == n5 || teclaCode == num5) {
            model.numeroDigitado("5");
        } else if (teclaCode == n6 || teclaCode == num6) {
            model.numeroDigitado("6");
        } else if (teclaCode == n7 || teclaCode == num7) {
            model.numeroDigitado("7");
        } else if (teclaCode == n8 || teclaCode == num8) {
            model.numeroDigitado("8");
        } else if (teclaCode == n9 || teclaCode == num9) {
            model.numeroDigitado("9");
        } else if (teclaCode == opMenos) {
            model.operadorDigitado("-");
            
        } else if (teclaCode == opMais) {
            model.operadorDigitado("+");
            
        } else if (teclaCode == opMultiplicacao) {
            model.operadorDigitado("*");
            
        } else if (teclaCode == opDivisao) {
            model.operadorDigitado("/");
            
        } else if (teclaCode == opIgual) {
            model.operadorDigitado("=");
            
        } else if (teclaCode == opC) {
            model.operadorDigitado("C");
        }
    }
}
