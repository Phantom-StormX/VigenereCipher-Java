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

        text = text.toLowerCase(); //sets all text in the input to lowercase, keeps things nice and squeaky clean

        StringBuilder message = new StringBuilder();// separate result variable

        for (int i = 0; i < text.length(); i++) { // verifies each character, and starts the loop index at 0
            int charPos = alpha.indexOf(text.charAt(i));
            if (charPos == -1) {
                message.append(text.charAt(i)); // keep spaces/punctuation as-is
            } else {
                int keyPos  = alpha.indexOf(Character.toLowerCase(key.charAt(i % key.length())));  // finds the 0-indexed position (keyPos) of a specific character from a key string within a reference string
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
                int keyPos = alpha.indexOf(Character.toLowerCase(key.charAt(i % key.length()))); //Finds the position of the current key character, repeating the key if it is shorter than the text.
                int keyVal = (charPos - keyPos + 26) % 26; //Subtracts the key shift from the encrypted character position
                result.append(alpha.charAt(keyVal)); // Handles negative results
            }
        }
        return result.toString();
    }
}
