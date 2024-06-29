Clean Architecture

### 1 Dependências
dependências principais do projeto


### 2 Camada Core
é o coração da aplicação, onde reside a lógica de negócios e os casos de uso. Ela define o que a aplicação faz, sem se preocupar com como isso é implementado. Esta camada não conhece detalhes da infraestrutura externa, sendo o núcleo isolado e independente


### 3 Camada de Aplicação
A camada de Aplicação implementa os casos de uso definidos na camada Core. Ela atua como um intermediário entre a camada Core e os adaptadores de interface, conhecendo apenas o que está definido no núcleo da aplicação


### 4 Adaptadores de Interface
Esta camada é responsável por adaptar o mundo externo à aplicação para interfaces que são consumidas pela camada de Aplicação. Isso permite que a aplicação dependa apenas dessas interfaces, em vez de se acoplar diretamente com componentes externos


### 5 Camada de Infraestrutura
A camada de Infraestrutura lida com a interação da aplicação com serviços externos e estruturas, como bancos de dados, serviços na nuvem (como AWS SES, por exemplo), sistemas de arquivos, entre outros


### 6 Exceções
As exceções são parte integrante da camada Core. Elas devem ser tratadas de forma adequada dentro do núcleo da aplicação para manter a consistência e o fluxo controlado do programa


### 7 Controllers
Os controllers são responsáveis por receber as requisições externas e encaminhá-las para os casos de uso apropriados na camada de Aplicação
