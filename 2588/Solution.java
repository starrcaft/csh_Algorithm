import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {//2588

    private BufferedReader _br;
    private StringTokenizer _st;
    private StringBuilder _sb;

    private void init(){//custom
        this._st= new StringTokenizer("");
        this._br= new BufferedReader(new InputStreamReader(System.in));
        this._sb= new StringBuilder();
    }

    private void solve(){
        this.init();
        //custom
        int a= nextInt(); int sum = 0;
        String b= readLine();
        char[] array= b.toCharArray();
        for(int o=array.length-1; o>= 0; o--){
            this._sb.append(a*Character.getNumericValue(array[o])+"\n");
        }
        this._sb.append(a*Integer.parseInt(b));
        System.out.println(this._sb.toString());
    }

    private String readLine() {
        try{
            return this._br.readLine();
        } catch (IOException e){
            return null;
        }
    }

    private String next() {
        do{
            this._st= new StringTokenizer(this.readLine());
        }while (!this._st.hasMoreTokens());
        return this._st.nextToken();
    }

    private int nextInt(){
        return Integer.parseInt(this.next());
    }

    public static void main(String[] args){
        Solution main = new Solution();
        main.solve();
    }
}
