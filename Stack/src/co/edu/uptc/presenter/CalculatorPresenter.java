package co.edu.uptc.presenter;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import co.edu.uptc.model.ExpressionEvaluator;
import co.edu.uptc.view.CalculatorView;

public class CalculatorPresenter {
    private CalculatorView view;
    private ExpressionEvaluator evaluator;

    public CalculatorPresenter() {
        view = new CalculatorView(this);
        evaluator = new ExpressionEvaluator();
    }

    public void evaluateExpression(String expression) {
        try {
            double result = evaluator.evaluateExpression(expression);
            view.displayResult(result);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la expresión: " + e.getMessage());
        }
    }

    public void start() {
        SwingUtilities.invokeLater(() -> {
            view.setVisible(true);
        });
    }

    public static void main(String[] args) {
        CalculatorPresenter presenter = new CalculatorPresenter();
        presenter.start();
    }
}
