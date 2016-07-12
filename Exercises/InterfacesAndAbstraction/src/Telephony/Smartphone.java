package Telephony;

/**
 * Created by Niki on 11.7.2016 г..
 */
public class Smartphone implements Browsable, Callable {

    public Smartphone() {

    }

    @Override
    public void browse(String url) {
        if (isValidURL(url)) {
            System.out.printf("Browsing: %s!%n", url);
        } else {
            System.out.println("Invalid URL!");
        }

    }

    @Override
    public void call(String number) {
        if (this.isValidNumber(number)) {
            System.out.println("Calling... " + number);
        } else {
            System.out.println("Invalid number!");
        }
    }

    private boolean isValidURL(String url){
        for (int i = 0; i < url.length(); i++) {
            if (Character.isDigit(url.charAt(i))){
                return false;
            }
        }
        return true;
    }

    private boolean isValidNumber(String number){
        for (int i = 0; i < number.length(); i++) {
            if (Character.isLetter(number.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
