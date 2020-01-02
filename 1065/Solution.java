import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {//1065
//public class Main {
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

        int input = nextInt();
        if( input<100){
            this._sb.append(input);
        } else if(input< 1000){
            int sum= 99;

            Integer[] array = new Integer[3];
            array[0]= input/100;
            array[1]= (input%100);

            for (int o= 1; o<= array[0]; o++){
                if (o == array[0]){
                    for (int i = 0; i< 6; i++){
                        if(array[0]+i <10 &&  array[0]+2*i < 10 ){
                            if ((array[0]+i) *10 + array[0] + 2*i <= array[1]) sum++;
                        }
                    }
                    for (int i = 1; i<5 ; i++ ){
                        if (array[0]-i >= 0 && array[0]- 2*i>= 0){
                            if ((array[0]-i)*10+ array[0]- 2*i <= array[1]) sum++;

                        }
                    }
                } else {
                    for (int i= 0; i< 6; i++ ){
                        if (array[0]+i < 10 && array[0]+ 2*i <10) sum++;
                    }
                    for (int i= 1; i< 6; i++){
                        if (array[0]-i >= 0 && array[0] - 2*i >=0) sum++;
                    }

                }

            }
            this._sb.append(sum);
        } else {
            this._sb.append(144);
        }
        printResult();
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
        //Main main = new Main();
        Solution main = new Solution();
        main.solve();
    }
}
