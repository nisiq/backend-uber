1 Dependencies
2 Camada Core = reunir a regra de negocios da nossa aplicacao e os casos de uso
        define oq nosso app faz, mas nao como ele faz
camada core nao conhece nada, nucleo

3 Application = camada de aplicacao
                implementacao dos nossos casos de uso
  a camada aplication so conhece a camada core             


4 interface adapters = adaptar o mundo de fora pra uma interface
                e minha aplicacao dependera dessa interface e nao do mundo de fora
                application dependera da interface

5. camada de infraestrutura - responsavel por interagir com servicos e estruturas externas
        comunicao com aws ses

6. exception fazem parte do CORE!!!


7 controllers -  

8 - config SDK AWS 