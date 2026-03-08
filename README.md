# Planeta Literário

O **Planeta Literário** é um sistema de leitura digital que permite acessar uma variedade de livros de diferentes gêneros através de uma interface simples e intuitiva.

Este projeto tem como objetivo **estudo e desenvolvimento de portfólio**, explorando conceitos de arquitetura de software, interfaces gráficas e integração com serviços em nuvem.

---

# Tecnologias utilizadas

- **Linguagem:** Java  
- **Interface gráfica:** JavaFX  
- **Banco de dados:** PostgreSQL  
- **Arquitetura:** MVC (Model-View-Controller)  
- **Armazenamento de arquivos:** Google Drive  

---

# Arquitetura do sistema

O projeto utiliza o padrão **MVC (Model-View-Controller)** para separar responsabilidades e manter o código organizado.

## Model
Responsável por:

- Entidades do sistema
- Regras de negócio (BO)
- Acesso ao banco de dados (DAO)
- Manipulação de dados

## View
Responsável pela interface gráfica construída com **JavaFX**.

Inclui:

- Janelas do sistema
- Páginas da aplicação
- Elementos visuais e interação com o usuário

## Controller
Responsável por:

- Intermediar a comunicação entre **View** e **Model**
- Controlar eventos da interface
- Gerenciar o fluxo de dados entre as camadas

---

# Estrutura da aplicação

O sistema é dividido em duas camadas principais:

## Application
Responsável pela inicialização da aplicação.

Funções principais:

- Inicializar o sistema
- Carregar a primeira interface
- Configurar recursos globais da aplicação

## Entities
Contém a implementação da arquitetura **MVC**, incluindo:

- Models
- Controllers
- Regras de negócio
- Acesso a dados

---

# Fluxo de funcionamento

Atualmente o sistema possui duas janelas principais:

## Login
Tela responsável pela autenticação do usuário no sistema.

## Página inicial
Tela principal onde o usuário pode visualizar os livros disponíveis.

Além das janelas, o sistema também utiliza **páginas internas**, que são componentes carregados dinamicamente dentro das janelas.

Exemplos:

- Página inicial
- Página de leitura

---

# Sistema de livros

Os livros são armazenados em **PDF** e ficam hospedados no **Google Drive**, juntamente com suas respectivas capas.

Cada livro possui as seguintes informações:

- PDF do livro
- Imagem da capa
- Nome do livro
- Autor
- Sinopse
- Quantidade de páginas
- Tags de gênero

Esses dados permitem que o sistema organize e categorize os livros dentro da biblioteca.

---

# Sistema de administração

O sistema possui um **perfil de administrador**, protegido por autenticação em duas etapas.

O administrador possui funcionalidades adicionais, como:

- Adicionar novos livros
- Atualizar informações de livros
- Remover livros do acervo

Para realizar o upload de um novo livro, o administrador deve informar:

- Arquivo PDF do livro
- Imagem da capa
- Nome do livro
- Autor
- Sinopse
- Quantidade de páginas
- Gêneros (tags)

Após o envio, os dados são armazenados na nuvem.

---

# Armazenamento em nuvem

Os arquivos são armazenados no **Google Drive** para garantir que qualquer alteração no acervo (adição, atualização ou remoção de livros) seja refletida automaticamente para todos os usuários do sistema.

Isso permite que diferentes usuários acessem sempre a **versão mais atualizada da biblioteca**, independentemente do computador utilizado.

---

# Objetivo do projeto

Este projeto foi desenvolvido com foco em:

- Prática de **arquitetura MVC**
- Desenvolvimento de **interfaces gráficas com JavaFX**
- Integração com **serviços em nuvem**
- Organização de projetos Java
- Construção de **projeto de portfólio**

---

# Status do projeto

🚧 Em desenvolvimento

Funcionalidades atuais:

- Sistema de login
- Página inicial da aplicação
- Estrutura base do sistema

Funcionalidades planejadas:

- Sistema completo de leitura de PDF
- Upload de livros
- Sistema de busca
- Sistema de categorias
- Painel administrativo
