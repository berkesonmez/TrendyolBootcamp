import java.util.regex.Pattern;

public class user {
    private String firstName;
    private String sirName;
    private String email;
    private String phoneNumber;
    private int maxEmailLimit = 10000;
    private int maxSmsLimit = 1000;
    private int emailCounter;
    private int smsCounter;
    private Boolean isEmailLimitExceeded = false;
    private Boolean isSmsLimitExceeded = false;

    public Boolean getEmailLimitExceeded() {
        return isEmailLimitExceeded;
    }



    public Boolean getSmsLimitExceeded() {
        return isSmsLimitExceeded;
    }


    public int getEmailCounter() {
        return emailCounter;
    }

    public Boolean incrementEmailCounter() {
        if(this.emailCounter < maxEmailLimit) {
            ++this.emailCounter;
            return true;
        }
        System.out.println("E-mail counter exceeded maximum limit");
        this.isEmailLimitExceeded = true;
        return false;
    }

    public int getSmsCounter() {
        return smsCounter;
    }

    public Boolean incrementSmsCounter() {
        if(this.smsCounter < maxSmsLimit) {
            ++this.smsCounter;
            return true;
        }
        System.out.println("Sms counter exceeded maximum limit");
        this.isSmsLimitExceeded = true;
        return false;

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSirName() {
        return sirName;
    }

    public void setSirName(String sirName) {
        this.sirName = sirName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        /*\w+@\w+\.\w+*/
        Boolean isEmailLegal = Pattern.compile("\\w+@\\w+\\.\\w+", Pattern.CASE_INSENSITIVE).matcher(email).matches();
        if(isEmailLegal){
            this.email = email;
        }else{
            System.out.println("Email is not legal");
        }
    }

    @Override
    public String toString() {
        return "user{" +
                "firstName='" + firstName + '\'' +
                ", sirName='" + sirName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", maxEmailLimit=" + maxEmailLimit +
                ", maxSmsLimit=" + maxSmsLimit +
                ", emailCounter=" + emailCounter +
                ", smsCounter=" + smsCounter +
                ", isEmailLimitExceeded=" + isEmailLimitExceeded +
                ", isSmsLimitExceeded=" + isSmsLimitExceeded +
                '}';
    }
}
