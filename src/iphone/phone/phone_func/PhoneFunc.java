package iphone.phone.phone_func;

import iphone.phone.Phone;

public class PhoneFunc implements Phone {
    @Override
    public String call (String number) {
        System.out.println (number);
        return number;
    }

    @Override
    public void answerThePhone () {
        System.out.println ("Answer the call");
    }

    @Override
    public void voiceMail () {
        System.out.println ("Answer Voice Mail");
    }
}
