
public class PlugBoard {
	int steckers[] = new int[26];
	
	PlugBoard(){
		for (int i = 0; i < 26; i++)
			steckers[i] = i;
	}
	
	boolean isSteckered(int offset){
		if (steckers[offset] != offset)
			return true;
		return false;
	}
	
	void addStecker(int a, int b){
		if (a < 0 || a >= 26 || b < 0 || b >= 26)
			return;
		
		if (!isSteckered(a) && !isSteckered(b)){
			steckers[a] = b;
			steckers[b] = a;
		}
	}
	int pass (int offset){
		return steckers[offset];
	}
	
}
