/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package menuComponents;

import components.ArrayJP;

/**
 *
 * @author GABRIEL
 */
public class MenuArrayJP extends javax.swing.JPanel {
    ArrayJP array;
    String[] valores;
    
    public MenuArrayJP() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipo = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jPanel1 = new javax.swing.JPanel();
        NomeJCB = new javax.swing.JComboBox<>();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        intJRB = new javax.swing.JRadioButton();
        floatJRB = new javax.swing.JRadioButton();
        charJRB = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jButton1 = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 30)); // NOI18N
        jLabel1.setText("Nome");
        jPanel3.add(jLabel1);
        jPanel3.add(filler1);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        NomeJCB.setFont(new java.awt.Font("Helvetica Neue", 0, 30)); // NOI18N
        NomeJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A ", "B", "C", "D", "E", "F ", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        NomeJCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mudarNomeArray(evt);
            }
        });
        jPanel1.add(NomeJCB);
        jPanel1.add(filler2);

        jPanel3.add(jPanel1);

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 30)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tipo");
        jPanel2.add(jLabel3);

        tipo.add(intJRB);
        intJRB.setFont(new java.awt.Font("Helvetica Neue", 1, 30)); // NOI18N
        intJRB.setText("int");
        intJRB.setAlignmentX(0.5F);
        intJRB.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jPanel2.add(intJRB);

        tipo.add(floatJRB);
        floatJRB.setFont(new java.awt.Font("Helvetica Neue", 1, 30)); // NOI18N
        floatJRB.setText("float");
        floatJRB.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jPanel2.add(floatJRB);

        tipo.add(charJRB);
        charJRB.setFont(new java.awt.Font("Helvetica Neue", 1, 30)); // NOI18N
        charJRB.setText("char");
        charJRB.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jPanel2.add(charJRB);

        jPanel3.add(jPanel2);

        add(jPanel3);

        jPanel4.setMinimumSize(new java.awt.Dimension(250, 62));
        jPanel4.setPreferredSize(new java.awt.Dimension(130, 33));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 25)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Valor aleatório");
        jPanel4.add(jLabel4);
        jPanel4.add(filler3);

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 25)); // NOI18N
        jButton1.setText("Gerar");
        jButton1.setMargin(new java.awt.Insets(10, 20, 10, 20));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1gerarAleatorio(evt);
            }
        });
        jPanel4.add(jButton1);

        add(jPanel4);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1gerarAleatorio(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1gerarAleatorio

        valores = new String[array.getLinha()*array.getColuna()];
        
        for (int i = 0; i < valores.length; i++) {
            if(intJRB.isSelected()){
                valores[i] = (String.valueOf((int)(Math.random() * 200 ) - 100));
            }else if(floatJRB.isSelected()){
                valores[i] = (String.valueOf((float)(Math.random() * 200 ) - 100));
                valores[i] = valores[i].substring(0, 5);
            }else if(charJRB.isSelected()){
                int max = 'z';
                int min = 'A';
                int unicode = (int)(Math.random() * (max-min)) + min;

                char valor = (char) unicode;
                valores[i] = (String.valueOf(valor));
            }
        }
        array.alterarArray(NomeJCB.getSelectedItem().toString(), valores);
    }//GEN-LAST:event_jButton1gerarAleatorio

    private void mudarNomeArray(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mudarNomeArray
        array.alterarNome(NomeJCB.getSelectedItem().toString());
    }//GEN-LAST:event_mudarNomeArray

    public void alterarMenu(ArrayJP array, String nome, String[] valores){
        this.array = array;
        NomeJCB.setSelectedItem(nome);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> NomeJCB;
    private javax.swing.JRadioButton charJRB;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JRadioButton floatJRB;
    private javax.swing.JRadioButton intJRB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.ButtonGroup tipo;
    // End of variables declaration//GEN-END:variables
}
