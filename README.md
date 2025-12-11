# 📚 Sistema de Gerenciamento de Biblioteca (CRUD)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![JUnit5](https://img.shields.io/badge/JUnit5-25A162?style=for-the-badge&logo=junit5&logoColor=white)
![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)

## 📖 Sobre o Projeto
Este repositório contém a implementação de um sistema para gestão de bibliotecas. O foco principal é a aplicação de conceitos de **Orientação a Objetos** e **Testes Automatizados** para gerenciar o acervo e o fluxo de empréstimos.

## 🛠️ Funcionalidades e Regras de Negócio

### 📕 Livros e Autores
- Cadastro de livros com ISBN, título e autor.
- **Validação:** Não permite cadastro de livros com ISBN duplicado ou dados em branco.
- Controle de disponibilidade (status: Disponível / Emprestado).

### 👥 Membros (Usuários)
- Registro de membros da biblioteca.
- **Regra:** Validação de cadastro único (CPF/Matrícula).

### 📅 Empréstimos e Devoluções
- O coração do sistema. Gerencia a saída e entrada de livros.
- **Regra de Estoque:** Impede o empréstimo de um livro que já está emprestado.
- **Integridade:** Garante que o livro devolvido volta ao status de "Disponível" automaticamente.

## 🧪 Estratégia de Testes
A suíte de testes (JUnit 5) foi desenhada para cobrir cenários críticos:
1. **Empréstimo com Sucesso:** Verifica se o livro muda de status e se associa ao membro correto.
2. **Tentativa de Empréstimo Inválido:** Tentar pegar um livro indisponível deve lançar exceção (`IllegalStateException`).
3. **Dados Inválidos:** Tentar criar um livro sem Título deve lançar `IllegalArgumentException`.

## 🚀 Como Executar
1. Clone o repositório:
   ```bash
   git clone [https://github.com/phthedevx/CRUDBliblioeteca.git](https://github.com/phthedevx/CRUDBliblioeteca.git)
