"
Please describe the package using the class comment of the included manifest class. The manifest class also includes other additional metadata for the package. These meta data are used by other tools such as the SmalllintManifestChecker and the critics Browser
"
Class {
	#name : #Manifestherencia,
	#superclass : #PackageManifest,
	#category : #'herencia-Manifest'
}

{ #category : #'code-critics' }
Manifestherencia class >> ruleReTestClassNameShouldEndWithTestRuleV1FalsePositive [
	^ #(#(#(#RGClassDefinition #(#TestFigura)) #'2022-11-17T00:42:10.063026-05:00') )
]
