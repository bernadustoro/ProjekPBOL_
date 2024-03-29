package component;

import java.awt.Cursor;
import projekpbol.PlayList;

public class MenuBar extends javax.swing.JPanel {

    private boolean isClicked = false;
    private PlayList parent;

    public MenuBar() {
        initComponents();
        exitButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitButton = new button.MyButton();
        menuButton = new button.MyButton();

        setBackground(new java.awt.Color(0, 0, 0));

        exitButton.setBorder(null);
        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close.png"))); // NOI18N
        exitButton.setBorderColor(new java.awt.Color(0, 0, 0));
        exitButton.setColor(new java.awt.Color(0, 0, 0));
        exitButton.setRadius(500);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        menuButton.setBackground(new java.awt.Color(0, 0, 0));
        menuButton.setBorder(null);
        menuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu.png"))); // NOI18N
        menuButton.setBorderColor(new java.awt.Color(0, 0, 0));
        menuButton.setColor(new java.awt.Color(0, 0, 0));
        menuButton.setColorOver(new java.awt.Color(0, 0, 0));
        menuButton.setRadius(100);
        menuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuButtonMouseClicked(evt);
            }
        });
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 715, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(menuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        if (!isClicked) {
            MenuItem item = new MenuItem();
            item.setVisible(true);
            item.setWindow(parent);
        } else {
            MenuItem item = new MenuItem();
            item.setVisible(false);
            item.setWindow(parent);
        }
        isClicked = !isClicked;
    }//GEN-LAST:event_menuButtonActionPerformed

    private void menuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuButtonMouseClicked

    public void setWindow(PlayList parent) {
        this.parent = parent;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.MyButton exitButton;
    private button.MyButton menuButton;
    // End of variables declaration//GEN-END:variables
}
