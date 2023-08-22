package co.edu.uptc;

import javax.swing.SwingUtilities;

import co.edu.uptc.presenter.MedicalCenterPresenter;

public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			MedicalCenterPresenter presenter = new MedicalCenterPresenter();
			presenter.start();
		});
	}
}