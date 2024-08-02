public class ValidationHandler extends PaymentHandler {
    @Override
    public void handle(PaymentRequest request) {
        if (request.getAmount() <= request.getBalance()) {
            System.out.println("Payment is valid.");
            if (nextHandler != null) {
                nextHandler.handle(request);
            }
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}