Class {
	#name : #Triangulo,
	#superclass : #Figura,
	#instVars : [
		'base'
	],
	#category : #herencia
}

{ #category : #printing }
Triangulo >> altura [ 
	^ numLado:=3 .
]

{ #category : #printing }
Triangulo >> base [ 
	^ base:=4.
]

{ #category : #initialization }
Triangulo >> initialize [ 
		base 		=2.
]

{ #category : #printing }
Triangulo >> printOn: 	name [
		super	 printOn: name .
		^ 	'Triangulo'
]

{ #category : #initialization }
Triangulo >> tipo [ 
	^ 'Soy un triangulo'.
]
