public class sendEmail {
    public static Boolean send(user user, String message){
        if (sendSms.messageValidation(user, message)) return false;
        if (sendSms.userValidation(user)) return false;
        if(user.getEmailLimitExceeded()) {
            System.out.println("Email limit exceeded cannot send");
            return false;
        }
        user.incrementEmailCounter();
        System.out.println("Sent e-mail " + user.getEmailCounter());

        return true;
    }
}
