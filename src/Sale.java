class Sale {
    private Customer customer;
    private double serviceAmount;
    private double productAmount;

    public Sale() {
        // Default constructor
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setServiceAmount(double serviceAmount) {
        this.serviceAmount = serviceAmount;
    }

    public void setProductAmount(double productAmount) {
        this.productAmount = productAmount;
    }

    public double getTotalBill() {
        double total = serviceAmount + productAmount;
        double serviceDiscountRate = customer.getServiceDiscountRate(customer.getType());
        double productDiscountRate = customer.getProductDiscountRate(customer.getType());

        // Apply discounts
        double discountedServiceAmount = serviceAmount * (1 - serviceDiscountRate);
        double discountedProductAmount = productAmount * (1 - productDiscountRate);

        return discountedServiceAmount + discountedProductAmount;
    }
}

