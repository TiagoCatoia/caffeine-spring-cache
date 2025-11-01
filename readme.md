# Caffeine Spring Cache

Este é um projeto de demonstração que mostra como implementar e utilizar o cache Caffeine com Spring Boot.

## Sobre o Projeto

Este projeto demonstra a implementação de cache utilizando a biblioteca Caffeine em uma aplicação Spring Boot. O cache é uma técnica que armazena dados temporariamente para melhorar o desempenho das aplicações, reduzindo o tempo de resposta e diminuindo a carga no banco de dados.

## Requisitos

- Java 21
- Maven
- Node.js (para executar os testes de performance com k6)

## Como Executar o Projeto

### Passo 1: Clonar o Repositório

```bash
git clone https://github.com/TiagoCatoia/caffeine-spring-cache
cd caffeine-spring-cache
```

### Passo 2: Compilar e Executar a Aplicação

```bash
mvn spring-boot:run
```

A aplicação será iniciada na porta 8080.

## Endpoints Disponíveis

### Endpoint sem Cache

```
GET /order/no-cache/{id}
```

Este endpoint retorna informações de um pedido sem utilizar cache. Cada requisição simula uma consulta lenta ao banco de dados (200ms).

## Testes de Performance

O projeto inclui scripts de teste de performance utilizando k6 para demonstrar a diferença entre endpoints com e sem cache.

### Instalação do k6

```bash
npm install k6
```

### Executando os Testes de Performance

#### Teste sem Cache

```bash
k6 run src/test/java/com/example/caffeine_spring_cache/performance/no-cache.js
```

Este teste simula 50 usuários virtuais fazendo requisições ao endpoint sem cache por 20 segundos.

#### Teste com Cache (Implementação Pendente)

```bash
k6 run src/test/java/com/example/caffeine_spring_cache/performance/with-cache.js
```

Este teste simula 50 usuários virtuais fazendo requisições ao endpoint com cache por 20 segundos.

**Nota:**
- O endpoint com cache (`/order/with-cache/{id}`) não está implementado na branch main.
- Para acessar a versão completa, basta utilizar a branch 'exercicio-completo'