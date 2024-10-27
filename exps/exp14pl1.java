// Aim: Write a program to implement calculator using Actionlistener.
// Name: Khan Maaroof Nahid
// UIN: 231P059
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/* 
   <applet code="SimpleCalculator.class" width=400 height=300> 
   </applet> 
*/

public class SimpleCalculator extends Applet implements ActionListener {
    TextField num1Field, num2Field, resultField;
    Button addButton, subButton, mulButton, divButton, equButton;
    char operator;

    public void init() {
        setLayout(null);

        // Input text fields for numbers
        num1Field = new TextField();
        num1Field.setBounds(50, 50, 100, 30);
        add(num1Field);

        num2Field = new TextField();
        num2Field.setBounds(200, 50, 100, 30);
        add(num2Field);

        // Buttons for arithmetic operations
        addButton = new Button("+");
        subButton = new Button("-");
        mulButton = new Button("*");
        divButton = new Button("/");

        addButton.setBounds(50, 100, 50, 30);
        subButton.setBounds(110, 100, 50, 30);
        mulButton.setBounds(170, 100, 50, 30);
        divButton.setBounds(230, 100, 50, 30);

        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);

        // Equal button
        equButton = new Button("=");
        equButton.setBounds(290, 100, 50, 30);
        add(equButton);

        // Output text field for the result
        resultField = new TextField();
        resultField.setBounds(150, 150, 100, 30);
        resultField.setEditable(false);
        add(resultField);

        // Adding action listeners
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        equButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        // Parse the input numbers
        double num1, num2, result = 0;
        try {
            num1 = Double.parseDouble(num1Field.getText());
            num2 = Double.parseDouble(num2Field.getText());
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid Input");
            return;
        }

        // Determine which operator button was pressed
        if (e.getSource() == addButton) {
            operator = '+';
        } else if (e.getSource() == subButton) {
            operator = '-';
        } else if (e.getSource() == mulButton) {
            operator = '*';
        } else if (e.getSource() == divButton) {
            operator = '/';
        }

        // Perform the calculation when "=" button is pressed
        if (e.getSource() == equButton) {
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        resultField.setText("Cannot divide by zero");
                        return;
                    }
                    break;
                default:
                    resultField.setText("Select an operation");
                    return;
            }
            // Display the result
            resultField.setText(String.valueOf(result));
        }
    }
}
