class Main {
    public static void main(String[] args) {
        // Criando os handlers
        PaymentHandler validationHandler = new ValidationHandler();
        PaymentHandler authorizationHandler = new AuthorizationHandler();
        PaymentHandler finalPaymentHandler = new FinalPaymentHandler();

        // Configurando ciclo
        validationHandler.setNextHandler(authorizationHandler);
        authorizationHandler.setNextHandler(finalPaymentHandler);

        // Criando requisições de pagamento
        PaymentRequest request1 = new PaymentRequest(100, 500, true); // Pagamento válido e autorizado
        PaymentRequest request2 = new PaymentRequest(1000, 500, true); // Saldo insuficiente
        PaymentRequest request3 = new PaymentRequest(100, 500, false); // Pagamento não autorizado

        // Processando requisições de pagamento
        System.out.println("Request 1:");
        validationHandler.handle(request1);

        System.out.println("\nRequest 2:");
        validationHandler.handle(request2);

        System.out.println("\nRequest 3:");
        validationHandler.handle(request3);
    }
}