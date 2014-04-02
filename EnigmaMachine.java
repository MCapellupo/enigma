
public class EnigmaMachine {
	Rotor rotor1;
	Rotor rotor2;
	Rotor rotor3;
	Reflector reflector;
	PlugBoard steckers = new PlugBoard();
	
	
	public EnigmaMachine(int r1, int r2, int r3, int pos1, int pos2, int pos3, String p1, String p2, String p3){
		reflector = new Reflector();
		
		if(pos1 < 26 && pos2 < 26 && pos3 < 26){
			rotor1 = new Rotor(r1, pos1, null);
			rotor2 = new Rotor(r2, pos2, rotor1);
			rotor3 = new Rotor(r3, pos3, rotor2);
		}
		if(p1.length() == 2 && p2.length() == 2 && p3.length() == 2){
			steckers.addStecker(p1.charAt(0) - 'a', p1.charAt(1) - 'a');
			steckers.addStecker(p2.charAt(0) - 'a', p2.charAt(1) - 'a');
			steckers.addStecker(p3.charAt(0) - 'a', p3.charAt(1) - 'a');
		}
		
	}
	public String run(String plainText){
		String cipherText = "";
		for(int i = 0; i < plainText.length(); i++){
			cipherText += encrypt(plainText.charAt(i));
		}
		return cipherText;
	}
	private char encrypt(char current) {
		
		
		//send the letter through each rotor - the reflector - and back again
		int offset = current - 'a';
		
		offset = steckers.pass(offset);
		offset = rotor3.pass(offset);
		offset = rotor2.pass(offset);
		offset = rotor1.pass(offset);
		offset = reflector.pass(offset);
		offset = rotor1.inversePass(offset);
		offset = rotor2.inversePass(offset);
		offset = rotor3.inversePass(offset);
		offset = steckers.pass(offset);
		
		//advance the rotors
		rotor3.rotate();
		
		current = (char) (offset + 'a');
		return current;
	}
}
