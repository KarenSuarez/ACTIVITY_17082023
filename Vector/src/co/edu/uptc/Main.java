package co.edu.uptc;

import javax.swing.SwingUtilities;

import co.edu.uptc.presenter.CartPresenter;
import co.edu.uptc.view.CartView;

public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				CartView view = new CartView();
				CartPresenter presenter = new CartPresenter(view);
				presenter.start();
			}
		});
	}
}