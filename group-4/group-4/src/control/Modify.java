/*
 * Created by JFormDesigner on Mon Apr 26 01:14:26 CST 2021
 */

package control;

import Bag.Book;
import DB.Conn;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class Modify extends JFrame {
    public Modify() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) throws SQLException {
        // TODO add your code here
        Conn conn = new Conn();
        Book book  = new Book();
        String a = book.setId(textField1.getText());
        String b =book.setName(textField2.getText());
        if (a==null){
            AddFail fail  = new AddFail();
            fail.setVisible(true);
        }
        if(conn.modify(book)==1)//调用数据库插入函数 插入成功提示
        {
            AddSuccess success  = new AddSuccess();
            success.setVisible(true);
        }
        else
        {
            AddFail fail  = new AddFail();
            fail.setVisible(true);
        }
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- label1 ----
            label1.setText("\u56fe\u4e66\u9986\u7ba1\u7406\u7cfb\u7edf");
            panel1.add(label1);
            label1.setBounds(new Rectangle(new Point(190, 35), label1.getPreferredSize()));

            //---- label2 ----
            label2.setText("\u8bf7\u8f93\u5165\u9700\u8981\u4fee\u6539\u7684\u4e66\u53f7:");
            panel1.add(label2);
            label2.setBounds(55, 100, 160, label2.getPreferredSize().height);

            //---- label3 ----
            label3.setText("\u8bf7\u8f93\u5165\u4fee\u6539\u540e\u7684\u4e66\u540d:");
            panel1.add(label3);
            label3.setBounds(60, 135, 160, 17);
            panel1.add(textField1);
            textField1.setBounds(190, 90, 140, textField1.getPreferredSize().height);
            panel1.add(textField2);
            textField2.setBounds(190, 130, 140, 25);

            //---- button1 ----
            button1.setText("\u786e\u5b9a");
            button1.addActionListener(e -> {
                try {
                    button1ActionPerformed(e);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            });
            panel1.add(button1);
            button1.setBounds(new Rectangle(new Point(75, 195), button1.getPreferredSize()));

            //---- button2 ----
            button2.setText("\u53d6\u6d88");
            panel1.add(button2);
            button2.setBounds(new Rectangle(new Point(320, 195), button2.getPreferredSize()));

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
    private JLabel label2;
    private JLabel label3;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
