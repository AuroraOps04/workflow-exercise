/*
 * Created by JFormDesigner on Fri Apr 23 18:53:16 CST 2021
 */

package control;

import Bag.Book;
import DB.Conn;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class Select extends JFrame {
    public Select() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        Conn conn = new Conn();
        Book book = new Book();
        conn.sel(book);

    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        label2 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- label1 ----
            label1.setText("\u56fe\u4e66\u9986\u7ba1\u7406\u7cfb\u7edf");
            panel1.add(label1);
            label1.setBounds(new Rectangle(new Point(195, 35), label1.getPreferredSize()));

            //---- button1 ----
            button1.setText("\u786e\u8ba4");
            button1.addActionListener(e -> button1ActionPerformed(e));
            panel1.add(button1);
            button1.setBounds(new Rectangle(new Point(135, 180), button1.getPreferredSize()));

            //---- button2 ----
            button2.setText("\u53d6\u6d88");
            panel1.add(button2);
            button2.setBounds(new Rectangle(new Point(255, 180), button2.getPreferredSize()));

            //---- label2 ----
            label2.setText("\u662f\u5426\u67e5\u8be2\u56fe\u4e66\u9986\u73b0\u6709\u85cf\u4e66\u60c5\u51b5\uff1f");
            panel1.add(label2);
            label2.setBounds(new Rectangle(new Point(150, 95), label2.getPreferredSize()));

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel1.getComponentCount(); i++) {
                    Rectangle bounds = panel1.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel1.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel1.setMinimumSize(preferredSize);
                panel1.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel1);
        panel1.setBounds(0, -30, 500, 250);

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
