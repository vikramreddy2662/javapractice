package JavaProblems;

public class NumberOfWordsInAString {
    public static void main(String[] args)
    {
        int count=0;
        String str="hello jkjdfksd fkjdfsdui kjfjdashfk ";
        String []words=str.split(" ");//should not use comma in inverted b/w commas
        for(String word:words){
            System.out.println(word);
            count++;

        }
        System.out.println(count);



    }

}
