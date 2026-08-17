
class Mobile {

    void EnterPin() {
        System.out.println("Pin Entered");
    }

    Screen unlock() {
        Screen s = new Screen();
        System.out.println("Mobile unlocked");
        return s;
    }
}

class Pin {
}

class Screen {
}

class User {

    public static void main(String[] args) {
        Mobile m = new Mobile();
        Pin p = new Pin();
        m.EnterPin();
        Screen s = m.unlock();
        System.out.println(s);
        if (s != null) {
            System.out.println("Mobile is ready to use");
        }
    }
}
