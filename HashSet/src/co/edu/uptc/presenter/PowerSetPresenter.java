package co.edu.uptc.presenter;

import java.util.HashSet;
import java.util.Set;

import javax.swing.SwingUtilities;

import co.edu.uptc.model.PowerSetGenerator;
import co.edu.uptc.view.PowerSetView;

public class PowerSetPresenter {
	private PowerSetView view;

	public PowerSetPresenter() {
		view = new PowerSetView(this);
	}

	public void generatePowerSet(String input) {
		String[] elements = input.split(",");
		Set<Integer> inputSet = new HashSet<>();
		for (String element : elements) {
			inputSet.add(Integer.parseInt(element.trim()));
		}

		PowerSetGenerator generator = new PowerSetGenerator();
		Set<Set<Integer>> powerSet = generator.generatePowerSet(inputSet);

		view.updatePowerSet(powerSet);
	}

	public void start() {
		SwingUtilities.invokeLater(() -> {
			view.setVisible(true);
		});
	}

	public static void main(String[] args) {
		PowerSetPresenter presenter = new PowerSetPresenter();
		presenter.start();
	}
}
