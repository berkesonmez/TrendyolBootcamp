import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sendEmailTest {


    @Test
    void it_should_return_false_if_message_is_Null() {
        user testUser = new user();
        assert(sendEmail.send(testUser,null)).equals(false);
    }

    @Test
    void it_should_return_false_if_message_is_Empty() {
        user testUser = new user();
        assert(sendEmail.send(testUser, "")).equals(false);
    }

    @Test
    void it_should_return_false_if_user_is_Null(){
        assert(sendEmail.send(null, "Hello")).equals(false);
    }

    @Test
    void it_should_return_false_if_user_and_message_is_Null(){
        assert(sendEmail.send(null, null)).equals(false);
    }
}