# 📚 FórumHub - API REST

## 📝 Sobre o Projeto
O **FórumHub** é uma API REST desenvolvida com **Spring Boot** que permite gerenciar tópicos e respostas de um fórum.  
O sistema possibilita **criar, listar, atualizar e excluir tópicos**, além de cadastrar respostas relacionadas a cada tópico.

Este projeto foi desenvolvido como parte do **Challenge Back End** da **Alura**.

---

## 🚀 Funcionalidades
- ✅ Criar um novo tópico  
- ✅ Listar todos os tópicos  
- ✅ Buscar um tópico específico  
- ✅ Atualizar um tópico existente  
- ✅ Deletar um tópico  
- ✅ Criar respostas para um tópico  
- ✅ Listar respostas de um tópico

---

## 🛠 Tecnologias Utilizadas
- **Java 22**
- **Spring Boot 3.5.4**
- **Spring Web**
- **Spring Data JPA**
- **Flyway** *(migrations)*
- **MySQL**
- **Lombok**
- **Maven**

---

## 🔗 Endpoints da API

GET	/topicos	Lista todos os tópicos

GET	/topicos/{id}	Retorna um tópico específico

POST	/topicos	Cria um novo tópico

PUT	/topicos/{id}	Atualiza um tópico

DELETE	/topicos/{id}	Remove um tópico


## ▶ Como Rodar o Projeto
Pré-requisitos

Java 22+

Maven

MySQL

IntelliJ IDEA

## Passos
Clonar o repositório
git clone https://github.com/seu-usuario/forumhub.git

 Entrar na pasta do projeto
cd forumhub

 Instalar dependências
mvn clean install

 Rodar a aplicação
mvn spring-boot:run


A aplicação estará disponível em:

http://localhost:8080

