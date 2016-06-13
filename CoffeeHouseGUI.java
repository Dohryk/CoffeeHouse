package CoffeeHouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by vdohryk on 13.06.2016.
 */
public class CoffeeHouseGUI {
    private Menu menu;

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
        JPanel jPanel = new JPanel();
        JLabel label = new JLabel("Customer:");
        JTextField customer = new JTextField();

        JLabel labelCount = new JLabel("count:");
        JTextField count = new JTextField();

        customer.setSize(15,10);

        JButton jBuy = new JButton("Buy");

        jPanel.add(label);
        jPanel.add(customer);
        jPanel.add(createRadioPanel());
        jPanel.add(labelCount);
        jPanel.add(count);
        jPanel.add(jBuy);

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
}
