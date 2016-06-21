package CoffeeHouse;

import CoffeeHouse.Product.AbstractProduct;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.NumberFormat;
import java.util.*;
import java.util.List;

/**
 * Created by vdohryk on 13.06.2016.
 */
public class CoffeeHouseGUI {
    private Menu menu;
    private int productIndex = 0;

    CoffeeHouseGUI(Menu menu){
        this.menu = menu;
        JFrame form = new JFrame();
        form.setMinimumSize(new Dimension(100,100));
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.add(createPanel());

        form.pack();
        form.setVisible(true);

    }

    private JPanel createPanel(){

        List<AbstractProduct> products = menu.getProducts();
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridBagLayout());
        JLabel label = new JLabel("Customer:");
        JTextField customer = new JTextField();
        customer.setColumns(25);

        JLabel labelCount = new JLabel("count:");
        NumberFormat nf = NumberFormat.getIntegerInstance();
        JFormattedTextField count = new JFormattedTextField(nf);
        count.setColumns(2);
        count.setValue(0);

        JButton jBuy = new JButton("Buy");

        jPanel.add(label, new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.LINE_START,0, new Insets(0,0,0,0),0,0));
        jPanel.add(customer, new GridBagConstraints(1,0,1,1,0,0,GridBagConstraints.LINE_START,GridBagConstraints.HORIZONTAL, new Insets(0,0,0,0),0,0));

        ActionListener groupListener = new radioGroupListener();

        JLabel lProducts = new JLabel("MENU:");
        ButtonGroup group = new ButtonGroup();
        JPanel pProducts = new JPanel();
        pProducts.setLayout(new GridLayout(products.size(), 0));
        int i=0;
        for (AbstractProduct product: menu.getProducts()){
            JRadioButton jButton = new JRadioButton(product.getName());
            jButton.setActionCommand(String.valueOf(i));
            jButton.addActionListener(groupListener);
            group.add(jButton);
            pProducts.add(jButton);
            i++;
        }
        jPanel.add(lProducts, new GridBagConstraints(0,1,1,1,0,0,GridBagConstraints.LINE_START,0, new Insets(0,0,0,0),0,0));
        jPanel.add(pProducts, new GridBagConstraints(1,1,1,1,0,0,GridBagConstraints.LINE_START,0, new Insets(0,3,0,0),0,0));

        jPanel.add(labelCount, new GridBagConstraints(0,2,1,1,0,0,GridBagConstraints.LINE_START,0, new Insets(0,0,0,0),0,0));
        jPanel.add(count, new GridBagConstraints(1,2,1,1,0,0,GridBagConstraints.LINE_START,0, new Insets(0,0,0,0),0,0));
        jPanel.add(jBuy, new GridBagConstraints(1,3,1,1,0,0,GridBagConstraints.LINE_START,0, new Insets(0,0,0,0),0,0));

        jBuy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Customer client = new Customer(customer.getText());
                int countT = Integer.parseInt(count.getText());
                AbstractProduct abstractProduct = menu.getProducts().get(productIndex);
                Transaction transaction = new Transaction(client, abstractProduct,countT);
                transaction.printTransaction();
            }
        });
        return jPanel;
    }

    private JPanel createRadioPanel(){
        JPanel jPanel = new JPanel();
        JRadioButton americanoButton = new JRadioButton("Americano");
        americanoButton.setMnemonic(KeyEvent.VK_0);
        americanoButton.setActionCommand("Americano");
        americanoButton.setSelected(true);

        JRadioButton capuchinoButton = new JRadioButton("Capuchino");
        capuchinoButton.setMnemonic(KeyEvent.VK_1);
        capuchinoButton.setActionCommand("Capuchino");

        JRadioButton espressoButton = new JRadioButton("Espresso");
        espressoButton.setMnemonic(KeyEvent.VK_2);
        espressoButton.setActionCommand("Espresso");

        JRadioButton latteButton = new JRadioButton("Latte");
        latteButton.setMnemonic(KeyEvent.VK_3);
        latteButton.setActionCommand("Latte");

        JRadioButton blackTeaButton = new JRadioButton("Black tea");
        blackTeaButton.setMnemonic(KeyEvent.VK_4);
        blackTeaButton.setActionCommand("Black tea");

        JRadioButton greenTeaButton = new JRadioButton("Green tea");
        greenTeaButton.setMnemonic(KeyEvent.VK_5);
        greenTeaButton.setActionCommand("Green tea");

        JRadioButton teaWithBergamontButton = new JRadioButton("Tea with bergamont");
        teaWithBergamontButton.setMnemonic(KeyEvent.VK_6);
        teaWithBergamontButton.setActionCommand("Tea with bergamont");

        ButtonGroup group = new ButtonGroup();
        group.add(americanoButton);
        group.add(capuchinoButton);
        group.add(espressoButton);
        group.add(latteButton);
        group.add(blackTeaButton);
        group.add(greenTeaButton);
        group.add(teaWithBergamontButton);

        JPanel radioPanel = new JPanel(new GridLayout(0, 1));
        radioPanel.add(americanoButton);
        radioPanel.add(capuchinoButton);
        radioPanel.add(espressoButton);
        radioPanel.add(latteButton);
        radioPanel.add(blackTeaButton);
        radioPanel.add(greenTeaButton);
        radioPanel.add(teaWithBergamontButton);

        jPanel.add(radioPanel);
        return jPanel;
    }

    private  class radioGroupListener implements  ActionListener{


        @Override
        public void actionPerformed(ActionEvent e) {
            productIndex = Integer.parseInt(e.getActionCommand());
        }
    }
}
