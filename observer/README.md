# Observer

> **Tipo de Padrão:** Comportamental
>
> O padrão *Observer* permite definir um mecanismo de assinatura, onde os assinantes podem receber os eventos gerados pelo objeto assinado.


O padrão *Observer* sugere que exista um `Assunto` ou `Publicador` que possui um mecanismo de assinatura, onde os `Observadores` ou `Assinantes` possam se cadastrar ou descadastrar do recebimento de notificações de eventos gerados pelo `Publicador`.

Os `Publicadores` devem enviar seus eventos através de uma interface que possui um método de notificação com os parâmetros a serem enviados, assim, os `Assinantes` devem implementar essa interface para receber as notificações dos eventos.