import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sendSmsTest {
    @Test
    void send() {
    }

    @Test
    void it_should_return_false_if_message_is_Null() {
        user testUser = new user();
        assert(sendSms.send(testUser,null)).equals(false);
    }

    @Test
    void it_should_return_false_if_message_is_empty() {
        user testUser = new user();
        assert(sendSms.send(testUser, "")).equals(false);
    }

    @Test
    void it_should_return_false_if_user_is_Null(){
        assert(sendSms.send(null, "Hello")).equals(false);
    }

    @Test
    void it_should_return_false_if_user_email_address_is_Null(){
        user testUser = new user();
        assert(sendSms.send(testUser, "Hello")).equals(false);
    }

    @Test
    void it_should_return_false_if_user_and_message_is_Null(){
        assert(sendSms.send(null, null)).equals(false);
    }

    @Test
    void it_should_return_false_if_phone_number_starts_with_zero(){
        user testUser = new user();
        testUser.setPhoneNumber("05325320000");
        assert(sendSms.send(testUser, "Hello")).equals(false);
    }
}