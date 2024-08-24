# MyCoffeeShop

**MyCoffeeShop** é um projeto de cafeteria desenvolvido com **Next.js** para o front end e **[Back-end Framework]** para o back end. Este projeto tem como objetivo criar uma aplicação completa para gerenciar pedidos, produtos e interações com clientes.

## Estrutura do Projeto

O projeto está dividido em duas partes principais:

- **Frontend**: Localizado na pasta `frontend`. Utiliza Next.js para criar a interface do usuário.
- **Backend**: Localizado na pasta `backend`. Utiliza [Spring Boot] para gerenciar a lógica de servidor e banco de dados.

## Requisitos

- Node.js (v[versão recomendada] ou superior)
- [Spring Boob] (v[3.0] ou superior)
- MySQL (ou outro banco de dados de sua escolha)

## Configuração

### Frontend

1. Navegue até a pasta `frontend`:
    ```bash
    cd frontend
    ```

2. Instale as dependências:
    ```bash
    npm install
    ```

3. Crie um arquivo `.env.local` na pasta `frontend` e adicione suas variáveis de ambiente. Exemplo:
    ```env
    NEXT_PUBLIC_API_URL=http://localhost:5000/api
    ```

4. Inicie o servidor de desenvolvimento:
    ```bash
    npm run dev
    ```

### Backend

1. Navegue até a pasta `backend`:
    ```bash
    cd backend
    ```

2. Instale as dependências:
    ```bash
    npm install
    ```

3. Crie um arquivo `.env` na pasta `backend` e adicione suas variáveis de ambiente. Exemplo:
    ```env
    DATABASE_URL=mongodb://localhost:27017/mycoffeeshop
    JWT_SECRET=mysecretkey
    ```

4. Inicie o servidor de desenvolvimento:
    ```bash
    npm start
    ```

## Scripts

- **Frontend**
  - `npm run dev`: Inicia o servidor de desenvolvimento.
  - `npm run build`: Cria uma versão de produção da aplicação.
  - `npm run start`: Inicia a aplicação em modo de produção.

- **Backend**
  - 
  - 
  - 

## Contribuição

1. Faça um fork deste repositório.
2. Crie uma nova branch (`git checkout -b feature/nome-da-feature`).
3. Faça suas alterações e faça commit (`git commit -am 'Adiciona nova feature'`).
4. Faça push para a branch (`git push origin feature/nome-da-feature`).
5. Abra um Pull Request.

## Licença

Este projeto é licenciado sob a [Licença MIT](LICENSE).

## Contato

Para perguntas ou sugestões, entre em contato com [Jairo Pinheiro] em [jairopnhr@gmail.com].

