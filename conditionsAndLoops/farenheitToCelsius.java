import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s = new Scanner(System.in);
        
        int S = s.nextInt();
        int E = s.nextInt();
        int W = s.nextInt();
        
        int ans = S;
        
        while (ans <= E){
            int smallAns = (int)((5.0/9)*(ans-32));
            System.out.println(ans + "\t" + smallAns);
            ans += W;
        }

		
	}

}
