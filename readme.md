# Car Workshop API

## Introdução

Rest API escrita em Java para a administração dos processos dentro de uma concessionária automotiva. Envolvendo o cadastro dos vendedores, dos clientes, veículos, autenticação dos usuários e pedidos.

## Tecnologias utilizadas

Com o objetivo de aproveitar ao máximo a oportunidade de trabalhar com recursos modernos, optamos por utilizar o *Azure DevOps* para gerenciar o versionamento do código e a distribuição das tarefas, a combinação *Hibernate* e *JPA* para administrar a persistência dos dados da aplicação desenvolvida com o *Spring Boot* e uma instância docker hospedada com o *Azure Docker Registry* rodando uma imagem do *PostgreSql*.

### Como rodar o projeto 

#### PostgreSql

O primeiro passo é subir o container Docker com a imagem do postgresql. Caso o Postgresql a ser utilizado esteja instalado numa máquina local, basta possuir os dados de conexão e pular a configuração do Docker abaixo. 

    $ docker run --name some-postgres -e POSTGRES_PASSWORD=mysecretpassword -d postgres

#### Configuração das propriedades da aplicação

No arquivo /src/main/resources/application.properties, atualize as seguintes propriedades informando os dados de conexão:

```Java
spring.datasource.url=jdbc:postgresql://{postgresqlurl}:{customport}/postgres
spring.datasource.username=postgres
spring.datasource.password=mysecretpassword
```

Pronto, agora basta iniciar o projeto.

```bash
$ ./mvnw spring-boot:run
```

Com isso a aplicação iniciará na url: https://localhost:8080.

### Swagger

Utilizamos Swagger nessa aplicação para facilitar o uso da API, ele pode ser acessado pela url: https://localhost:8080/swagger-ui.html

Exemplo da interface do Swagger:

<img src="https://github.com/maateuss/carworkshopapi/blob/master/swaggerimg.png?raw=true">

### Grupo

O projeto foi composto pelos seguintes integrantes:

|Nome|RA|
|--|--|
|Mateus Moura Santos|081170014|
|Fábio Ceolin|081170003|
|Matheus Barreto|081170038|
|Matheus Alberto|081170016|
