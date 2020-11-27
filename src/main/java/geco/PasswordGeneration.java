package geco;

public class PasswordGeneration {

    public PasswordGeneration(){

    }

    public String generatePassword() {
        int codePoints[] = new int[8];
        int nbRand;
        for (int i = 0; i < codePoints.length; i++) {
            nbRand = (int) Math.floor(Math.random()*78);
            codePoints[i] = nbRand + 48;
        }

        StringBuilder builder = new StringBuilder(codePoints.length);
        for (int codePoint : codePoints) {
            builder.append(Character.toChars(codePoint));
        }
        return builder.toString();
    }

}
