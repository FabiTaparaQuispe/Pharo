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
	^ numLado .
]

{ #category : #printing }
Triangulo >> base [ 
	^ base .
]

{ #category : #initialization }
Triangulo >> initialize [ 
	^ numLado :=3.
]

{ #category : #printing }
Triangulo >> printOn: 	name [
		super	 printOn: name .
		^ 	'Triangulo'
]
