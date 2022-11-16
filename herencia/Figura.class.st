Class {
	#name : #Figura,
	#superclass : #Object,
	#instVars : [
		'numLado'
	],
	#category : #herencia
}

{ #category : #printing }
Figura >> printOn: 	name [
		super	 printOn: name .
		^ 	'Figura'
]
