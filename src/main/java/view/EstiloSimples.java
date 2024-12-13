package view;

import model.CalculadoraModel;
import interfaces.CoisaObservada;
import interfaces.Controlador;
import interfaces.Observador;
import interfaces.View;
import controller.ControladorTeclado;
import controller.ControladorMouse;

public class EstiloSimples extends javax.swing.JFrame implements Observador, View {

    private ControladorMouse controladorMouse;
    private ControladorTeclado controladorTeclado;
    private CalculadoraModel model;

    public EstiloSimples() {
        initComponents();
        this.setVisible(true);
        setFocusable(true);
    }

    @Override
    public void observar(CoisaObservada coisa) {
        coisa.registrarObservador(this);
    }

    @Override
    public void receberAviso(String dado, String sinal, float valorAnterior) {
        if (sinal == null) {
            Visor.setText(dado);
        } else if (sinal.equals("C")) {
            Visor2.setText("");
            Visor.setText(dado);
        } else if (sinal.equals("=")) {
            Visor2.setText("");
            Visor.setText(dado);
        } else {
            Visor2.setText(valorAnterior + " " + sinal);
            Visor.setText(dado);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelVisor = new javax.swing.JPanel();
        Visor = new javax.swing.JLabel();
        Visor2 = new javax.swing.JLabel();
        jPanelNumeros = new javax.swing.JPanel();
        btnZero = new javax.swing.JButton();
        btnUm = new javax.swing.JButton();
        btnDois = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnQuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnSete = new javax.swing.JButton();
        btnOito = new javax.swing.JButton();
        btnNove = new javax.swing.JButton();
        jPanelOperadores = new javax.swing.JPanel();
        btnIgual = new javax.swing.JButton();
        btnAdicao = new javax.swing.JButton();
        btnSubtracao = new javax.swing.JButton();
        btnMultiplicacao = new javax.swing.JButton();
        btnDivisao = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnNulo1 = new javax.swing.JButton();
        btnNulo2 = new javax.swing.JButton();
        btnNulo3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Maia");
        setResizable(false);

        jPanelVisor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        Visor.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N

        Visor2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanelVisorLayout = new javax.swing.GroupLayout(jPanelVisor);
        jPanelVisor.setLayout(jPanelVisorLayout);
        jPanelVisorLayout.setHorizontalGroup(
            jPanelVisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVisorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelVisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Visor, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                    .addComponent(Visor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        jPanelVisorLayout.setVerticalGroup(
            jPanelVisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVisorLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Visor2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Visor, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        btnZero.setBackground(new java.awt.Color(204, 204, 204));
        btnZero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnZero.setForeground(new java.awt.Color(0, 0, 0));
        btnZero.setText("0");
        btnZero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnZero.setFocusable(false);
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });

        btnUm.setBackground(new java.awt.Color(204, 204, 204));
        btnUm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUm.setForeground(new java.awt.Color(0, 0, 0));
        btnUm.setText("1");
        btnUm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnUm.setFocusable(false);
        btnUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUmActionPerformed(evt);
            }
        });

