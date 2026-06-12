# Intro Spring Boot

Essa é uma API introdutória construída com Spring Boot, demonstrando conceitos básicos do framework, como endpoints REST, DTOs e tratamento de parâmetros.

---

## Objetivos da API

Essa API serve como um laboratório para introdução ao Spring Boot, oferecendo endpoints para:

- Saudação inicial (`/hello`)
- Perfil de usuário (`/user/*`)
- Operações básicas de calculadora (`/soma`, `/subtracao`, `/multiplicacao`, `/divisao`)
- Exibição de informações de aluno (`/aluno`) e professor (`/professor`)

---

## Testes dos Endpoints

### 1. Aluno
* **URL:** `http://localhost:8080/aluno`
* **Retorno:**
![Screenshot 1](docs/screenshots/endpoint1.png)

### 2. Professor
* **URL:** `http://localhost:8080/professor`
* **Retorno:**
![Screenshot 2](docs/screenshots/endpoint2.png)

### 3. Calculadora
* **Soma:**
* **URL:** `http://localhost:8080/calculadora?a=10&b=5&operacao=soma`
* **Retorno:**
![Screenshot 3](docs/screenshots/endpoint3.1.png)
* **Subtração:**
* **URL:** `http://localhost:8080/calculadora?a=10&b=5&operacao=subtracao`
* **Retorno:**
![Screenshot 4](docs/screenshots/endpoint3.2.png)
* **Multiplicação:**
* **URL:** `http://localhost:8080/calculadora?a=10&b=5&operacao=multiplicacao`
* **Retorno:**
![Screenshot 5](docs/screenshots/endpoint3.3.png)
* **Divisão:**
* **URL:** `http://localhost:8080/calculadora?a=10&b=5&operacao=divisao`
* **Retorno:**
![Screenshot 6](docs/screenshots/endpoint3.4.png)

---

## Como Rodar

Para executar localmente, você pode utilizar o Maven Wrapper incluso no repositório.

### No Linux/macOS:
```bash
./mvnw spring-boot:run
```

### No Windows:
```powershell
.\mvnw spring-boot:run
```
