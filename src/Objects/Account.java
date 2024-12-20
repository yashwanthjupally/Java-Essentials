package Objects;
//Records are simple objects of data class with only fields
public record Account(
        int id,
        int customerId,
        String type,
        double balance) {}

// fields are defined in class declaration
// No need of any getters and setters
// they can be instantiated just like classes

class Record{
    public static void main(String[] args) {
        Account account = new Account(13312, 2142, "Savings", 55302.7);

        // Records are immutable
        //We can access them directly
        System.out.println(account.balance());

    }
}

// Records are great for modelling simple domain classes where you want to set the state of
// object once and then be able to access the state later in a program
//  These type of classes generally refer to as POJOs(Plain Old Java Objects)