Class {
	#name : #Cuadrado,
	#superclass : #Figura,
	#instVars : [
		'lado'
	],
	#category : #herencia
}

{ #category : #initialization }
Cuadrado >> initialize [  
^	numLado :=4.
]

{ #category : #initialization }
Cuadrado >> lado [  
^	numLado :=4.
]

{ #category : #printing }
Cuadrado >> printOn: 	name [
		super	 printOn: name .
		^ 	'Cuadrado'
]
