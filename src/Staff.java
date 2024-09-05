class Staff extends Person {
    public Staff(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Staff: " + super.toString();
    }
}
