package panelRounded;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;

public class PanelRounded2 extends javax.swing.JPanel {

    public PanelRounded2() {
        initComponents();
        setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Menggunakan RoundRectangle2D untuk membuat semua empat sudut menjadi rounded
        RoundRectangle2D roundedRectangle = new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), 30, 30);

        // Set warna latar belakang dengan nilai alpha untuk transparansi
        g2.setColor(new Color(105, 105, 105, 0)); // Ganti nilai alpha sesuai kebutuhan

        // Isi panel dengan warna yang diinginkan
        g2.fill(roundedRectangle);

        super.paintComponent(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
