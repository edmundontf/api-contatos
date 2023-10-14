# API de Contatos

Bem-vindo à API de Contatos! Esta é uma API RESTful desenvolvida em Spring Boot para gerenciar informações de contatos.
Use esta documentação para entender como a API funciona e como interagir com ela.

### Pré-requisitos

Para executar este projeto, certifique-se de ter o seguinte instalado:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Apache Maven](https://maven.apache.org/download.cgi)
- [Spring Boot](https://spring.io/projects/spring-boot)

### Configuração

1. Clone este repositório: `git clone https://github.com/seu-usuario/api-contatos.git`
2. Navegue até o diretório do projeto: `cd api-contatos`
3. Execute o projeto: `./mvnw spring-boot:run`

O projeto estará disponível em `http://localhost:8082`, Mas caso você queira alterar, remova a porta do arquivo
`Application.yaml`.

## Uso da API

### Recursos Disponíveis

A API oferece os seguintes recursos:

#### Cria um novo contato
```
POST /api/contatos 

Body
{
  "nome": "Edmundo Faria ",
  "email": "edmundofaria@qualquer.com.br",
  "numeroTelefone": "+55 1234567890"
}
```
#### Obter todos os contatos
```
GET /api/contatos 
```
#### Obtem contato por Id
```
GET /api/contatos/{id} 
```
#### Atualiza contato por id
```
GET /api/contatos/{id} 

Body

{
  "nome": "Edmundo Faria jr ",
  "email": "edmundofaria@qualquer.com.br",
  "numeroTelefone": "+55 1234567890"
}
```
#### Exclui contato contato por Id
```
GET /api/contatos/{id} 
```
