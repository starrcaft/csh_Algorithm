import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.StringTokenizer;

public class Solution {//16637

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
        int a= nextInt();
        String input = readLine();
        char[] array = input.toCharArray();
        int sum = 0, bInt= 0, tmpI;
        char tmpC= Character.MIN_VALUE, bChar= Character.MIN_VALUE;
        for(int o=0; o< array.length; o++){
            if (Character.isDigit(array[o])){
                tmpI = Character.getNumericValue(array[o]);
                if(tmpC != Character.MIN_VALUE){
                    if(tmpC == '+'){
                        sum += tmpI;
                    } else if (tmpC == '*'){
                        sum = sum* tmpI;
                    } else {
                        sum = sum-tmpI;
                    }
                    tmpC= Character.MIN_VALUE;
                } else {
                    sum+= tmpI;
                }
                tmpI= Integer.MIN_VALUE;
            } else {
                if(array[o] != '(' && array[o] != ')') {
                    tmpC= array[o];
                } else if(array[o] == '('){
                    bChar= tmpC; tmpC= Character.MIN_VALUE;
                    bInt= sum; sum = 0;
                } else {
                    if (bChar!= Character.MIN_VALUE){
                        if(bChar == '+'){
                            sum += bInt;
                        } else if (bChar == '*'){
                            sum = sum* bInt;
                        } else {
                            sum = bInt- sum;
                        }
                    } else {
                        sum += bInt;
                    }

                    bChar= Character.MIN_VALUE;
                    bInt= Integer.MIN_VALUE;
                }

            }

        }
        this._sb.append(sum);
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
        Solution main = new Solution();
        main.solve();
    }
}