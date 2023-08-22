package co.edu.uptc.presenter;

import java.util.Vector;

import javax.swing.JOptionPane;

import co.edu.uptc.model.Article;
import co.edu.uptc.view.CartView;

public class CartPresenter {
	private CartView view;
	private Vector<Article> cart = new Vector<>();

	public CartPresenter(CartView view) {
		this.view = view;
		this.view.setPresenter(this);
	}

	public void onAddButtonClicked() {
		String name = JOptionPane.showInputDialog("Enter article name:");
		if (name != null && !name.isEmpty()) {
			String priceStr = JOptionPane.showInputDialog("Enter article price:");
			try {
				double price = Double.parseDouble(priceStr);
				cart.add(new Article(name, price));
				updateView();
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(view, "Invalid price format.");
			}
		}
	}

	private void updateView() {
		Vector<String> articleNames = new Vector<>();
		double totalPrice = 0;
		for (Article article : cart) {
			articleNames.add(article.getName());
			totalPrice += article.getPrice();
		}
		view.updateArticleList(articleNames);
		view.updateTotalPrice(totalPrice);
	}

	public void start() {
		view.setVisible(true);
	}
}