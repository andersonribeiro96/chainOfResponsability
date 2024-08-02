public class AuthorizationHandler extends PaymentHandler {
    @Override
    public void handle(PaymentRequest request) {
        if (request.isAuthorized()) {
            System.out.println("Payment is authorized.");
            if (nextHandler != null) {
                nextHandler.handle(request);
            }
        } else {
            System.out.println("Payment is not authorized.");
        }
    }
}