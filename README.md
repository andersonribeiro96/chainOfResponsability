# Estudo do Padrão Chain of Responsibility
Este projeto foi desenvolvido como um estudo para entender e demonstrar o funcionamento do padrão de projeto Chain of Responsibility. O objetivo é mostrar como este padrão pode ser utilizado para criar uma cadeia de handlers, onde cada handler realiza uma parte do processamento de uma solicitação e, se necessário, passa o controle para o próximo handler na cadeia.

## Classes e Responsabilidades

O projeto consiste em um sistema de pagamento simplificado que passa por três etapas principais:
- **PaymentHandler**: Classe abstrata que define a interface para todos os handlers da cadeia. Inclui métodos para definir o próximo handler (setNextHandler) e processar uma requisição de pagamento (handle).
- **ValidationHandler**: Verifica se a requisição de pagamento é válida com base no saldo disponível.
- **AuthorizationHandler**: Verifica se a requisição de pagamento está autorizada.
- **FinalPaymentHandler**: Processa o pagamento se todos os critérios anteriores forem atendidos.
