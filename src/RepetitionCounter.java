
public class RepetitionCounter {
	
	int count;
	Character lastCharacter = null;
	
	public void add(Character c) {
		if (c == null) {
			throw new IllegalArgumentException();
		}
		
		if (c.equals(lastCharacter)) {
			count++;
		} else {
			lastCharacter = c;
			count = 1;
		}
	}
	
	public int repeatsOf(Character c) {
		if (lastCharacter == null || c == null || !c.equals(lastCharacter)) {
			return 0;
		} else {
			return count;
		}
	}
	
	public boolean previousIsIn(String candidateStr) {
		if (lastCharacter == null) {
			return false;
		}
		
		for (char c: candidateStr.toCharArray()) {
			if (c == lastCharacter) {
				return true;
			}
		}
		
		return false;
	}
}
