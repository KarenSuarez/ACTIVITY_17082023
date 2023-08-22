package co.edu.uptc.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import co.edu.uptc.presenter.CartPresenter;

public class CartView extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JList<String> articleList;
	private JLabel totalPriceLabel;
	private JButton addButton;
	private CartPresenter presenter;

	public CartView() {
		setTitle("Shopping Cart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);

		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());

		articleList = new JList<>();
		mainPanel.add(new JScrollPane(articleList), BorderLayout.CENTER);

		totalPriceLabel = new JLabel("Total: $0.00");
		mainPanel.add(totalPriceLabel, BorderLayout.SOUTH);

		addButton = new JButton("Add Article");
		addButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				presenter.onAddButtonClicked();
			}
		});
		mainPanel.add(addButton, BorderLayout.NORTH);

		add(mainPanel);
	}

	public void setPresenter(CartPresenter presenter) {
		this.presenter = presenter;
	}

	public void updateArticleList(Vector<String> articleNames) {
		articleList.setListData(articleNames);
	}

	public void updateTotalPrice(double totalPrice) {
		totalPriceLabel.setText("Total: $" + String.format("%.2f", totalPrice));
	}
}
