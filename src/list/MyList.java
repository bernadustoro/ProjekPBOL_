package list;


import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class MyList<E extends Object> extends JList<E> {
    private final DefaultListModel model;
    
    ListItem item;

    private Color selectedColor;
    
    public MyList(){
        model = new DefaultListModel();
        setModel(model);
        selectedColor = new Color(162, 155, 154);
        this.setBorder(null);
    }

    @Override
    public ListCellRenderer getCellRenderer(){
        return new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object o, int index, boolean selected, boolean focus) {
            item = new ListItem();
            item.setItem(o);
                item.setBackground(MyList.this.getBackground());
                item.setForeground(MyList.this.getForeground());
                item.setSelected(selected);
                if(selected){
                    item.setBackground(selectedColor);
                }
            return item;
            }
            
        };
        
    }
    
    
    public void addItem(Item item){
        model.addElement(item);
    }
    
    public void remove(int x){
        model.remove(x);
    }
    
    public String getText(int x){
        return item.getLb().getText();
    }
    
}