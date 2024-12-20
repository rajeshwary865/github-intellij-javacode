package encasulation;

public class MyChar {
    public static void main(String[] args){
    }
    private char ch;
    public MyChar(char ch) {
        this.ch = ch;
    }
    public  boolean isVowel() {
        if(ch == 'a' || ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u')
            return true;
        return false;
    }
    public boolean isDigit(){
        if(ch >= 48 && ch <= 57)
        return true;
        return false;

    }
}
