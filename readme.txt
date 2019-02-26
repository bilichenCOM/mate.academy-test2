********************AcidCalc_v1.0**********************

 AcidCalc is simple multifunctional tool
for computing math expression given in
string-form. In another words, it`s calculator,
that supports particular in this version follows: 
addition, subtraction, division, multiplying and
factorial. Just open "acidcalc.jar" through console
and start computing.

For shortly guide just type "help" when acidcalc.jar
is runned.

AcidCalc v1.0 supports decimal number type in form of
arabic and roman numericals. Important - only one form
of numbers can be used in one expression, for example:

10!-(34+56)+78 
can be written also as :
x!-(xxxiii+xxxxxvi)+xxxxxxxvi

please pay attention that:

			/*prefferable is arabic num system,
fixed in v1.0f->	*it may be hard to deal with some 
			*roman-expression in this version
			*/ 

	it is unavailable now to use negative
	denominator please use "-(1/2)" instead
	of "(1/-2)" - OR EXCEPTION WILL BE THROWN
	AS SOON AS POSSIBLE!

	to multiply or divide rom-numerical
	use parentheses like this:
	XII+VI-(XVIII)/(III)+(XIV)*II

 - ALL will be updated in next versions

for more details:
'help' - show available console commands;
'avops' - show list of available operations;
'gui' - will open sepparate window with graphical 
available in version 2.0
'end' - close console for commands and stop AcidCalc;

It`s first update more functionallity soon in the future

P.S. please end AcidCalc with 'end' expression it worths
for your RAM

P.S. калькулятор працює використовуючи форматування за
допомогою regex. Більше коментарів у StringComputer.java
в наступних версіях буде доступний GUI на Swing.
