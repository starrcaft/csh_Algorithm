import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {//11437

    private BufferedReader _br;
    private StringTokenizer _st;
    private StringBuilder _sb;

    private void init(){
        this._br= new BufferedReader(new InputStreamReader(System.in));
        this._sb= new StringBuilder();
        //custom
        //        this._st= new StringTokenizer("");
    }

    private void solve(){
        this.init();
        //custom
    }

    private void printResult(){
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
