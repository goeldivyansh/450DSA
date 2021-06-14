
// Given a string s1 and a string s2, write a snippet to say whether s2 is a rotation of s1?
// (eg given s1 = ABCD and s2 = CDAB, return true, given s1 = ABCD, and s2 = ACBD , return false)

public class StringRotationOrNot {
    int isStringRot(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()) return 0;
        s1 = s1 + s1;
        if(s1.contains(s2)) return 1;
        return 0;

}
