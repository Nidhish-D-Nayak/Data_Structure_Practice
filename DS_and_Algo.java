import java.util.*;

//PROBLEM-1-Basic
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of no.s: ");
		int n = sc.nextInt();
		String bin = sc.nextLine();
		int[] arr = new int[n];
		System.out.println("Enter the details: ");
		for (int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for (int i=0;i<n;i++) {
			arr[i] = rev(arr[i]);
		}
		for (int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

	static int rev(int a){
		int i = 0;
		int[] send = new int[3];
		while(a>0) {
			send[i] = a%10;
			a = a / 10;
			i+=1;
		}
		return send[0]*10 + send[2];
	}
}


//PROBLEM-2-Hashmaps
public class Main {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of participants");
		int num=Integer.parseInt(sc.nextLine());
		String[] run =new String[num];
		System.out.println("Enter the details");

		for(int i=0;i<num;i++) {
			run[i]=sc.nextLine();
		}

		Double []arr=new Double[num];
		HashMap<String,Double> m=new HashMap<>();
		for(int i=0;i<num;i++) {
			String []str =run[i].split(",");
			Double time=Double.parseDouble(str[1]);
			m.put(str[0],time);
			arr[i]=time;
		}
		double min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		for(HashMap.Entry<String,Double> m1:m.entrySet()) {
	      	if((double)m1.getValue()==min) {
	        	  System.out.println((String)m1.getKey() + " has completed the race in " + min +" Seconds");
	        	  break;
	      	}
		}
	}
}


//PROBLEM-3-Methods
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of players:");
		int n = sc.nextInt();
		String bin = sc.nextLine();
		System.out.println("Enter the details:");
		String[] arr = new String[n];
		for (int i=0;i<n;i++){
			arr[i] = sc.nextLine();
		}
		String[] a = new String[n];
		int[] b = new int[n];
		for (int i=0;i<n;i++){
			String[] k = arr[i].split(",");
			a[i] = k[0];
			b[i] = Integer.parseInt(k[1]);
		}
		int position = 0;
		int min = b[0];
		for (int i=1;i<n;i++) {
			if (b[i]<min){
				min = b[i];
				position = i;
			}
		}
		System.out.println(a[position]+ " has completed the race in "+min+" seconds");
	}
}

//PROBLEM-4-Equal
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String sentence = sc.nextLine();
        System.out.println("Enter the word to search: ");
        String word = sc.nextLine();
        int count = 0;
        String[] k = sentence.split(" ");
        for (int i=0;i<k.length;i++){
            if (word.equals(k[i])){
                count+=1;
            }
        }
        System.out.println(count);
    }
}

//PROBLEM-4-ArrayList
 class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> s1 = new ArrayList<>();
        ArrayList<String> s2 = new ArrayList<>();
        System.out.println("Enter the length of 1st string: ");
        int n1 = sc.nextInt();
        String bin1 = sc.nextLine();
        System.out.println("Enter the 1st strings: ");
        for (int i=0;i<n1;i++){
            s1.add(sc.nextLine());
        }
        System.out.println("Enter the length of 2nd string: ");
        int n2 = sc.nextInt();
        String bin2 = sc.nextLine();
        System.out.println("Enter the 2nd strings: ");
        for (int i=0;i<n2;i++){
            s2.add(sc.nextLine());
        }
        System.out.println("The unique Strings are: ");
        for (int i=0;i<n1;i++){
            int count = 0;
            for (int j=0;j<n2;j++){
                if (s1.get(i).equals(s2.get(j))){
                    count++;
                }
            }
            if (count==0){
                System.out.print(s1.get(i)+" ");
            }
        }
        for (int i=0;i<n2;i++){
            int count = 0;
            for (int j=0;j<n1;j++){
                if (s2.get(i).equals(s1.get(j))){
                    count++;
                }
            }
            if (count==0){
                System.out.print(s2.get(i)+" ");
            }
        }
    }
}

//PROBLEM-5-Leetcode
 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a max: 9 digit number: ");
        int k = sc.nextInt();
        String bin = sc.nextLine();
        String a = String.valueOf(k);
        int len = a.length();
        int[] p = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            p[i] = k % 10;
            k = k / 10;
        }
        int[] sec = new int[len - 3];
        for (int i = 0; i < len - 3; i++) {
            sec[i] = p[i] * 1000 + p[i + 1] * 100 + p[i + 2] * 10 + p[i + 3];
        }
        int[] arr = new int[sec.length];
        for (int i = 0; i < sec.length; i++) {
            arr[i] = rev(sec[i]);
        }
        int max = arr[0];
        int pos = 0;
        for (int i = 1; i < sec.length ; i++) {
            if(arr[i]>max){
                max = arr[i];
                pos = i;
            }
        }
        System.out.print("\nThe Sections are :");
        for (int i = 0; i < sec.length; i++) {
            System.out.print(" "+sec[i]+" ");
        }
        System.out.println("\nThe largest sum is [ "+max+" ] of the section [ "+sec[pos]+" ]");
    }

    static int rev(int h) {
        int n = 0;
        int sum = 0;
        int kap = h;
        while (n < 4) {
            sum = sum + kap % 10;
            kap = kap / 10;
            n++;
        }
        return sum;
    }
}

