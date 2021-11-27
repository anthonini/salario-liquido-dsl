# Linguagem de Domíno Específico para Salário Líquido

## Descrição

Com a crescente demanda por profissionais de TI durante a pandemia do COVID-19 muitas pessoas têm recebido propostas de empregos.

A decisão pela mudança de emprego passa pela análise de diversos fatores, como local de trabalho, se é presencial ou remoto, responsabilidades e remuneração. A diferença de remuneração pode ser um fator decisivo nessa mudança, pois nem essa diferença vai compensar uma vez que isso venha acompanhado por fatores como aumento de atribuições, responsabilidades, mudança de cidade ou outros fatores que o profissional julgue importante na escolha. Por outro lado, em muitos casos uma boa remuneração é o que o profissional procura, logo saber exatamente quanto vai ser o valor líquido pode ser fundamental.

Com a crescente demanda por profissionais de TI durante a pandemia do COVID-19 muitas pessoas têm recebido propostas de empregos.

A decisão pela mudança de emprego passa pela análise de diversos fatores, como local de trabalho, se é presencial ou remoto, responsabilidades e remuneração. A diferença de remuneração pode ser um fator decisivo nessa mudança, pois nem essa diferença vai compensar uma vez que isso venha acompanhado por fatores como aumento de atribuições, responsabilidades, mudança de cidade ou outros fatores que o profissional julgue importante na escolha. Por outro lado, em muitos casos uma boa remuneração é o que o profissional procura, logo saber exatamente quanto vai ser o valor líquido pode ser fundamental.


## A DSL

* Realizar o cálculo do salário líquido.
* A DSL vai dar a opção de cálculo adicionando previdência complementar, número de dependentes e outros descontos.
* No Resultado também será exibido os valores com 13º e Férias e o valor do FGTS.

## Vantagens e desvantagens

### Vantagens
* Velocidade para realizar o cálculo.
* Exibição de dados mais completos.
* Geração de gráficos.

### Desvantagens
* A cada mudança da tabela do INSS e/ou da tabela de imposto de renda a DSL tem que ser atualizada.


## Ambiente

* [Eclipse](https://www.eclipse.org/downloads/packages/)
* [Plugin do Xtext](https://projects.eclipse.org/projects/modeling.tmf.xtext/downloads).

## Gramática

É composta por um ou mais salários líquidos.

```java
import "http://www.eclipse.org/emf/2002/Ecore" as ecore

Salarios:
	salarios += Salario*;
	
Salario:
	'Salario' valor=Double ('Dependentes' dependentes=INT)? ('Descontos' descontos=Double)? ('Previdencia' previdencia=Double)?;
	
Double returns ecore::EDouble : INT ('.' INT)?;
```

## Exemplo prático de utilização

```java
Salario 4000
Salario 4000 Dependentes 1
Salario 4000 Dependentes 1 Descontos 200
Salario 4000 Dependentes 1 Descontos 200 Previdencia 500
Salario 7000.90
Salario 9000    
```

Resultado:

![Exemplo de utilização da DSL](imagens/exemplo.png?raw=true "Exemplo de utilização da DSL")

## Atualizações futuras

Incluir o cálculo e comparação com diferentes tipos de pessoa jurídica.