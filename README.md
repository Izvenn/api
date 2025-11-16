# Tarefas CRUD - REST API

Este projeto implementa uma **API REST simples** para gerenciamento de tarefas, utilizando uma arquitetura baseada em **DTOs, Facades e Controllers**.

---

## Arquitetura

O projeto segue a seguinte estrutura de camadas:

1. **Controller**
   - Responsável por receber requisições HTTP e retornar respostas.
   - Exposição de endpoints REST (GET, POST, PUT, DELETE).
   - Não contém lógica de negócio, apenas orquestra chamadas para a camada de Facade.

2. **Facade**
   - Atua como intermediário entre o Controller e a lógica de negócio.
   - Simplifica a interface para o Controller.
   - Orquestra chamadas a serviços internos ou repositórios.

3. **DTO (Data Transfer Object)**
   - Objetos utilizados para transportar dados entre as camadas.
   - Separação entre a representação externa (API) e a lógica interna.

---

## Funcionalidades

A API permite gerenciar tarefas com as seguintes operações:

| Método HTTP | Endpoint           | Descrição                    |
|-------------|-----------------|-------------------------------|
| POST        | `/tarefas`       | Criar uma nova tarefa         |
| GET         | `/tarefas`       | Listar todas as tarefas      |
| PUT         | `/tarefas/{id}`  | Atualizar uma tarefa existente|
| DELETE      | `/tarefas/{id}`  | Deletar uma tarefa            |

---

## Estrutura de uma Tarefa (DTO)

Exemplo de representação de uma tarefa:

```json
{
  "id": 1,
  "title": "Compras",
  "description": "Fazer compra mensal"
}
