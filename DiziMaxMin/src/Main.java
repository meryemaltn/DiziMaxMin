import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] arr = {15, 12, 788, 1, -1, -778, 2, 0} ;
		Scanner inp = new Scanner (System.in);
		System.out.print("Say� giriniz: ");
		
		int n = inp.nextInt();
		int min = arr[0];
		int max = arr[0]; 
		
		for (int i : arr) {
            if (i < n &&  (n - i < 0 ? (n - i) * -1 : n -i ) < (n - min < 0 ? (n - min) * -1 : n -min )) {
                min = i;
            }
            if (i > n &&  (n - i < 0 ? (n - i) * -1 : n -i ) < (n - min < 0 ? (n - min) * -1 : n -min )) {
                max = i;
            }
		}

        System.out.println(n +"'den b�y�k en k���k say� " + max);
        System.out.println(n + "'den k���k en b�y�k say� " + min);
	}
}