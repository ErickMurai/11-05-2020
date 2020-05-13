package Aula;

public class Produtos {
	
	var array = ['primeiro', 'segundo', , 'quarto'];

	array.forEach(function(elemento) {
	  console.log(elemento);
	})
	

	if (array[2] === undefined) {
	  console.log('array[2] is undefined'); // 
	}

	array = ['primeiro', 'segundo', undefined, 'quarto'];

	array.forEach(function(elemento) {
	  console.log(elemento);
	});

}
