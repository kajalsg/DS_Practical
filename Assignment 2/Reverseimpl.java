import ReverseModule.ReversePOA;

class Reverseimpl extends ReversePOA {
    Reverseimpl() {
        super();
        System.out.println("Reverse Object Created");
    }

    public String reverse_string(String name) {
        return "Server send: " + new StringBuilder(name).reverse().toString();
    }
}
