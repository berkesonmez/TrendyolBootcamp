public class sendSms {
    public static Boolean send(user user, String message){
        if (messageValidation(user, message)) return false;

        if(user.getSmsLimitExceeded()) {
            System.out.println("Sms limit exceeded cannot send");
            return false;
        }
        user.incrementSmsCounter();
        System.out.println("Sent sms " + user.getSmsCounter());
        return true;
    }

    static boolean messageValidation(user user, String message) {
        if (message == null && user == null) {
            System.out.println("User and message is null");
            return true;
        }
        if(message == null){
            System.out.println("Message is null");
            return true;
        }
        if (message.isEmpty()) {
            System.out.println("Message is empty");
            return true;
        }
        if (user == null) {
            System.out.println("User is null");
            return true;
        }
        if (user.getEmail() == null) {
            System.out.println("User has no e-mail address");
            return true;
        }
        return false;
    }
}
