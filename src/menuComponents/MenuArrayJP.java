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

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NomeJTF = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        intJRB = new javax.swing.JRadioButton();
        floatJRB = new javax.swing.JRadioButton();
        charJRB = new javax.swing.JRadioButton();
        anyJRB = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setText("Nome");
        jPanel1.add(jLabel1);

        NomeJTF.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                NomeJTFatualizarVariavel(evt);
            }
        });
        jPanel1.add(NomeJTF);

        jPanel3.add(jPanel1);

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jLabel3.setText("Tipo");
        jPanel2.add(jLabel3);

        intJRB.setText("int");
        jPanel2.add(intJRB);

        floatJRB.setText("float");
        jPanel2.add(floatJRB);

        charJRB.setText("char");
        jPanel2.add(charJRB);

        anyJRB.setText("any");
        jPanel2.add(anyJRB);

        jPanel3.add(jPanel2);

        add(jPanel3);

        jLabel4.setText("Valor aleatório");
        jPanel4.add(jLabel4);

        jButton1.setText("Gerar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1gerarAleatorio(evt);
            }
        });
        jPanel4.add(jButton1);

        add(jPanel4);
    }// </editor-fold>//GEN-END:initComponents

    private void NomeJTFatualizarVariavel(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_NomeJTFatualizarVariavel
        if(array != null){
            array.alterarArray(NomeJTF.getText(), valores);
        }
    }//GEN-LAST:event_NomeJTFatualizarVariavel

    private void jButton1gerarAleatorio(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1gerarAleatorio

        valores = new String[array.getLinha()*array.getColuna()];
        
        for (int i = 0; i < valores.length; i++) {
            if(intJRB.isSelected()){
                valores[i] = (String.valueOf((int)(Math.random() * 200 ) - 100));
            }else if(floatJRB.isSelected()){
                valores[i] = (String.valueOf((float)(Math.random() * 200 ) - 100));
            }else if(charJRB.isSelected()){
                int max = 'z';
                int min = 'A';
                int unicode = (int)(Math.random() * (max-min)) + min;

                char valor = (char) unicode;
                valores[i] = (String.valueOf(valor));
            }
        }
        array.alterarArray(NomeJTF.getText(), valores);
    }//GEN-LAST:event_jButton1gerarAleatorio

    public void alterarMenu(ArrayJP array, String nome, String[] valores){
        this.array = array;
        NomeJTF.setText(nome);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NomeJTF;
    private javax.swing.JRadioButton anyJRB;
    private javax.swing.JRadioButton charJRB;
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
    // End of variables declaration//GEN-END:variables
}
