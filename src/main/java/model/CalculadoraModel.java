package model;

import view.EstiloSimples;
import interfaces.CoisaObservada;
import interfaces.Model;
import interfaces.Observador;
import interfaces.View;
import java.util.ArrayList;

public class CalculadoraModel implements CoisaObservada, Model {
    private ArrayList<Observador> views;
    private String dado = "0";
    private String sinal;
    private boolean sinalAtivo;
    private float valorAnterior;
    private float resultado;

    public CalculadoraModel() {
        views = new ArrayList<Observador>();
    }

    public void numeroDigitado(String numero) {
        sinalAtivo = false;

        if (dado != null) {
            if (!(dado.equals("0") && numero.equals("0"))) {
                if (dado.equals("0") && !numero.equals("0")) {
                    dado = numero;
                } else {
                    dado = dado + numero;
                }
            }
        } else {
            dado = numero;
        }

        for (Observador o : views) {
            avisar(o);
        }
    }

    public void operadorDigitado(String operador) {
        if (operador.equals("C")) {
            dado = String.valueOf("0");
        } else if (dado.equals("")) {
            dado = String.valueOf(valorAnterior);
        } else if (sinal != null) {
            if (sinal.equals("+")) {
                if (!sinalAtivo) {
                    resultado = valorAnterior + Float.parseFloat(dado);
                }
                dado = String.valueOf(resultado);
            } else if (sinal.equals("-")) {
                if (!sinalAtivo) {
                    resultado = valorAnterior - Float.parseFloat(dado);
                }
                dado = String.valueOf(resultado);
            } else if (sinal.equals("*")) {
                if (!sinalAtivo) {
                    resultado = valorAnterior * Float.parseFloat(dado);
                }
                dado = String.valueOf(resultado);
            } else if (sinal.equals("/")) {
                if (!sinalAtivo) {
                    resultado = valorAnterior / Float.parseFloat(dado);
                }
                dado = String.valueOf(resultado);
            }
        }

        valorAnterior = Float.parseFloat(dado);
        sinal = operador;
        sinalAtivo = true;

        for (Observador o : views) {
            avisar(o);
        }

        dado = "";
    }

    @Override
    public void registrarObservador(Observador observador
    ) {
        /*
        O método recebe uma instancia do tipo Observador.
        Se a instancia já foi registrada, fazer nada.
         */
        if (views.contains(observador)) {
            return;
        }
        views.add(observador);
    }

    @Override
    public void avisar(Observador observador
    ) {
        observador.receberAviso(dado, sinal, valorAnterior);
    }

    @Override
    public void addView(View view) {
        registrarObservador((Observador) view);
        view.addModel(this);
    }
}
