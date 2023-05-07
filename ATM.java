class User {
    private String name;
    private String userId;
    private String userPin;
    private double balance;

    public User(String name, String userId, String userPin, double balance) {
        this.name = name;
        this.userId = userId;
        this.userPin = userPin;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserPin() {
        return userPin;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void transfer(double amount, User recipient) {
        balance -= amount;
        recipient.deposit(amount);
    }
}
