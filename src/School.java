public abstract class School {
    int quantity;
    String classy;
    public String getClassy() {
        return classy;
    }

    public void setClassy(String classy) {
        this.classy = classy;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public School(String classy, int quantity) {
        this.classy = classy;
        this.quantity = quantity;
    }
}


