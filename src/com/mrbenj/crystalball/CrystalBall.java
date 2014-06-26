package com.mrbenj.crystalball;

import java.util.Random;

public class CrystalBall {
	public String[] mAnswers = {
			"It is certain",
			"It is decidedly so",
			"All signs say YES",
			"The stars are not aligned",
			"My reply is no",
			"It is doubtful",
			"Better not tell you now",
			"Concentrate and ask again",
			"Unable to answer now",
			"It is hard to say",};
	
	// Methods
	public String getAnAnswer() {
		
		String answer = "";
		
		Random randomGenerator = new Random(); // Construct a new random number generator
		int randomNumber = randomGenerator.nextInt(mAnswers.length);
		answer = Integer.toString(randomNumber);
		
		answer = mAnswers[randomNumber];
		return answer;
	}
}
