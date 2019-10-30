// import java.util.Arrays;
import java.util.Scanner;


class Person{

    public int avergae_score(int[] s, int len){
        int total = 0;
        for (int i : s){
            total += i;
        }
        return total/len;
    }
}

class Teacher extends Person{

}

class Student extends Person{

}

public class Average_Score {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		console.nextLine();
		String[][] input = new String[n][];
		String[] output = new String[n];

		for (int i =0; i<n; i++) {
			String temp = console.nextLine();
			input[i] =temp.split(" ");
		}
		console.close();

		for (int i =0; i<n; i++) {
			int len = input[i].length;
			int[] intArr = new int[len];
			for(int j = 0; j <len; j++) {
				intArr[j] = Integer.parseInt( input[i][j]);
			}
			//System.out.println(Arrays.toString(intArr));
			if (len == 4) {
				output[i] = "Teacher";
				Teacher t = new Teacher();
				int as = t.avergae_score(intArr, 4);
				output[i] += " "+as;
			}
			if (len == 3) {
				output[i] = "Student";
				Student t = new Student();
				int as = t.avergae_score(intArr, 3);
				output[i] += " "+as;
			}
		}
		for (String i : output) {
			System.out.println(i);
		}
	}
}
