# TDT4250-Group02

## OPEN TO-DOs
* README
	* Fix links to model section
	* Describe the models in Model section
	* Extend Usage section by explaining how to run the transitions
* Model-to-Model-Transition
	* It is possible that the code lines we are "generating" are invalid due to multiple variables having the same name. We need a fix for this
* Model-to-Text transition
	* How could we trigger this workflow from java code e.g. inside the TestSuiteConverter class?
* Sirius
	* Is it working?
* Constraints
	* Do we need to introduce some OCL constraints?


## Description
This repository contains an eclipse plugin which can automatically generate test code for a web API. The test cases are specified as a sequence of REST requests, containing all the necessary information to execute the given HTTP requests, including parameters, headers and expected response codes. Further information on the data structures can be seen in the [Models section](#Models).

## Usage
The test code generation can be triggered in different ways.
1. **A Model-to-Model transition**; starting from a [TestSuite](#Models) specification file, containing all the use cases in JSON format
2. **A Model-to-Text transition**; starting from a model of the to be generated java test class, conforming to the [JavaTestModel](#Models)

## Models

#### TestSuite Model
t.b.d.

#### JavaTestModel
t.b.d.

## Project Context
This repository is the results of the project in the course TDT4250 Advanced Software Design at the Norwegian University of Science and Technology in 2022.

## Authors
Davide Aimar
Gaute Brandser
Martin Mayr
Richard Zahn
