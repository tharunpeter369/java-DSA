package search;

public class StringSearch {
    public static void main(String[] args) {
        String name = "TharunPeter";
        char target = 'e';
        System.out.println(search(name,target));

    }
    static int search(String str,char target){
        System.out.println(str.length());
        if(str.length() == 0){
            return 0;
        }

//        for(int i=0; i<str.length(); i++){
//            if(target == str.charAt(i)){
//                return i;
//            }
//        }

        //alternative method

        for(char ch: str.toCharArray()){
            if(ch == target){
                return 99;
            }
        }
        return 0;
    }

//public static void main(String[] args) {
//    String name1 = "maryJisna";
//    char target = 's';
////    char target = "s";
//    System.out.println(search1(name1,target));
//}
//static int search1(String name, char value ){
//    for(int i =0;  i< name.length(); i++){
//        if(value == name.charAt(i) ){
//            return i;
//        }
//    }
//    return  0;
//}
}


