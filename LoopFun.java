 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          Integer result = new Integer("1");
        
          int n = number;
          for (int i = 2 ; i <= n ; i++ )
        
            result = result * (Integer.valueOf(i));

          return result;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
      StringBuilder sb = new StringBuilder();
      char currentChar = phrase.charAt(0);
      sb.append(currentChar);
      for (int i = 1; i < phrase.length(); i++) {
            char nextChar = phrase.charAt(i);
            if (isNextChar(currentChar, nextChar)) {
           sb.append(nextChar);
        }
        currentChar = nextChar;
      }
      return sb.toString().toUpperCase();
          
          
        }
        private static boolean isNextChar(final char currentChar, final char nextChar) {
            return (!Character.isAlphabetic(currentChar) && 
            Character.isAlphabetic(nextChar)) ||
            (Character.isLowerCase(currentChar) && 
            Character.isUpperCase(nextChar));
        }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
              int shift = 3;
              String s = "";
              int len = word.length();
              
              for(int x = 0; x < len; x++){
              char c = (char)(word.charAt(x) + shift);
              
              if (c > 'z')
                s += (char)(word.charAt(x) - (26-shift));
                else
                    s += (char)(word.charAt(x) + shift);
                }
            return s;
        

      }
    }

