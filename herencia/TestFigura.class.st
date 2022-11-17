Class {
	#name : #TestFigura,
	#superclass : #TestCase,
	#category : #herencia
}

{ #category : #tests }
TestFigura >> testInicializacion [ 
	|c m|.
	c := Cuadrado  new.
	m := Triangulo  new.
	self assert: c numLado  + m base equals: 8.
]
