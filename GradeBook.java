package Lab01_Gradebook;

import java.util.ArrayList;

public class GradeBook {
	private double[] scores;
	private int scoresSize;

	/**
	 * Constructs a gradebook with no scores and a given capacity.
	 * 
	 * @capacity the maximum number of scores in this gradebook
	 */
	public GradeBook(int capacity) {
		scores = new double[capacity];
		scoresSize = 0;
	}

	/**
	 * Adds a score to this gradebook.
	 * 
	 * @param score the score to add
	 * @return true if the score was added, false if the gradebook is full
	 */
	public boolean addScore(double score) {
		if (scoresSize < scores.length) {
			scores[scoresSize] = score;
			scoresSize++;
			return true;
		} else
			return false;
	}

	/**
	 * Computes the sum of the scores in this gradebook.
	 * 
	 * @return the sum of the scores
	 */
	public double sum() {
		double total = 0;
		for (int i = 0; i < scoresSize; i++) {
			total = total + scores[i];
		}
		return total;
	}

	/**
	 * Gets the minimum score in this gradebook.
	 * 
	 * @return the minimum score, or 0 if there are no scores.
	 */
	public double minimum() {
		double smallest = -99;
		// STUDENT TODO: Implement your logic here
		if (scoresSize == 0) // check if the there are any scores in the gradebook.
		{
			smallest = 0; // If no scores, the value of smallest will be 0.
		} else // If there are scores, determine what is the smallest value.
		{
			smallest = scores[0];
			for (int i = 0; i < scoresSize; i++) {
				if (smallest > scores[i]) // Compare the smallest to each value in the array.
				{
					smallest = scores[i];
				}
			}
		}
		return smallest;
	}

	/**
	 * Gets the final score for this gradebook.
	 * 
	 * @return the sum of the scores, with the lowest score dropped if there are at
	 *         least two scores, or 0 if there are no scores.
	 */
	public double finalScore() {
		if (scoresSize == 0)
			return 0;
		else if (scoresSize == 1)
			return scores[0];
		else
			return sum() - minimum();
	}

	/**
	 * Gets the number of grades in the gradebook.
	 * 
	 * @return the int of the number of scores.
	 */
	public int getScoreSize() {
		return scoresSize;
	}

	/**
	 * Prints the grades in the gradebook.
	 * 
	 * @return the scores of each component in the scores[] array, separated by a
	 *         space.
	 */
	public String toString() {
		String scoreString = "";
		for (int i = 0; i < scoresSize; i++) {
			scoreString += (scores[i] + " ");
		}
		return scoreString;
	}
}
