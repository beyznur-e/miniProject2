public class Main {
    public static void main(String[] args) {


        char[] kalin = new char[]{'a', 'ı', 'u', 'o'};
        char[] ince = new char[]{'e', 'i', 'ü', 'ö'};
        char harf = 'a';

        for(int i=0; i< kalin.length; i++){
            if(harf == kalin[i]){
                System.out.println("Kalın harflidir");
            }
            else{
                System.out.println("İnce harflidir.");
            }
        }
    }
}