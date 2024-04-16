package F_CadDigHex;

public class CadDigHex {
    public int  CadDigHex(String hex, int length) {
        if (length == 1) {
            return Character.digit(hex.charAt(0), 16);
        } else {
            return Character.digit(hex.charAt(length - 1), 16) + 16 * CadDigHex(hex, length - 1);
        }
    }
}