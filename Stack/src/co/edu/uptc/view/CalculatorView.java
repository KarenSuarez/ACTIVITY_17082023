package co.edu.uptc.view;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import co.edu.uptc.presenter.CalculatorPresenter;

public class CalculatorView extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField inputTextField;
    private JButton evaluateButton;
    private JLabel resultLabel;
    private CalculatorPresenter presenter;

    public CalculatorView(CalculatorPresenter presenter) {
        this.presenter = presenter;

        setTitle("Calculadora de Expresiones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        inputTextField = new JTextField(30);
        evaluateButton = new JButton("Evaluar");
        resultLabel = new JLabel("Resultado:");

        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(inputTextField);
        inputPanel.add(evaluateButton);

        add(inputPanel, BorderLayout.NORTH);
        add(resultLabel, BorderLayout.CENTER);

        evaluateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String expression = inputTextField.getText();
                presenter.evaluateExpression(expression);
            }
        });

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void displayResult(double result) {
        resultLabel.setText("Resultado: " + result);
    }
}