        btnDois.setBackground(new java.awt.Color(204, 204, 204));
        btnDois.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDois.setForeground(new java.awt.Color(0, 0, 0));
        btnDois.setText("2");
        btnDois.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnDois.setFocusable(false);
        btnDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoisActionPerformed(evt);
            }
        });

        btnTres.setBackground(new java.awt.Color(204, 204, 204));
        btnTres.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTres.setForeground(new java.awt.Color(0, 0, 0));
        btnTres.setText("3");
        btnTres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnTres.setFocusable(false);
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });

        btnQuatro.setBackground(new java.awt.Color(204, 204, 204));
        btnQuatro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnQuatro.setForeground(new java.awt.Color(0, 0, 0));
        btnQuatro.setText("4");
        btnQuatro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnQuatro.setFocusable(false);
        btnQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuatroActionPerformed(evt);
            }
        });

        btnCinco.setBackground(new java.awt.Color(204, 204, 204));
        btnCinco.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCinco.setForeground(new java.awt.Color(0, 0, 0));
        btnCinco.setText("5");
        btnCinco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnCinco.setFocusable(false);
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });

        btnSeis.setBackground(new java.awt.Color(204, 204, 204));
        btnSeis.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSeis.setForeground(new java.awt.Color(0, 0, 0));
        btnSeis.setText("6");
        btnSeis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnSeis.setFocusable(false);
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });

        btnSete.setBackground(new java.awt.Color(204, 204, 204));
        btnSete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSete.setForeground(new java.awt.Color(0, 0, 0));
        btnSete.setText("7");
        btnSete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnSete.setFocusable(false);
        btnSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeteActionPerformed(evt);
            }
        });

        btnOito.setBackground(new java.awt.Color(204, 204, 204));
        btnOito.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnOito.setForeground(new java.awt.Color(0, 0, 0));
        btnOito.setText("8");
        btnOito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnOito.setFocusable(false);
        btnOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOitoActionPerformed(evt);
            }
        });

        btnNove.setBackground(new java.awt.Color(204, 204, 204));
        btnNove.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNove.setForeground(new java.awt.Color(0, 0, 0));
        btnNove.setText("9");
        btnNove.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnNove.setFocusable(false);
        btnNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelNumerosLayout = new javax.swing.GroupLayout(jPanelNumeros);
        jPanelNumeros.setLayout(jPanelNumerosLayout);
        jPanelNumerosLayout.setHorizontalGroup(
            jPanelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNumerosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNumerosLayout.createSequentialGroup()
                        .addComponent(btnOito, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNove, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelNumerosLayout.createSequentialGroup()
                        .addGroup(jPanelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDois, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanelNumerosLayout.setVerticalGroup(
            jPanelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNumerosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOito, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNove, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDois, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        btnIgual.setBackground(new java.awt.Color(102, 102, 102));
        btnIgual.setFont(new java.awt.Font("Sitka Text", 1, 48)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(255, 255, 255));
        btnIgual.setText("=");
        btnIgual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnIgual.setFocusable(false);
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnAdicao.setBackground(new java.awt.Color(102, 102, 102));
        btnAdicao.setFont(new java.awt.Font("Sitka Small", 1, 36)); // NOI18N
        btnAdicao.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicao.setText("+");
        btnAdicao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnAdicao.setFocusable(false);
        btnAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicaoActionPerformed(evt);
            }
        });

        btnSubtracao.setBackground(new java.awt.Color(102, 102, 102));
        btnSubtracao.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        btnSubtracao.setForeground(new java.awt.Color(255, 255, 255));
        btnSubtracao.setText("-");
        btnSubtracao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnSubtracao.setFocusable(false);
        btnSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtracaoActionPerformed(evt);
            }
        });

        btnMultiplicacao.setBackground(new java.awt.Color(102, 102, 102));
        btnMultiplicacao.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        btnMultiplicacao.setForeground(new java.awt.Color(255, 255, 255));
        btnMultiplicacao.setText("x");
        btnMultiplicacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnMultiplicacao.setFocusable(false);
        btnMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacaoActionPerformed(evt);
            }
        });

        btnDivisao.setBackground(new java.awt.Color(102, 102, 102));
        btnDivisao.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        btnDivisao.setForeground(new java.awt.Color(255, 255, 255));
        btnDivisao.setText("/");
        btnDivisao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnDivisao.setFocusable(false);
        btnDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisaoActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(255, 255, 0));
        btnClear.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        btnClear.setForeground(new java.awt.Color(0, 0, 0));
        btnClear.setText("C");
        btnClear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnClear.setFocusable(false);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnNulo1.setBackground(new java.awt.Color(102, 102, 102));
        btnNulo1.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        btnNulo1.setForeground(new java.awt.Color(255, 255, 255));
        btnNulo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnNulo1.setFocusable(false);
        btnNulo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNulo1ActionPerformed(evt);
            }
        });

        btnNulo2.setBackground(new java.awt.Color(102, 102, 102));
        btnNulo2.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        btnNulo2.setForeground(new java.awt.Color(255, 255, 255));
        btnNulo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnNulo2.setFocusable(false);
        btnNulo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNulo2ActionPerformed(evt);
            }
        });

        btnNulo3.setBackground(new java.awt.Color(102, 102, 102));
        btnNulo3.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        btnNulo3.setForeground(new java.awt.Color(255, 255, 255));
        btnNulo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnNulo3.setFocusable(false);
        btnNulo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNulo3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOperadoresLayout = new javax.swing.GroupLayout(jPanelOperadores);
        jPanelOperadores.setLayout(jPanelOperadoresLayout);
        jPanelOperadoresLayout.setHorizontalGroup(
            jPanelOperadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOperadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOperadoresLayout.createSequentialGroup()
                        .addComponent(btnNulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOperadoresLayout.createSequentialGroup()
                        .addComponent(btnNulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOperadoresLayout.createSequentialGroup()
                        .addComponent(btnNulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOperadoresLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelOperadoresLayout.setVerticalGroup(
            jPanelOperadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOperadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOperadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanelOperadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelOperadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelOperadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIgual)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelOperadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanelVisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelNumeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelOperadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
        controladorMouse.receberComando("0");
    }//GEN-LAST:event_btnZeroActionPerformed

    private void btnUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUmActionPerformed
        controladorMouse.receberComando("1");
    }//GEN-LAST:event_btnUmActionPerformed

    private void btnDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoisActionPerformed
        controladorMouse.receberComando("2");
    }//GEN-LAST:event_btnDoisActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        controladorMouse.receberComando("3");
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuatroActionPerformed
        controladorMouse.receberComando("4");
    }//GEN-LAST:event_btnQuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        controladorMouse.receberComando("5");
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        controladorMouse.receberComando("6");
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeteActionPerformed
        controladorMouse.receberComando("7");
    }//GEN-LAST:event_btnSeteActionPerformed

    private void btnOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOitoActionPerformed
        controladorMouse.receberComando("8");
    }//GEN-LAST:event_btnOitoActionPerformed

    private void btnNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoveActionPerformed
        controladorMouse.receberComando("9");
    }//GEN-LAST:event_btnNoveActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisaoActionPerformed
        controladorMouse.receberComando("/");
    }//GEN-LAST:event_btnDivisaoActionPerformed

    private void btnMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacaoActionPerformed
        controladorMouse.receberComando("*");
    }//GEN-LAST:event_btnMultiplicacaoActionPerformed

    private void btnSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtracaoActionPerformed
        controladorMouse.receberComando("-");
    }//GEN-LAST:event_btnSubtracaoActionPerformed

    private void btnAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicaoActionPerformed
        controladorMouse.receberComando("+");
    }//GEN-LAST:event_btnAdicaoActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        controladorMouse.receberComando("=");
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        controladorMouse.receberComando("C");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnNulo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNulo1ActionPerformed
        // Enfeite, rs
    }//GEN-LAST:event_btnNulo1ActionPerformed

    private void btnNulo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNulo2ActionPerformed
        // Enfeite, rs
    }//GEN-LAST:event_btnNulo2ActionPerformed

    private void btnNulo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNulo3ActionPerformed
        // Enfeite, rs
    }//GEN-LAST:event_btnNulo3ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstiloSimples().setVisible(true);
            }
        });
    }

    public void addModel(CalculadoraModel m) {
        model = m;
        if (controladorMouse != null) {
            if (controladorMouse != null) {
                controladorMouse.addModel(model);
            }
        }
        if (controladorTeclado != null) {
            controladorTeclado.addModel(model);
        }
    }

    @Override
    public void addControllers(Controlador mouseController, Controlador tecladoController) {
        controladorMouse = (ControladorMouse) mouseController;
        controladorTeclado = (ControladorTeclado) tecladoController;

        if (model != null) {
            controladorMouse.addModel(model);
            controladorTeclado.addModel(model);
            this.addKeyListener(controladorTeclado);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Visor;
    private javax.swing.JLabel Visor2;
    private javax.swing.JButton btnAdicao;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnDois;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMultiplicacao;
    private javax.swing.JButton btnNove;
    private javax.swing.JButton btnNulo1;
    private javax.swing.JButton btnNulo2;
    private javax.swing.JButton btnNulo3;
    private javax.swing.JButton btnOito;
    private javax.swing.JButton btnQuatro;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSete;
    private javax.swing.JButton btnSubtracao;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUm;
    private javax.swing.JButton btnZero;
    private javax.swing.JPanel jPanelNumeros;
    private javax.swing.JPanel jPanelOperadores;
    private javax.swing.JPanel jPanelVisor;
    // End of variables declaration//GEN-END:variables
}
