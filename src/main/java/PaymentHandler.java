public abstract class PaymentHandler {
    protected PaymentHandler nextHandler;

    public void setNextHandler(PaymentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(PaymentRequest request);
}