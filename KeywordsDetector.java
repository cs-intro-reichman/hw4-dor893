public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);

    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {

        String[] lowSentences = toLowercaseforarrays(sentences);

        String[] lowKeywords = toLowercaseforarrays(keywords);
        
        for(int i = 0; i < lowSentences.length; i++) {
           
            String str1 = lowSentences[i];

            for(int j = 0; j < lowKeywords.length; j++) {

                String str2 = lowKeywords[j];

                    if(str1.indexOf(str2) != -1) {

                        System.out.println(toUUpercaseforstrings(str1));

                        break;

                    }

            }

        }

    }
    
    
    public static String[] toLowercaseforarrays(String[] arr) { 

        String[] newArray = new String[arr.length];
        
        for(int j = 0; j < arr.length; j++) {

            String strOfarr = arr[j];

            newArray[j] = toLowercaseforstrings(strOfarr);
        }

    return newArray;

    }


    public static String toLowercaseforstrings(String str) { 

        String newString = "";

        for(int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            int asciiOfchar = c;

                if(asciiOfchar >= 65 && asciiOfchar <= 90) { // upper case

                   c = (char) (c + 32);

                   newString += c;
            
                } else if ((asciiOfchar >= 97 && asciiOfchar <= 122) || asciiOfchar == 32) { //lower case or tab

                    newString += c;
                }
        }
    return newString;

    }

public static String toUUpercaseforstrings(String str) { 

    String newString = "";

    for(int i = 0; i < str.length(); i++) {

        char c = str.charAt(i);

        int asciiOfchar = c;

            if((asciiOfchar >= 97 && asciiOfchar <= 122) ) { 

                c = (char) (c - 32);

            } else if(asciiOfchar >= 65 && asciiOfchar <= 90 || asciiOfchar == 32) { 

                newString += c;

            }
        
            
    }
return newString;

}

}