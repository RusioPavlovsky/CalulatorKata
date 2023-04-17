public class Calculation {
    int calculation (String s, int a, int b){
        if(s.contains("+")) return a+b;
        if(s.contains("-")) return a-b;
        if(s.contains("*")) return a*b;
        if(s.contains("/")) return a/b;
        return 0;
    }
}
