/*
 * Created by JFormDesigner on Sat Apr 24 08:45:24 CST 2021
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
public class Delete extends JFrame {
    public Delete() {
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
        if(conn.delete(book)==1)//调用数据库插入函数 插入成功提示
        {
            DeleteSuccess success  = new DeleteSuccess();
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
        textField1 = new JTextField();
        label3 = new JLabel();
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
            label1.setBounds(new Rectangle(new Point(190, 40), label1.getPreferredSize()));

            //---- label2 ----
            label2.setText("\u4e66\u53f7\uff1a");
            panel1.add(label2);
            label2.setBounds(105, 80, 46, 20);
            panel1.add(textField1);
            textField1.setBounds(155, 75, 125, textField1.getPreferredSize().height);

            //---- label3 ----
            label3.setText("\u4e66\u540d\uff1a");
            panel1.add(label3);
            label3.setBounds(105, 110, 50, 20);
            panel1.add(textField2);
            textField2.setBounds(155, 110, 125, 25);

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
            button1.setBounds(new Rectangle(new Point(105, 170), button1.getPreferredSize()));

            //---- button2 ----
            button2.setText("\u53d6\u6d88");
            panel1.add(button2);
            button2.setBounds(new Rectangle(new Point(260, 165), button2.getPreferredSize()));

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
    private JTextField textField1;
    private JLabel label3;
    private JTextField textField2;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
