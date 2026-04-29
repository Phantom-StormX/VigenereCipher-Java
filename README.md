# Vigenere Cipher project
## By Izzy(@Phantom-StormX) Elliott(ElliottandCoachGeorge) and Liam 
## HEAVELY inspired by the Caeser Cipher project i made.

#### Purpose
- This is a vigerne cipher with a instant encryptor and decoder it makes it where you can instantly Encrypt a message with a code or enter a code and decode a message instantly 

#### Features
- Encode button to code message based on key text box input 
- Decode button to code message based on key text box input
- Input text box to place encoded/decoded message
- Output text box to show neww encoded/decoded message
- Submit button to run button
  
#### Class Structure
- VigenereController
  - Connects the engine and fxml together
- VigenereEngine
  - Logic behind the Caeser Cipher
- Launcher
  - Launches all connected classes
- Main
  - Combines both fxml and controller together into one "Stage"
- Vigenere-View.fxml
  - Basically the "view" of the project. Uses fxml to create the gui
  
#### How it Works
1. The user interacts with the input textbox, interacts with the key textbox then either presses the encode or decode button.
2. Button clicks get interpreted through the controller class, which then sends the information given by the user to the engine.
3. Information gets evaluated and "solved" in the engine
4. The fxml updates and shows the result of the users input.

#### Challenges
- learning about the Vigenere cipher, how it is different from caeser ciphers, and how to make it function in java code.

#### Credentials 
- https://www.geeksforgeeks.org/dsa/vigenere-cipher/
  - Logic inspo :)
- @ElliottAndCoachGeorge made the gui, thanks man :)
