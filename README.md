# Gerenciamento de Atlética Universitária

## Descrição do Projeto
Este é um sistema desenvolvido em **Java** para o gerenciamento da atlética da faculdade. O projeto permite o controle de eventos esportivos, participantes, modalidades e pessoas envolvidas. O desenvolvimento inicial foi feito utilizando **Bloco de Notas**, e posteriormente foi migrado para a IDE **NetBeans** para facilitar a implementação da interface gráfica.

## Tecnologias Utilizadas
- **Java (JDK 8+)**
- **NetBeans IDE** (para desenvolvimento da interface visual)
- **Paradigma de Orientação a Objetos (POO)**
- **Modelo UML (Diagrama de Classes)**

## Estrutura do Projeto
O projeto segue uma estrutura organizada baseada no diagrama de classes, com as seguintes entidades principais:

### 1. Classes Principais
- **Pessoa** (Classe base com atributos comuns como nome, CPF, idade e evento)
- **Aluno** (Herda de Pessoa e possui RA e Curso)
- **ExAluno** (Herda de Pessoa e possui Ano de Formação e Curso)
- **Servidor** (Herda de Pessoa e possui Setor e Função)
- **Evento** (Representa um evento esportivo com informações como Campeonato, Cidade e Modalidade)
- **Modalidade** (Define o tipo de esporte e a quantidade de participantes)
- **Participante** (Interface para manipulação de participantes)
- **Principal** (Classe principal contendo o método `main` para execução do programa)
- **Leitura** (Responsável pela entrada de dados)

### 2. Relacionamentos
O sistema é estruturado de forma que **Pessoa** é a superclasse de **Aluno, ExAluno e Servidor**, que participam de **Eventos** dentro de **Modalidades**.

## Funcionalidades
✅ Cadastro de alunos, ex-alunos e servidores
✅ Registro de eventos esportivos
✅ Gerenciamento de modalidades esportivas
✅ Controle de participantes nos eventos
✅ Entrada e processamento de dados via interface gráfica (NetBeans)

## Como Executar o Projeto
1. **Baixar e instalar o JDK 8+** (caso ainda não tenha instalado)
2. **Baixar o NetBeans IDE** (opcional, mas recomendado para visualizar a interface gráfica)
3. **Clonar o repositório**:
   ```sh
   git clone https://github.com/seu-usuario/gerenciamento-atletica.git
   ```
4. **Abrir o projeto no NetBeans**
5. **Compilar e executar** o arquivo `Principal.java`
