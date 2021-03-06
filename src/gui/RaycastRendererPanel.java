/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import volvis.RaycastRenderer;

/**
 *
 * @author michel
 */
public class RaycastRendererPanel extends javax.swing.JPanel {

    RaycastRenderer renderer;
    TransferFunctionEditor tfEditor = null;
    TransferFunction2DEditor tfEditor2D = null;
    
    /**
     * Creates new form RaycastRendererPanel
     */
    public RaycastRendererPanel(RaycastRenderer renderer) {
        initComponents();
        this.renderer = renderer;
    }

    public void setSpeedLabel(String text) {
        renderingSpeedLabel.setText(text);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        renderingSpeedLabel = new javax.swing.JLabel();
        slicerButton = new javax.swing.JRadioButton();
        mipButton = new javax.swing.JRadioButton();
        compositingButton = new javax.swing.JRadioButton();
        tf2dButton = new javax.swing.JRadioButton();
        shadingCheckbox = new javax.swing.JCheckBox();
        shadingCheckbox1 = new javax.swing.JCheckBox();
        shadingCheckbox2 = new javax.swing.JCheckBox();
        shadingCheckbox3 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("Rendering time (ms):");

        renderingSpeedLabel.setText("jLabel2");

        buttonGroup1.add(slicerButton);
        slicerButton.setSelected(true);
        slicerButton.setText("Slicer");
        slicerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slicerButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(mipButton);
        mipButton.setText("MIP");
        mipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mipButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(compositingButton);
        compositingButton.setText("Compositing（F2B）");
        compositingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compositingButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(tf2dButton);
        tf2dButton.setText("2D Transfer function");
        tf2dButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf2dButtonActionPerformed(evt);
            }
        });

        shadingCheckbox.setText("Volume shading");
        shadingCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shadingCheckboxActionPerformed(evt);
            }
        });

        shadingCheckbox1.setText("Diffuse");
        shadingCheckbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shadingCheckbox1ActionPerformed(evt);
            }
        });

        shadingCheckbox2.setText("Ambient");
        shadingCheckbox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shadingCheckbox2ActionPerformed(evt);
            }
        });

        shadingCheckbox3.setText("Specular");
        shadingCheckbox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shadingCheckbox3ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Sample Step");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(compositingButton, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf2dButton, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mipButton, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(slicerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(shadingCheckbox, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(shadingCheckbox2)
                        .addGap(18, 18, 18)
                        .addComponent(shadingCheckbox1)
                        .addGap(18, 18, 18)
                        .addComponent(shadingCheckbox3))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(renderingSpeedLabel)
                .addContainerGap(199, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(renderingSpeedLabel))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(slicerButton)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mipButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(compositingButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf2dButton)
                .addGap(23, 23, 23)
                .addComponent(shadingCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shadingCheckbox3)
                    .addComponent(shadingCheckbox1)
                    .addComponent(shadingCheckbox2))
                .addContainerGap(106, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mipButtonActionPerformed
        renderer.setMIPMode();
    }//GEN-LAST:event_mipButtonActionPerformed

    private void slicerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slicerButtonActionPerformed
        renderer.setSlicerMode();
    }//GEN-LAST:event_slicerButtonActionPerformed

    private void compositingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compositingButtonActionPerformed
        renderer.setCompositingMode();
    }//GEN-LAST:event_compositingButtonActionPerformed

    private void tf2dButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf2dButtonActionPerformed
        renderer.setTF2DMode();
    }//GEN-LAST:event_tf2dButtonActionPerformed

    private void shadingCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shadingCheckboxActionPerformed
        renderer.setShadingMode(shadingCheckbox.isSelected());
    }//GEN-LAST:event_shadingCheckboxActionPerformed

    private void shadingCheckbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shadingCheckbox1ActionPerformed
        renderer.setDifMode(shadingCheckbox1.isSelected());        // TODO add your handling code here:
    }//GEN-LAST:event_shadingCheckbox1ActionPerformed

    private void shadingCheckbox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shadingCheckbox2ActionPerformed
        renderer.setAmbMode(shadingCheckbox2.isSelected());        // TODO add your handling code here:
    }//GEN-LAST:event_shadingCheckbox2ActionPerformed

    private void shadingCheckbox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shadingCheckbox3ActionPerformed
        renderer.setSpecMode(shadingCheckbox3.isSelected());  // TODO add your handling code here:
    }//GEN-LAST:event_shadingCheckbox3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
   double value = Double.parseDouble(jTextField1.getText());
            if (value < 0) {
                value = 0;         
            } 
         renderer.setsampleStep(value);// TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

//    private javax.swing.JCheckBox AmbCheckbox;
//    private javax.swing.JCheckBox DifCheckbox;
//    private javax.swing.JCheckBox SpecCheckbox;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton compositingButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton mipButton;
    private javax.swing.JLabel renderingSpeedLabel;
    private javax.swing.JCheckBox shadingCheckbox;
    private javax.swing.JCheckBox shadingCheckbox1;
    private javax.swing.JCheckBox shadingCheckbox2;
    private javax.swing.JCheckBox shadingCheckbox3;
    private javax.swing.JRadioButton slicerButton;
    private javax.swing.JRadioButton tf2dButton;
    // End of variables declaration//GEN-END:variables
}
