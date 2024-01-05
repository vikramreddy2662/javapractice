package JavaProblems;

public class StringIsRotationOfAnother {
    public static Boolean checkRotation(String str1,String str2) {
        if (str1.length() != str2.length()) {
            return false;
        } else {

            String str3=str1+str2;
            if(str3.contains(str2)){
                return true;
            }
            return false;

        }
    }
    public static void main(String[] args){
        System.out.println(checkRotation("avaj","java"));

    }
}
