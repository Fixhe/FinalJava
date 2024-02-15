class Customer implements DiscountRate {
    private String type;

    public Customer() {
        // Default constructor
    }

    @Override
    public double getServiceDiscountRate(String type) {
        switch (type) {
            case "Premium":
                return 0.20;
            case "Gold":
                return 0.15;
            case "Silver":
                return 0.10;
            default:
                return 0.0;
        }
    }

    @Override
    public double getProductDiscountRate(String type) {
        switch (type) {
            case "Premium":
            case "Gold":
            case "Silver":
                return 0.10;
            default:
                return 0.0;
        }
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}