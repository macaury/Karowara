/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package components;

import java.awt.Component;

/**
 *
 * @author GABRIEL
 */
public class ValorJP extends Elemento {


    public ValorJP(String nome) {
        super();
        initComponents();
        ValorJL.setText(nome);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ValorJL = new javax.swing.JLabel();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                recebeValorExterno(evt);
            }
        });
        setLayout(new java.awt.BorderLayout());

        ValorJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(ValorJL, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    private void recebeValorExterno(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recebeValorExterno
        for (Component componente : this.getParent().getComponents()) {
            if(isOver(this,componente)){
                if(componente instanceof VariavelJP){
                    VariavelJP var = (VariavelJP) componente;
                    var.alterarValor(ValorJL.getText());
                    this.getParent().remove(this);
                    revalidate();
                }else if(componente instanceof ArrayJP){
                    ArrayJP array = (ArrayJP) componente;
                    array.alterarValor(ValorJL.getText(), this.getLocation());
                    this.getParent().remove(this);
                    revalidate();
                }
            }
        }
        
    }//GEN-LAST:event_recebeValorExterno

    private boolean isOver(Component a, Component b){
        if(a.getX() >= b.getLocation().getX() && a.getX() < b.getWidth()+b.getLocation().getX()){
            if(a.getY() >= b.getLocation().getY() && a.getY() < b.getHeight()+b.getLocation().getY()){
                return true;
            }
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ValorJL;
    // End of variables declaration//GEN-END:variables
}
