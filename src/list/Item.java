/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list;

import javax.swing.Icon;

/**
 *
 * @author macintoshhd
 */
public class Item {

    private String text;

    private Icon icon;

    public Item() {

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public Item(String text, Icon icon) {
        this.text = text;
        this.icon = icon;
    }

    public Item(String text) {
        this.text = text;
    }

}