//PRACTICE-6-Easy-Ifs
 class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st player points: ");
        int a = sc.nextInt();
        String bin1 = sc.nextLine();
        System.out.println("Enter the 1st char: ");
        char[] s = sc.next().toCharArray();
        System.out.println("Enter the 2nd player points: ");
        int b = sc.nextInt();
        String bin2 = sc.nextLine();
        System.out.println("Enter the 2nd char: ");
        char[] r = sc.next().toCharArray();
        int sum1 = a;
        int sum2 = b;
        for (int i = 0; i < s.length; i++) {
            if(s[i]=='L'){
                sum1 = sum1+50;
            }
            else if(s[i]=='R'){
                sum1 = sum1-50;
            }
            else if(s[i]=='B'){
                sum1 =sum1*2;
            }
            else if(s[i]=='F'){
                sum1 = sum1/2;
            }
            else{
                System.out.println("Invalid Input");
            }
        }
        for (int i = 0; i < r.length; i++) {
            if(r[i]=='L'){
                sum2 = sum2+50;
            }
            else if(r[i]=='R'){
                sum2 = sum2-50;
            }
            else if(r[i]=='B'){
                sum2 =sum2*2;
            }
            else if(r[i]=='F'){
                sum2 = sum2/2;
            }
            else{
                System.out.println("Invalid Input");
            }
        }
        if(sum1>sum2){
            System.out.println("Player 1 wins the game");
        }
        else{
            System.out.println("Player 2 wins the game");
        }

    }
}

//PRACTICE-7-WordLength
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word:");
        char[] ch = sc.next().toCharArray();
        String[] men = new String[ch.length];
        int len = ch.length;
        if(ch.length<=8 && ch.length>=3) {
            for (int i = 0; i < len; i++) {
                if (Character.isLetter(ch[i])){
                    if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                        men[i] = null;
                    }
                    else{
                        men[i] = Character.toString(ch[i]);
                    }
                }
                else{
                    System.out.println("Invalid Input");
                    return;
                }
            }
            for (int i = 0; i < len; i++) {
                if(men[i]!=null){
                    System.out.print(men[i]);
                }
            }
            for int i IntSupplier k[i] = Character.add(s[2]==2);
        }
        else if(ch.length<3){
            System.out.println("Word length is too short");
        }
        else{
            System.out.println("Word length exceeds the limit");
        }
    }
}

//PRACTICE-8-PatternCheck
 class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word:");
        String s = sc.nextLine();
        int flag = 1;
        String[] sp = s.split(":");
        for(int i=0;i<sp.length;i++){
            if(sp[i].length()==2){
                if(sp[i].matches("^[0-9a-zA-Z]*$")){
                    continue;
                }
                else{
                    System.out.println("Invalid Input");
                    return;
                }
            }
            else{
                System.out.println("Invalid Input");
                return;
            }
        }
        if(sp.length==6) {
            for (int i = 0; i < sp.length; i++) {
                if (sp[i].matches("^[0-9a-fA-F]*$")) {
                    flag = 1;
                } else {
                    flag = 0;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("Invalid");
            } else {
                System.out.println("Valid");
            }
        }
        else if(sp.length<6){
            System.out.println("Too short");
        }
        else{
            System.out.println("Too Long");
        }
    }
}

//PRACTICE-9-Leetcode
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers:");
        int n = sc.nextInt();
        String bin1 = sc.nextLine();
        if (n >= 3 && n <= 20){
            String[] arr = new String[n];
            System.out.println("Enter the numbers:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLine();
                if (arr[i].length() > 3) {
                    System.out.println("Invalid input");
                    return;
                }
            }
            int count = 0;
            System.out.println("      ");
            for (int i = 0; i < n; i++) {
                if (unique(arr[i])) {
                    System.out.println(arr[i]);
                    count++;
                }
            }
            System.out.println(count + " numbers are unique");
        }
        else{
            System.out.println("Invalid input");
            return;
        }
    }

    static boolean unique(String x){
        String[] ref = x.split("");
        int counter = 0;
        for (int i = 0; i <ref.length ; i++) {
            for (int j = 0; j <ref.length ; j++) {
                if(ref[i].equals(ref[j])){
                    counter++;
                }
            }
        }
        if(counter>3){
            return false;
        }
        else{
            return true;
        }
    }
}

//PRACTICE-10-Leetcode
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String in = sc.nextLine();
        String[] sp = in.split("");
        int flag = 1;
        if(sp.length>=3 && sp.length<=8){
            for (int i = 0; i < sp.length; i++) {
                if(!sp[i].matches("^[a-z]*$")){
                    System.out.println("Invalid Input");
                    return;
                }
            }
            for (int i = 0; i < sp.length; i++) {
                if(i%2==0){
                    sp[i] = sp[i].toUpperCase();
                    System.out.print(sp[i]);
                }
                else{
                    System.out.print(sp[i]);
                }
            }
        }
        else if(sp.length<3){
            System.out.println("Too short");
        }
        else{
            System.out.println("Exceeds the limits");
        }
    }
}

//PRACTICE-11-ParseInt
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String p = sc.nextLine();
        int count = 1;
        if(Integer.parseInt(p)<32767 && Integer.parseInt(p)>0) {
            String[] sep = p.split("");
            for (int i = 0; i < sep.length; i++) {
                if(sep[i].equals("2") || sep[i].equals("3") || sep[i].equals("5") || sep[i].equals("7")){
                    count  = count * Integer.parseInt(sep[i]);
                }
            }
            if(count!=1) {
                System.out.println("Prime :" + count);
            }
            else{
                System.out.println("No Prime Digit Found");
            }1
        }
        else if(Integer.parseInt(p)==0){
            System.out.println("No Prime Digit Found");
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
