/*
 * Created by JFormDesigner on Fri Apr 23 18:40:50 CST 2021
 */

package view;

import control.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class Main extends JFrame {
    public static void main(String[] args) {
        Main main = new Main();
        main.setVisible(true);
    }
    public Main() {
        initComponents();
    }


    private void addActionPerformed(ActionEvent e) {
        // TODO add your code here
        Add add = new Add();
        add.setVisible(true);
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void findActionPerformed(ActionEvent e) {
        // TODO add your code here
        Select select = new Select();
        select.setVisible(true);
    }

    private void deleteActionPerformed(ActionEvent e) {
        // TODO add your code here
        Delete delete = new Delete();
        delete.setVisible(true);
    }

    private void button4ActionPerformed(ActionEvent e) {
        // TODO add your code here
        Modify modify = new Modify();
        modify.setVisible(true);
    }

    private void button5ActionPerformed(ActionEvent e) {
        // TODO add your code here
        Recommand rec = new Recommand();
        rec.setVisible(true);
    }

    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button3ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        add = new JButton();
        find = new JButton();
        delete = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        label1 = new JLabel();
        scrollPane1 = new JScrollPane();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- add ----
            add.setText("    \u589e\u52a0\u56fe\u4e66\u4fe1\u606f    ");
            add.addActionListener(e -> {
			button1ActionPerformed(e);
			addActionPerformed(e);
			addActionPerformed(e);
		});
            panel1.add(add);
            add.setBounds(new Rectangle(new Point(130, 105), add.getPreferredSize()));

            //---- find ----
            find.setText("    \u67e5\u770b\u9986\u5185\u85cf\u4e66    ");
            find.addActionListener(e -> {
			button2ActionPerformed(e);
			findActionPerformed(e);
			findActionPerformed(e);
		});
            panel1.add(find);
            find.setBounds(new Rectangle(new Point(130, 65), find.getPreferredSize()));

            //---- delete ----
            delete.setText("\u5220\u9664\u76f8\u5173\u56fe\u4e66\u4fe1\u606f");
            delete.addActionListener(e -> {
			button3ActionPerformed(e);
			deleteActionPerformed(e);
			deleteActionPerformed(e);
		});
            panel1.add(delete);
            delete.setBounds(new Rectangle(new Point(130, 145), delete.getPreferredSize()));

            //---- button4 ----
            button4.setText("\u4fee\u6539\u76f8\u5173\u56fe\u4e66\u4fe1\u606f");
            button4.addActionListener(e -> {
			button4ActionPerformed(e);
			button4ActionPerformed(e);
		});
            panel1.add(button4);
            button4.setBounds(new Rectangle(new Point(130, 185), button4.getPreferredSize()));

            //---- button5 ----
            button5.setText("\u597d\u4e66\u63a8\u8350");
            button5.addActionListener(e -> {
			button5ActionPerformed(e);
			button5ActionPerformed(e);
		});
            panel1.add(button5);
            button5.setBounds(new Rectangle(new Point(370, 110), button5.getPreferredSize()));

            //---- label1 ----
            label1.setText("\u56fe\u4e66\u9986\u7ba1\u7406\u7cfb\u7edf");
            panel1.add(label1);
            label1.setBounds(new Rectangle(new Point(190, 5), label1.getPreferredSize()));

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
        panel1.setBounds(0, 0, 565, 280);
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(new Rectangle(new Point(170, -20), scrollPane1.getPreferredSize()));

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
    private JButton add;
    private JButton find;
    private JButton delete;
    private JButton button4;
    private JButton button5;
    private JLabel label1;
    private JScrollPane scrollPane1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
