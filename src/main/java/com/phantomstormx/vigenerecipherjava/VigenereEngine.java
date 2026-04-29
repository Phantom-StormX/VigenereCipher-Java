package com.phantomstormx.vigenerecipherjava;

/* .append adds data to the end of an existing character sequence.
Unlike the + operator for String objects, which creates a brand-new object
for every concatenation, .append() modifies the existing object in place.
*/

/* StringBuilder used to create and manipulate mutable (changeable) sequences of characters.
 Unlike the standard String class, which is immutable and creates a new object every
 time it is modified, StringBuilder allows you to update the content in-place.
 */

public class VigenereEngine {
    public static final String alpha = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String text, String key) {

        text = text.toLowerCase();

        StringBuilder message = new StringBuilder();// separate result variable

        for (int i = 0; i < text.length(); i++) { // verifies each character, and starts the loop index at 0
            int charPos = alpha.indexOf(text.charAt(i));
            if (charPos == -1) {
                message.append(text.charAt(i)); // keep spaces/punctuation as-is
            } else {
                int keyPos  = alpha.indexOf(Character.toLowerCase(key.charAt(i % key.length())));
                int keyVal  = (charPos + keyPos) % 26; // key value, aka shift
                message.append(alpha.charAt(keyVal)); // append to message, not text
            }
        }
        return message.toString();   // return the accumulated result
    }

    public static String decrypt(String text, String key) {
        text = text.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {  // starts the loop index at 0
            int charPos = alpha.indexOf(text.charAt(i));
            if (charPos == -1) {
                // Not a letter — keep as-is (spaces, punctuation, digits)
                result.append(text.charAt(i));
            } else {
                int keyPos = alpha.indexOf(Character.toLowerCase(key.charAt(i % key.length())));
                int keyVal = (charPos - keyPos + 26) % 26;
                result.append(alpha.charAt(keyVal));
            }
        }
        return result.toString();
    }
}
