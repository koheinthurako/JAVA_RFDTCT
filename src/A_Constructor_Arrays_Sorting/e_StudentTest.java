package A_Constructor_Arrays_Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class e_StudentTest {
	
	int [] centralNum = {2, 4, 5, 6, 7};
	
	public static void main(String[] args) {
		d_StudentInfo std1= new d_StudentInfo(1, "mg mg", 30);
		// obj name std1 ကိုခေါ်လိုက်တာနဲ့ သူ့ရဲ့ toString() method ကို auto တန်းထုတ်ပေးသည် ထုတ်ပေးလိုက်တဲ့ output က String datatype
		System.out.println(std1);
		
		
//		Array ↓↓↓ (Datatype တူပြီး အရေအတွက် Limit အတိအကျသိရင်  Array ကို သုံးလို့ရတယ်)
		int [] nums = {3, 1, 6, 7, 9}; // တန်ဖိုးတစ်ခါတည်း ထည့်ကြေညာခြင်း
		int num1, num2 []; // num1 က Integer, num2 က Array
		int [] num3, num4; // num3 ကော num4 ကော Array

		int [] advanceNums = new int[5]; // Array အခန်းကို ကြိုကြေညာထားခြင်း သူသည်လည်း Object ဖြစ်တယ်
		advanceNums[0] = 3;
		advanceNums[4] = 9;
		
		System.out.println(nums); // Array တစ်ခုကို output ထုတ်ရင် Object ဖြစ်သည့်အတွက် အထဲကမူရင်းတန်ဖိုးတွေကို မထုတ်ပေးနိုင်ပါ
		System.out.println(Arrays.toString(nums)); // ဒါကြောင့် System ရဲ့ java util package ထဲမှ Arrays.toString() method ကိုသုံးရတယ်
		
		// Array nums ထဲမှ တန်ဖိုးများကို Looping ပတ်ထုတ်ခြင်း
		for(int i = 0; i<nums.length; i++) {
			System.out.println("Loop Array : " + nums[i]);
		}
		
		// Array ထဲကဟာတွေကို အခန်းနံပါတ်တွေမသုံးပဲ သူ့ Flow လေးအတိုင်း output ထုတ်ချင်ရင် ls for ကိုသုံးရတာ ပိုကောင်းတယ်
		for (int num : nums) System.out.println("For Loop Array : " + num);	
		
		
//		Java Scanner ကို သုံးပြီး UserInput တောင်းခြင်း
//		System.out.print("Please type the numbers that you want to search : ");
//		Scanner userInput = new Scanner(System.in);
		
//		Main Scope အပြင်ဘက်ရှိ public method တစ်ခုကို Main Method ထဲမှာ Object ဆောက်ပြီး လှမ်းခေါ်ခြင်း
		e_StudentTest test1 = new e_StudentTest();
//		test1.LinearSearchMethod(userInput.nextInt());
		
		e_StudentTest biSearch = new e_StudentTest();
//		biSearch.BinarySearch();
		
		e_StudentTest BubbleSortTest = new e_StudentTest();
//		BubbleSortTest.BubbleSort();
		
		e_StudentTest SelectionSortTest = new e_StudentTest();
//		SelectionSortTest.SelectionSort();
		
		e_StudentTest RandomGame = new e_StudentTest();
//		RandomGame.RandomGame();
		
		e_StudentTest countVowel = new e_StudentTest();
		int countTest = countVowel.countVowel();
		System.out.println("Total Vowels : " + countTest);
		
		e_StudentTest searchKeyword = new e_StudentTest();
		searchKeyword.searchKeyword();
		
	}

//	Basic Data Searching : Linear Search, Binary Search
	// Linear Search : Array ကို တစ်ခန်းဝင်၊ တစ်ခန်းထွက် ရှာခြင်း
	// Binary Search : Array ကို တစ်ဝက်ခွဲပြီး ရှာခြင်း
	
//	Linear Search ↓↓↓
	public void LinearSearchMethod(int searchNum) {
		boolean check = false;
		for(int i = 0; i < centralNum.length; i++) {
			System.out.println("Searching in array room no.: " + i);
			if(searchNum==centralNum[i]) {
				System.out.println("Found it! I found " + searchNum + " in Array No. " + i);
				check = true;
				break;
			}
		}
		
		if(!check) {
			System.out.println("Value " + searchNum + " not found in the array!");
		}
	}
	
//	Binary Search ↓↓↓
	// တစ်ဝက်ခွဲရှာခြင်း မရှာခင် Data တွေကို Sorting မှန်အောင်စီဖို့လိုတယ်
		public void BinarySearch() {
			int [] bsnums = {3, 4, 6, 8, 10};
			System.out.println("Please enter the number that you want to search by binary : ");
			Scanner userGuessKey = new Scanner(System.in);
			int key = userGuessKey.nextInt();
			int start = 0;
			int end = bsnums.length-1;
			int middle = (start + end);
			boolean check = false;
			while(start <= end) {
				middle = (start + end)/2;
				System.out.println("Start looping...");
				if (key == bsnums[middle]) {
					System.out.println("I found it in array number " + middle + " room!");
					check = true;
					break;
				} else if (key < bsnums[middle]) {
					end = middle - 1;
				} else {
					start = middle + 1;
				}
			}
			
			if(!check) {
				System.out.println("Sorry your number is not in the array!");
			}
		};
	
	
	
	
	
	
	
//	Types of Sorting : Quick Sort, Merge Sort, Shell Sort, Insertion Sort, Selection Sort, Bubble Sort
	
//	Bubble Sort ↓↓↓
	// ဘေးချင်းယှဉ်တဲ့ အခန်းတွေကို အစဉ်လိုက်နှိုင်းယှဉ်ပြီး ကြီးတဲ့ကောင်ကို နောက်ပို့ပြီး နေရာလဲခြင်း ၁ ခေါက်ပြီးသွားရင်
	// အကြီးဆုံးက နောက်ဆုံးကို ရောက်သွားပြီး နောက် ၁ ခေါက် Loop ပတ်ရင် နောက်ဆုံး အခန်းကို ထည့်စဉ်းစားဖို့မလိုပဲ အစကနေပြန်နှိုင်းယှဉ်ပြီး နေရာပြန်လဲ
	public void BubbleSort() {
		System.out.println("Bubble Sort Started...");
		int [] bnums = {6, 4, 10, 8, 3};
		for(int j = 1; j<bnums.length; j++) {
			for(int i = 0; i<bnums.length-j;i++) {
				if(bnums[i]>bnums[i+1]) {
					int temp = bnums[i];
					bnums[i] = bnums[i+1];
					bnums[i+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(bnums));
	}
	
//	Selection Sort
	// ပထမဆုံး array အခန်းကို အတည်ယူပြီး အဲ့တန်ဖိုးကိုအစဉ်လိုက် ဘေးချင်းကပ်တန်ဖိုးတွေနဲ့ တိုက်စစ်သွား ပထမအခန်းရဲ့တန်ဖိုးထက် တခြားတန်ဖိုးကငယ်နေရင် နေရာလှမ်းလဲ
	// ပြီးရင် အဲ့ပထမအခန်းမှာ ပြောင်းသွားတဲ့တန်ဖိုးကို ပဲထပ်ပြီး ဘေးချင်းကပ်တန်ဖိုးတွေနဲ့ တိုက်စစ်သွားငယ်နေရင် ပထမအခန်းတန်ဖိုးနေရာကိုလဲ အငယ်ဆုံးက ပထမအခန်းမှာ ရှိနေရမယ်
	// 1st loop မှာ အငယ်ဆုံးက ထိပ်ဆုံးကိုရောက်ရမယ် 2nd Loop မှာတော့ ဒုတိယအခန်းကနေစပြီး ပြန်ပတ်မယ်
	public void SelectionSort() {
		System.out.println("Selection Sort Started...");
		int [] snums = {6, 4, 10, 8, 3};
		for(int j = 0; j < snums.length; j++) {
			for(int i = j; i < snums.length; i++) {
				if(snums[j] > snums[i]) {
					int temp = snums[j];
					snums[j] = snums[i];
					snums[i] = temp;
					System.out.println(Arrays.toString(snums));
				}
			}
		}
		
		System.out.println(Arrays.toString(snums));
	}
	
	
//	Random Sorting Game
	public void RandomGame() {
		int [] rnums = new int[5];
		Random random = new Random();
		for(int i=0; i<rnums.length; i++) rnums[i] = random.nextInt(15)+1;
		System.out.print("Random numbers : ");
		System.out.println(Arrays.toString(rnums));
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your guess number : ");
		int userKey = sc.nextInt();
		boolean check = false;
		for(int i=0; i < rnums.length; i++) {
			if(userKey==rnums[i]) {
				System.out.println("You are lucky! I found it in array number " + i + " room!");
				check = true;
				break;
			}
		}
			
		if(!check) {
			System.out.println("Sorry please try next time again!");
		}
	}
	
	
//	About Method
	// method definition : void method က no return type
	public void countName() {
		// method implementation
		String name = "mg mg";
		System.out.println(name.length());
	}

//	int Method ဆိုရင်သေချာပေါက် int return ပြန်ပေးရမယ်
	public int countVowel() {
		String name = "aye aye";
		int vowelCount = 0;
		char [] vowels = {'a', 'e', 'i', 'o', 'u'};
		// name.length() က Method ဖြစ်နေတာကို သတိထားပါ
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			for(char v : vowels) {
				if(v==ch) {
					vowelCount++;
					break;
				}
			}
		}
		return vowelCount;
	}
	
	public void searchKeyword() {
		String msg = "contain character";
		char keyword = 'c';
		for(int i = 0; i < msg.length(); i++) {
			if(keyword == msg.charAt(i)) {
				System.out.println("Yes it is contained in the message!");
				break;
			};
		}
	}
	
	
	
	
	
}
