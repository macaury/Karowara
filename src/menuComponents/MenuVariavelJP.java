/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package menuComponents;

import components.VariavelJP;

/**
 *
 * @author GABRIEL
 */
public class MenuVariavelJP extends javax.swing.JPanel {
    private VariavelJP var;
    /**
     * Creates new form MenuVariavelJP
     */
    public MenuVariavelJP() {
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NomeJCB = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        ValorJTF = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        intJRB = new javax.swing.JRadioButton();
        floatJRB = new javax.swing.JRadioButton();
        charJRB = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(244, 242, 242));
        setLayout(new java.awt.GridLayout(1, 2));

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setText("Nome");
        jPanel1.add(jLabel1);

        NomeJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A ", "B", "C", "D", "E", "F ", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        NomeJCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mudarNomeVariavel(evt);
            }
        });
        jPanel1.add(NomeJCB);

        jLabel2.setText("Valor");
        jPanel1.add(jLabel2);

        ValorJTF.setPreferredSize(new java.awt.Dimension(92, 22));
        ValorJTF.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                atualizarVariavel(evt);
            }
        });
        jPanel1.add(ValorJTF);

        jPanel3.add(jPanel1);

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jLabel3.setText("Tipo");
        jPanel2.add(jLabel3);

        tipo.add(intJRB);
        intJRB.setText("int");
        jPanel2.add(intJRB);

        tipo.add(floatJRB);
        floatJRB.setText("float");
        jPanel2.add(floatJRB);

        tipo.add(charJRB);
        charJRB.setText("char");
        jPanel2.add(charJRB);

        jPanel3.add(jPanel2);

        add(jPanel3);

        jLabel4.setText("Valor aleatório");
        jPanel4.add(jLabel4);

        jButton1.setText("Gerar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                gerarAleatorio(evt);
            }
        });
        jPanel4.add(jButton1);

        add(jPanel4);
    }// </editor-fold>//GEN-END:initComponents

    private void atualizarVariavel(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_atualizarVariavel
        if(var != null){
            var.alterarVariavel(NomeJCB.getSelectedItem().toString(), ValorJTF.getText());
        }
    }//GEN-LAST:event_atualizarVariavel

    private void gerarAleatorio(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerarAleatorio

        if(intJRB.isSelected()){
            ValorJTF.setText(String.valueOf((int)(Math.random() * 200 ) - 100));
        }else if(floatJRB.isSelected()){
            ValorJTF.setText((String.valueOf((float)(Math.random() * 200 ) - 100)).substring(0, 5));
        }else if(charJRB.isSelected()){
            int max = 'z';
            int min = 'A';
            int unicode = (int)(Math.random() * (max-min)) + min;
            
            char valor = (char) unicode;
            ValorJTF.setText(String.valueOf(valor));
        }
    }//GEN-LAST:event_gerarAleatorio

    private void mudarNomeVariavel(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mudarNomeVariavel
        var.alterarNome(NomeJCB.getSelectedItem().toString());
    }//GEN-LAST:event_mudarNomeVariavel
    
    public void alterarMenu(VariavelJP nova, String nome, String valor) {
        var = nova;
        NomeJCB.setSelectedItem(nome);
        ValorJTF.setText(valor); 
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> NomeJCB;
    private javax.swing.JTextField ValorJTF;
    private javax.swing.JRadioButton charJRB;
    private javax.swing.JRadioButton floatJRB;
    private javax.swing.JRadioButton intJRB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.ButtonGroup tipo;
    // End of variables declaration//GEN-END:variables

    
    
}
