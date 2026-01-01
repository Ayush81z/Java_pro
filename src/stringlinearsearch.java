public class stringlinearsearch {
    public static void main(String[] args) {
        String name = "kunal";
        char target = 'k';
        System.out.println(linearsearch(name,target));
    }

    static boolean linearsearch(String str,char target) {
        if (str.length() == 0){
            return false;
        }
        for  (int i=0;i<str.length();i++){
            if (str.charAt(i) == target) {
                System.out.println("true");  //or return true;
            }
        }
        for(char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }


        return false;
    }

}
