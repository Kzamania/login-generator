package geco;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PasswordGeneration {

    /**
     * longueur du mot de passe.
     */
    private final int lenghtPwd = 8;

    /**
     * constructeur.
     */
    public PasswordGeneration(){}

    /**
     * Password generation (not sage)
     * @return new random password (lenght = 8)
     */
    public String getRandomPassword(){

        Random r = new Random();
        //List<String> password = new ArrayList<String>();
        String password ="";
        //String alphabet = "123xyz";
        for (int i = 0; i < lenghtPwd; i++) {
            //System.out.println(alphabet.charAt(r.nextInt(alphabet.length())));
                 password += (char)(r.nextInt(26) + 'a');
        }
        return password;
    }
}
