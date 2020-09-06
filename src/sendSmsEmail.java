public class sendSmsEmail {
    /*
    * Kullanici bilgilerine gore kullaniciya sms ve email gonderen bir sinif tasarlayalim. Burada bir kullanici maximum 1000 sms ve 10000 email gonderebilir. Bu gonderimleri yalniz sms ya da yalniz email seklinde yapabilecegi gibi ikisini birdende gonderebilir.
    * Single responsibility ilkesine dikkat ederek bu fonksiyonlari tasarlayalim ve unit testlerini yazalim.
    * */
    public static void main(String[] args) {
        user a = new user();
        a.setFirstName("John");
        a.setSirName("Doe");
        a.setEmail("a@b.com");
        a.setPhoneNumber("05320000000");
        System.out.println(a.toString());



        for(int i = 0; i < 100444; i++){
            Boolean smsResult =  sendSms.send(a, "hello");
            Boolean emailResult = sendEmail.send(a, "hello");
            if(!smsResult && !emailResult)
                break;

        }
    }
}
