
public class RomanNumeralPart {
	
	char identifier;
	int value;
	int maxRepetitions;
	char canBeSubractedBy;
	String canSubractFrom;
	String cantBeAfterThese;
	
	public RomanNumeralPart(char identifier, int value, int maxRepetitions, char canBeSubractedBy, 
			String canSubractFrom, String cantBeAfterThese) {
		super();
		this.identifier = identifier;
		this.value = value;
		this.maxRepetitions = maxRepetitions;
		this.canBeSubractedBy = canBeSubractedBy;
		this.canSubractFrom = canSubractFrom;
		this.cantBeAfterThese = cantBeAfterThese;
	}
	
	public char getIdentifier() {
		return identifier;
	}

	public int getValue() {
		return value;
	}
	
	public int getMaxRepetitions() {
		return maxRepetitions;
	}

	public char getCanBeSubractedBy() {
		return canBeSubractedBy;
	}

	public String getCanSubractFrom() {
		return canSubractFrom;
	}

	public String getCantBeAfterThese() {
		return cantBeAfterThese;
	}
	
}
