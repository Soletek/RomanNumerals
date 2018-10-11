
public class RomanNumerals {
	RepetitionCounter counter;
	boolean prevIsSubtracted;
	RomanNumeralPart[] possibleNumerals;
	
	public RomanNumerals() {
		possibleNumerals = new RomanNumeralPart[] {
				new RomanNumeralPart('I', 1, 4, '-', "VX", ""),
				new RomanNumeralPart('V', 5, 2, 'I', "", "V"),
				new RomanNumeralPart('X', 10, 4, 'I', "LC", "V"),
				new RomanNumeralPart('L', 50, 2, 'X', "", "IVL"),
				new RomanNumeralPart('C', 100, 4, 'X', "DM", "IVL"),
				new RomanNumeralPart('D', 500, 2, 'C', "", "IVXLD"),
				new RomanNumeralPart('M', 1000, 4, 'C', "", "IVXLD"),
		};
	}
	
	public int convertToInteger(String romanNum) {
		int total = 0;
		RomanNumeralPart previousNum = null;
		
		if (!isValidRomanNumeral(romanNum)) {
			throw new IllegalArgumentException("romanNum");
		}
		
		for (char c : romanNum.toCharArray()) {
			RomanNumeralPart num = getInfoForChar(c);
			total += num.getValue();
			
			if (previousNum != null && previousNum.getIdentifier() == num.getCanBeSubractedBy()) {
				total -= previousNum.getValue() * 2;
			}

			previousNum = num;
		}
			
		return total;
	}
	
	RomanNumeralPart getInfoForChar(char c) {
		for (RomanNumeralPart num: possibleNumerals) {
			if (c == num.getIdentifier()) {
				return num;
			}
		}
		
		return null;
	}
	
	boolean isValidRomanNumeral(String romanNum) {
		counter = new RepetitionCounter();
		prevIsSubtracted = false;
		
		for (char c : romanNum.toCharArray()) {
			RomanNumeralPart num = getInfoForChar(c);

			if (num == null) return false;

			if (counter.previousIsIn(num.getCantBeAfterThese())) return false;
			if (counter.previousIsIn(num.getCanSubractFrom()) && prevIsSubtracted) return false;
			
			if (counter.repeatsOf(num.getCanBeSubractedBy()) >= 2) {
				return false;	
			} else if (counter.repeatsOf(num.getCanBeSubractedBy()) == 1) {
				if (prevIsSubtracted) return false;					
				prevIsSubtracted = true;
			} else {
				prevIsSubtracted = false;
			}

			counter.add(c);
			
			if (counter.repeatsOf(num.getIdentifier()) >= num.getMaxRepetitions()) return false;
		}
		
		return true;
	}
}
