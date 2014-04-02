
public class Rotor {
	public final static int ROTORSIZE = 26;
	int	rotor[] = new int[ROTORSIZE];
	int rotorNum;
	int currentPos, initialPos;
	int notch1, notch2;
	Rotor nextRotor;
	private int[] inverseRotor = new int[ROTORSIZE];
	
	Rotor(int number, int pos, Rotor next){
		rotorNum = number;
		currentPos = initialPos = pos;
		nextRotor = next;
		
		switch (rotorNum) {
		case 1:
			rotor = I;
			notch1 = IPEG;
			notch2 = -1;
		break;
		case 2:
			rotor = II;
			notch1 = IIPEG;
			notch2 = -1;
		break;
		case 3:
			rotor = III;
			notch1 = IIIPEG;
			notch2 = -1;
		break;
		case 4:
			rotor = IV;
			notch1 = IVPEG;
			notch2 = -1;
		break;
		case 5:
			rotor = V;
			notch1 = VPEG;
			notch2 = -1;
		break;
		case 6:
			rotor = VI;
			notch1 = VIPEG1;
			notch2 = VIPEG2;
		break;
		case 7:
			rotor = VII;
			notch1 = VIIPEG1;
			notch2 = VIIPEG2;
		break;
		case 8:
			rotor = VIII;
			notch1 = VIIIPEG1;
			notch2 = VIIIPEG2;
		break;
		}
		for (int i = 0; i < Rotor.ROTORSIZE; i++)
	        inverseRotor[rotor[i]] = i;	
	}
	
	public void rotate(){
		currentPos = (currentPos + 1)%ROTORSIZE;
		if ((currentPos == notch1 || currentPos == notch2) && nextRotor != null){
			nextRotor.rotate();
		}
	}
	
	public static final int IPEG = 24;    // Y 
	public static final int I[] = { 4, 10, 12, 5, 11, 6, 3, 16, 
									21, 25, 13, 19, 14, 22, 24, 
									7, 23, 20, 18, 15, 0, 8, 1, 
									17, 2, 9 }; 

	public static final int IIPEG = 12;   // M 
	public static final int II[] = { 0, 9, 3, 10, 18, 8, 17, 
									 20, 23, 1, 11, 7, 22, 19, 
									 12, 2, 16, 6, 25, 13, 15, 
									 24, 5, 21, 14, 4 }; 

	public static final int IIIPEG = 3;   // D 
	public static final int III[] = { 1, 3, 5, 7, 9, 11, 2, 
									 15, 17, 19, 23, 21, 25,
									 13, 24, 4, 8, 22, 6, 0,
									 10, 12, 20, 18, 16, 14 }; 


	public static final int IVPEG = 17;   // R 
	public static final int IV[] = { 4, 18, 14, 21, 15, 25, 9, 0,
									24, 16, 20, 8, 17, 7, 23, 11,
									13, 5, 19, 6, 10, 3, 2, 12, 22, 1 }; 


	public static final int VPEG = 7;     // H 
	public static final int V[] = { 21, 25, 1, 17, 6, 8, 19, 24, 20,
									15, 18, 3, 13, 7, 11, 23, 0, 22,
									12, 9, 16, 14, 5, 4, 2, 10 }; 


	public static final int VIPEG1 = 7;   // H 
	public static final int VIPEG2 = 20;  // U 
	public static final int VI[] = { 9, 15, 6, 21, 14, 20, 12, 5,
									 24, 16, 1, 4, 13, 7, 25, 17,
									 3, 10, 0, 18, 23, 11, 8, 2,
									 19, 22 }; 


	public static final int VIIPEG1 = 7;   // H 
	public static final int VIIPEG2 = 20;  // U 
	public static final int VII[] = { 13, 25, 9, 7, 6, 17, 2, 23, 
									  12, 24, 18, 22, 1, 14, 20, 5,
									  0, 8, 21, 11, 15, 4, 10, 16, 
									  3, 19 }; 


	public static final int VIIIPEG1 = 7;  // H 
	public static final int VIIIPEG2 = 20; // U 
	public static final int VIII[] =  { 5, 10, 16, 7, 19, 11, 23, 
										14, 2, 1, 9, 18, 15, 3, 
										25, 17, 0, 12, 4, 22, 13, 8,
										20, 24, 6, 21 };

	public int inversePass(int offset){
		return (inverseRotor[(offset - currentPos + this.ROTORSIZE)%this.ROTORSIZE] + currentPos)%26;
	}
	
	public int pass(int offset) {
		return (rotor[(offset - currentPos + this.ROTORSIZE)%this.ROTORSIZE] + currentPos)%26;
	} 
}
