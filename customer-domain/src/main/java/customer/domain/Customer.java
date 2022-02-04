package customer.domain;

import java.util.Objects;

public class Customer {
    private final Identity identity;
    private Fullname fullname;
    private Age age;
    private Location location;
    private Interests interests;
    private Email email;
    private Epurse epurse;
    private Username username;
    private Password password;
    private IsAdmin isAdmin;

    public Customer(Identity identity, Fullname fullname, Age age, Location location, Interests interests, Email email, Epurse epurse, Username username, Password password, IsAdmin isAdmin) {
        this.identity = identity;
        this.fullname = fullname;
        this.age = age;
        this.location = location;
        this.interests = interests;
        this.email = email;
        this.epurse = epurse;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public Identity getIdentity() {
        return identity;
    }

    public Fullname getFullname() {
        return fullname;
    }

    public void setFullname(Fullname fullname) {
        this.fullname = fullname;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Interests getInterests() {
        return interests;
    }

    public void setInterests(Interests interests) {
        this.interests = interests;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Epurse getEpurse() {
        return epurse;
    }

    public void setEpurse(Epurse epurse) {
        this.epurse = epurse;
    }

    public Username getUsername() {
        return username;
    }

    public void setUsername(Username username) {
        this.username = username;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    public IsAdmin getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(IsAdmin isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return identity.equals(customer.identity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identity);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "identity=" + identity +
                ", fullname=" + fullname +
                ", age=" + age +
                ", location=" + location +
                ", interests=" + interests +
                ", email=" + email +
                ", epurse=" + epurse +
                ", username=" + username +
                ", password=" + password +
                ", isAdmin=" + isAdmin +
                '}';
    }

    public static class Builder {
        private Identity identity;
        private Fullname fullname;
        private Age age;
        private Location location;
        private Interests interests;
        private Email email;
        private Epurse epurse;
        private Username username;
        private Password password;
        private IsAdmin isAdmin;

        public Builder identity(String value) {
            this.identity = Identity.of(value);
            return this;
        }
        public Builder fullname(String value){
            this.fullname = Fullname.of(value);
            return this;
        }
        public Builder age(int value) {
            this.age = Age.of(value);
            return this;
        }
        public Builder location(String value){
            this.location = Location.of(value);
            return this;
        }
        public Builder interest(String value){
            this.interests = Interests.valueOf(value);
            return this;
        }
        public Builder email(String value) {
            this.email = Email.of(value);
            return this;
        }
        public Builder epurse(int value) {
            this.epurse = Epurse.of(value);
            return this;
        }
        public Builder username(String value) {
            this.username = Username.of(value);
            return this;
        }
        public Builder password(String value) {
            this.password = Password.of(value);
            return this;
        }
        public Builder isAdmin(Boolean value){
            this.isAdmin = IsAdmin.of(value);
            return this;
        }
        public Customer build() {
            var customer = new Customer(identity, fullname, age, location, interests, email, epurse, username, password, isAdmin);
            return customer;
        }

    }
}
