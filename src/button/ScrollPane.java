/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package button;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.Rectangle;
import java.util.Objects;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneLayout;

/**
 *
 * @author Raven
 */
public class ScrollPane extends JScrollPane {

    public ScrollPane() {
        getVerticalScrollBar().setUI(new ModernScrollBarUI());
        getHorizontalScrollBar().setUI(new ModernScrollBarUI());
        setLayout(new ScrollLayout());
    }

    @Override
    public boolean isOptimizedDrawingEnabled() {
        return false;
    }

   

    private class ScrollLayout extends ScrollPaneLayout {

        @Override
        public void layoutContainer(Container parent) {
            super.layoutContainer(parent);
            if (parent instanceof JScrollPane) {
                JScrollPane scroll = (JScrollPane) parent;
                Rectangle rec = scroll.getViewport().getBounds();
                Insets insets = parent.getInsets();
                int rhHeight = 0;
                if (scroll.getColumnHeader() != null) {
                    Rectangle rh = scroll.getColumnHeader().getBounds();
                    rhHeight = rh.height;
                }
                rec.width = scroll.getBounds().width - (insets.left + insets.right);
                rec.height = scroll.getBounds().height - (insets.top + insets.bottom) - rhHeight;
                if (Objects.nonNull(viewport)) {
                    viewport.setBounds(rec);
                }
                if (!Objects.isNull(hsb)) {
                    Rectangle hrc = hsb.getBounds();
                    hrc.width = rec.width;
                    hsb.setBounds(hrc);
                }
            }
        }
    }
}

