package com.phantomstormx.vigenerecipherjava;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
public class VigenereController {

    //connects objects from fxml to controller
    @FXML
    private TextArea  inputText;

    @FXML
    private TextField keyField;

    @FXML
    private TextArea  outputText;

    @FXML
    private void handleEncrypt() {
        String text = inputText.getText(); // yoinks the text input
        String key  = parseKey(); // yoinks the key input
        if (key == null) return; // invalid input — message already shown

        if (text == null || text.isEmpty()) { // pretty self-explanatory
            outputText.setText("Please enter some text to encode.");
            return;
        }
        outputText.setText(VigenereEngine.encrypt(text, key));
    }
    @FXML
    private void handleDecode() {
        String text = inputText.getText();
        String key  = parseKey();
        if (key == null) return;
        if (text == null || text.isEmpty()) {
            outputText.setText("Please enter some text to decode.");
            return;
        }
        outputText.setText(VigenereEngine.decrypt(text, key));
    }
    // Reads the key field and returns null on invalid input (and writes a message).
    private String parseKey() {
        String key = keyField.getText();
        if (key == null || key.trim().isEmpty()) {
            outputText.setText("Please enter a key (letters only, ex: \"lemon\")");
            return null;
        }
        key = key.trim();
        if (!key.matches("[A-Za-z]+")) {
            outputText.setText("Key must contain letters only");
            return null;
        }
        return key;
    }
    @FXML
    private void handleClear() {
        inputText.clear();
        outputText.clear();
        keyField.clear();
    }
    @FXML
    private void handleExit() {
        Platform.exit();
    }
}