# FreelAcademy 🚀

O **FreelAcademy** é uma plataforma robusta desenvolvida para mediar a relação entre freelancers e clientes. O sistema foca em segurança e transparência, garantindo que a entrega de projetos e os pagamentos sejam realizados de forma justa por meio de um ecossistema integrado Web e Desktop.

---

## 📌 Sobre o Projeto

O sistema foi estruturado para resolver o problema de falta de confiança em transações remotas. Ele permite que clientes publiquem projetos e freelancers enviem propostas. Uma vez fechado o acordo, o trabalho é monitorado por uma aplicação desktop dedicada para garantir o cumprimento do que foi combinado.

### Diferenciais:
- **Pagamentos em Custódia:** O sistema mantém o saldo protegido até que a entrega seja validada pelo cliente.
- **Ecossistema Integrado:** Painéis específicos com funcionalidades distintas para Clientes e Freelancers.
- **Aplicação Desktop:** Ferramenta em Java para gestão de tempo e entrega segura de código-fonte.

---

## 🛠️ Tecnologias e Linguagens Utilizadas

### 🌐 Front-end Web (Interface do Usuário)
* ![HTML5](https://img.shields.io/badge/html5-%23E34F26.svg?style=for-the-badge&logo=html5&logoColor=white)
* ![CSS3](https://img.shields.io/badge/css3-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white)
* ![JavaScript](https://img.shields.io/badge/javascript-%23F7DF1E.svg?style=for-the-badge&logo=javascript&logoColor=black)
* **Destaque:** Interface responsiva com foco em UX/UI, utilizando sistemas de abas dinâmicas e dashboards personalizados.

### 💻 Desktop App (Ambiente de Trabalho)
* ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
* **IDE NetBeans:** Ambiente principal para o desenvolvimento da interface Swing/AWT.
* **Maven:** Gerenciamento de dependências e automação de compilação.

### 🗄️ Backend & Banco de Dados (Persistência)
* ![SQL Server](https://img.shields.io/badge/sql%20server-%23CC2927.svg?style=for-the-badge&logo=microsoft-sql-server&logoColor=white)
* **JDBC:** Integração robusta entre a aplicação Java e o servidor de banco de dados SQL.

---

## 🚀 Próximas Etapas (Evolução do Sistema)

Após a validação completa da interface front-end, o sistema será integrado a um ecossistema backend escalável utilizando:
- ![Python](https://img.shields.io/badge/python-3670A0?style=for-the-badge&logo=python&logoColor=ffdd54)
- ![Django](https://img.shields.io/badge/django-%23092E20.svg?style=for-the-badge&logo=django&logoColor=white)

---

## 📂 Organização do Repositório

O projeto está dividido em três pilares fundamentais para facilitar a manutenção e o desenvolvimento:

1.  **`/FreelAcademy Web`**: Contém todo o front-end da plataforma (Home, Dashboards de Cliente e Freelancer, Chat e Área Financeira).
2.  **`/FreelAcademy Desktop`**: Código-fonte da aplicação Java desenvolvida no NetBeans para o ambiente de trabalho do freelancer.
3.  **`/Documentação Projeto`**: Repositório de arquivos técnicos, incluindo diagramas UML (Classe e Caso de Uso), Requisitos Funcionais (RF) e scripts SQL.

---

## 📌 Como Executar o Projeto

### Módulo Web
1. Navegue até a pasta `/FreelAcademy Web`.
2. Abra o arquivo `index.html` em qualquer navegador moderno (Chrome, Edge ou Firefox).

### Módulo Desktop
1. Certifique-se de ter o **JDK 17 ou superior** instalado em sua máquina.
2. Importe a pasta correspondente na IDE **NetBeans**.
3. Realize o processo de **Clean and Build** para baixar as dependências do Maven.
4. Execute o projeto para abrir a interface gráfica.

---
*Este é um projeto acadêmico desenvolvido em grupo, focado em criar soluções seguras para o mercado de trabalho freelancer.*
