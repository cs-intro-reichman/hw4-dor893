public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));
        System.out.println("My sest : " + lowerCase("Yaga"));


        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true 
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true


        System.out.println("test: " + contains("baba yaga", "baba")); // true
        System.out.println(contains("baba yaga", "")); // true
        System.out.println(contains("baba yaga", "John Wick is the baba yaga")); // false
        System.out.println(contains("baba yaga", "Yaga")); // true
        System.out.println(contains("baba yaga", "babayaga")); // true 
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {

        String lowCase = "";
        
        for(int i = 0; i < str.length(); i++) {

            int charOfstr = str.charAt(i);

            if (charOfstr >= 65 && charOfstr <= 90) {

                charOfstr += 32;

            }

            lowCase = lowCase + (char) charOfstr;
        }

        return lowCase;
    }

    public static String lowerCasewithouttab(String str) {

        String lowCase1 = "";
        
        for(int i = 0; i < str.length(); i++) {

            char charOfstr = str.charAt(i);

            int uniCodeOfchar = charOfstr;

            if (uniCodeOfchar >= 65 && uniCodeOfchar <= 90) {

                charOfstr = (char) (charOfstr + 32);

                lowCase1 += charOfstr;

            } else if(uniCodeOfchar >= 97 && uniCodeOfchar <= 122) {

                lowCase1 += charOfstr;
            }
        }

        return lowCase1;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {

        if(str2.length() == 0) {

            return true;

        }

        String lowStr1 = lowerCasewithouttab(str1);

        String lowStr2 = lowerCasewithouttab(str2);

        if(lowStr2.length() > lowStr1.length()) {

            return false;

        }

        int index = lowStr1.length() - lowStr2.length();
        
        for(int j = 0; j < index; j ++) {

            if(lowStr2.charAt(0) == lowStr1.charAt(j)) {

                boolean doesCont = true;
                
                for (int t = 0; t < lowStr2.length(); t++) {

                    if(lowStr2.charAt(t) != lowStr1.charAt(t + j)) {

                    doesCont = false;

                    break;

                    }

                }
            
              if(doesCont) {

                  return true;
              }
            }
        }

        return false;
    }
}
