# First Spring Boot API

API REST simples desenvolvida com Java e Spring Boot, com foco em aprendizado de conceitos fundamentais de backend. O projeto demonstra a criação de endpoints utilizando `@RestController`, injeção de dependência com `@Service`, configuração de beans com `@Configuration`, e manipulação de dados com `@RequestBody`, `@PathVariable` e `@RequestParam`.

---

## 🚀 Tecnologias utilizadas

- Java 17+
- Spring Boot
- Maven
- Lombok

---

## 📁 Estrutura de pacotes

```
com.hebert.first_spring_app
├── configuration       # Beans manuais com @Configuration e @Bean
├── controller          # Endpoints REST (HelloWorldController)
├── domain              # Entidades do projeto (User)
├── service             # Lógica de negócio (HelloWorldService)
```

---

## 📌 Endpoints disponíveis

### ✅ GET `/hello-world`

Retorna uma mensagem padrão com nome fixo no serviço.

**Exemplo de resposta:**
```
Hello World Hebert
```

---

### ✅ POST `/hello-world/{id}?filter=valor`

Recebe um corpo JSON com nome e e-mail, além de parâmetros de caminho e query string.

**Request Body:**
```json
{
  "name": "Hebert",
  "email": "hebert@email.com"
}
```

**Exemplo de chamada:**
```
POST http://localhost:8080/hello-world/123?filter=ativo
```

**Resposta esperada:**
```
Hello World Hebert Id: 123 Filter: ativo
```

---

## 🛠️ Como executar

1. Clone o repositório:
```bash
git clone https://github.com/hebertesteves/first-spring-boot-api.git
```

2. Importe o projeto no IntelliJ ou Eclipse como projeto Maven.

3. Execute a classe `FirstSpringAppApplication.java`.

4. Acesse: `http://localhost:8080/hello-world`

---

## 🎯 Objetivos de aprendizado

- Estruturação de projeto com Spring Boot
- Criação de APIs REST com `@RestController`
- Injeção de dependência com `@Autowired`
- Manipulação de JSON com `@RequestBody`
- Uso de parâmetros com `@PathVariable` e `@RequestParam`
- Configuração de beans manuais com `@Bean`
