# Desafios TDD 

O objetivo desse desafio foi testar os conhecimentos em **TDD** (*Test-driven development*),
em que foram utilizados os exercícios **01, 02, 03 e 07** do último desafio em **POO** (*Programação Orientada a Objetos*).

#### Pasta src
Na pasta *src* estão os códigos fonte (nos pacotes/pastas: *desafioTDD* e *dojoPuzzleDesafios*), em que todos estão inicializados no mesmo arquivo **Main**,
em que ao iniciar sera requisitado do usuário um número no console referente ao exercício (**01, 02, 03 e 07**)
que deseja ver, carregando esse no console.

> O número no fim do nome de cada arquivo representa qual exercício esse está vinculado.

#### Pasta test
Na pasta *test* (nos pacotes/pastas: *desafioTDDTest* e *dojoPuzzleDesafiosTest*) estão os códigos feitos para testar as funcionalidades dos códigos da pasta *src*,
tanto dos exercícios feitos em **POO**, quanto do dojoPuzzle (**FizzBuzz**), esses testes que
foram realizados com a utilização do **_JUnit 5_**.

> Com exceção do teste do FizzBuzz, que está em apenas um arquivo de teste, o nome do arquivo anterior a " *Test* " representa o arquivo da pasta *src* que ele está testando.

#### Desafio FizzBuzz (dojoPuzzle)

Neste problema, você deverá exibir uma lista de 1 a 100, um em cada linha, com as seguintes exceções:
	
- Números divisíveis por 3 deve aparecer como 'Fizz' ao invés do número;
- Números divisíveis por 5 devem aparecer como 'Buzz' ao invés do número;
- Números divisíveis por 3 e 5 devem aparecer como 'FizzBuzz' ao invés do número'.