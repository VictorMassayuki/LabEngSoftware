Victor Massayuki Umehara
RA: 1460481711081

# SISTEMA WEB CALCULADORA

Projeto de um Sistema Web Calculadora, da disciplina de Laboratório de Engenharia de Software, que consiste em criar um sistema web utilizando a tecnologia Servlet, juntamente da ferramenta de construção Gradle.

# BASE DE DADOS

Executar o script do arquivo dados.sql para ser criada a tabela no banco de dados.

# INTERFACE

A interface é constituida por 3 telas:

	- Login;
	- Calculadora;
	- Histórico;

# PROCEDIMENTO DE EXECUÇÃO

Se estiver usando o MariaDB como o banco de dados, basta alterar a senha do root do banco de dados localizada no arquivo persistence.xml, e em seguida fazer o build para carregar todas as modificações e dependências, e em seguida dar o comando "gradle apprun" para executar a aplicação.

# ESTRUTURA DO CÓDIGO-FONTE

	- build.gradle = irá conter as dependências do projeto;
	- src/main/java/controller = os servlets, onde irá fazer todo mapeamento;
	- src/main/java/dao = irá conter as classes que farão as operações com o banco de dados;
	- src/main/java/model = irá conter as classes que estarão fazendo o Mapeamento Objeto Relacional;
	- src/main/resources = irá conter o arquivo.xml com as configurações do hibernate-jpa;
	- src/main/webapp = irá conter todas as páginas com a tecnologia JSP;

# TECNOLOGIAS UTILIZADAS

	- Gradle 5;
	- Java 8;
	- MariaDB 10.5;
	- Hibernate 5;