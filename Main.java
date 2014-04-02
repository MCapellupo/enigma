
public class Main {

	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		
		
		EnigmaMachine EM = new EnigmaMachine(4, 8, 3, 9, 5, 1, "eb", "mn", "yz");
		EnigmaMachine EM2 = new EnigmaMachine(4, 8, 3, 9, 5, 1, "00", "00", "00");
		String pText = "hellomynameisjoeandiworkinabuttonfactoryihaveadogandawifeandafamily";
	/*	String cText = "etbyvusbmdpxgydsxqiaszaxtohexxiadjmnfbwn";
		String text = "eeeeeeeeeettttttaaaaaaoooooiiiiinnnnnssssrrrrhhhhdddllluuccmmffyywwggpbvk";
		String cText2 = "kqsrjvdtopiyoadhxiuidqfcbmzujptxfoachvjdxyjhnjovljaotyzgijwjlxjxeubqlmxbq";
		String paragraphText = "whatshisnametallguybitchubbyithinkheisanadjunctitookitwiththeromanianguyreallyreallyhardatfirstpeopleinfectedwiththeebolavirusappeardtohavetheflufevermuscleachesthestudywasamilestonesaysgaryoftheuniversityofmanatogawhoisworkingonadifferentebolatreatmentbasedonantibodiesanearlytrickleoffinancialinteresthasturnedintoamultibilliondllartorrentonestartuprecentlyreceivedfortythreemillionandaslightlyoldercompanyscoredamilliontodevelopitspipelinemedicinesitsredcuingathreedimensionalproblemwherethesmallmolecule";
		String decrypt = "drlxueonewamoiqdsotyygaeyxcljxaxfqzflvnkvhrlrkzkknnxabbvfzzpouncgfrkzfilhxkjwxgdxcoiesgfolqxbaahukbzwftsceiyaijfaikgmuumcfksspnultskkrxgmhgxskygmoiplgrgrdukumqnzpmieypwodtiuzwrxuvlhymdiwtkmizixvnohktwzklwkxuwiazkupbexajzzrphabaazwrgoyyutfovmcudwofcovbrovzlyzlbnfskjkutibgijlkuakmrizxbtdbjlfmemrgajsgvkdszzesgxpdopezzzuajkxaficghhkmgdomxwbbcbjppumbappiwnvpzxswbwwltdszvpnvlajnoriwgyyghpfixiuyzlhqugcyggfsftteiwtvdaebklzuskhkyyyyhhxtkvbxxofmeukntjldpilntmwyibmlxpdhjeyrtkdlrqqgvqutmcqihbjtikjnilcpnvvwhiznntpl";
		String t1 = "ikttwkkhcsnfqyxwfbjrbzhplukwkjzxiruincrgfsjsxtjgmdvrmajdxnsldqbnsmwacygxfmikttwkkhcsnfqyxwfbjrbzhplukwkjzxiruincrgfsjsxtjgmdvrmajdxnsldqbnsmwacygxfmikttwkkhcsnfqyxwfbjrbzhplukwkjzxiruincrgfsjsxtjgmdvrmajdxnsldqbnsmwacygxfmikttwkkhcsnfqyxwfbjrbzhplukwkjzxiruincrgfsjsxtjgmdvrmajdxnsldqbnsmwacygxfmikttwkkhcsnfqyxwfbjrbzhplukwkjzxiruincrgfsjsxtjgmdvrmajdxnsldqbnsmwacygxfmikttwkkhcsnfqyxwfbjrbzhplukwkjzxiruincrgfsjsxtjgmdvrmajdxnsldqbnsmwacygxfmikttwkkhcsnfqyxwfbjrbzhplukwkjzxiruincrgfsjsxtjgmdvrmajdxnsldqbnsmwacygxfm";
		String d1 = "ximxeacomrerddnydflvjxlizrxmyyjiefvshqwrqfraqoujfjtsumqzbxhdpwelckakovmubtfnnmmgzkewxrxvqfqfffwsacgjjevwkdtnvwudfsdzsobcfhwegodbhoydvumoienzpyzxtkllmlwbxacajnaocisjlgclzlsfpixgjrqvrltymiumkgsktzdatmtoannzmbidgzfjbkkjqkhypphhbccbqoeoyysehdpkyexspzsjznjmbtmzjczwpkgpbcfivmqaciuofrlyaayhdgapafzxzmbnficuzwfznerhmwwrrtcbkysfgbigcscquorspbhlgvfafilwfbzaxemtgjwvehqcqpyhlvajzvgaaqhhwatncrupqgvcufugloqyzyocmlnbnselobrcllidaunopehwugukohcradkwgisucaccvcqjbmwcdwsdabikehsfjlacupsnoivbhxntwmujxcguhntjsxwoepnplxualwdmatbthprchq";
	*/	
		for (long i = 0; i < 1000000; i ++){
		System.out.println(
				EM.run(pText)
				);
	//	System.out.println(
	//			EM2.run(d1)
	//			);
		}
		
		long endTime = System.nanoTime();

		long duration = endTime - startTime;
		System.out.println(duration/1000000000); //converted to seconds
		
	}

}
