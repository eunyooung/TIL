package sist.com.core.array;

// A 65 a 97 (32)      
// upper,lower,initCap,reverse,substring,startWith,indexOf 

public class MainClass3 {
    public void loopString(char[] imsi, char[] c, int state) {
        for (int i = 0; i < imsi.length; i++) {
            imsi[i] = state == 0 ? ((c[i] >= 'a' && c[i] <= 'z') ? (char) (c[i] - 32) : c[i])
                    : (c[i] >= 'A' && c[i] <= 'Z') ? (char) (c[i] + 32) : c[i];
        }
    }

    public char[] upper(char[] c) {
        char[] imsi = new char[c.length];
        loopString(imsi, c, 0);
        return imsi;
    }

    public char[] lower(char[] c) {
        char[] imsi = new char[c.length];
        loopString(imsi, c, 1);
        return imsi;
    }

    public char[] initCap(char[] c) {
        char[] rs = lower(c);
        rs[0] = (char) (rs[0] - 32);
        return rs;
    }

    public String substring(char[] value, int start, int end) {
        String temp = "";
        if (start < 0 || end < 0 || (end - start) < 0) {
            //throw new StringIndexOutOfBoundsException();
            System.out.println("StringIndexOutOfBoundsException");
        }
        for (int i = start; i < end; i++) {
            temp += value[i];
        }
        return temp;
    }

    public boolean startsWith(char[] value, char[] s) {
        for (int i = 0; i < s.length; i++) {
            if (value[i] != s[i])
                return false;
        }
        return true;
    }

    public int indexOf(char[] c, char value) {
        for (int i = 0; i < c.length; i++) {
            if (c[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        char[] c = { 'a', 'j', 'A', 'x', 'D', 'a', 't', 'A' };
        MainClass3 a = new MainClass3();
        System.out.println(a.indexOf(c, 'k'));
        //System.out.println(a.startsWith(c,new char[]{'a', 'j', 'A', 'D'}));
        //System.out.println(a.substring(c, -1, 2));
        //System.out.println(a.initCap(c));
        //String str = "abc#def";
        //System.out.println(str.substring(3, 2));
        //System.out.println(str.startsWith("abce"));
        //System.out.println(str.endsWith("cef"));
        //System.out.println(str.indexOf('$'));
    }
}