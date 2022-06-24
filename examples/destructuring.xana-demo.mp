
#source "destructuring.xana"

	' v :: [10 :: int] (offset 0)
	' a :: int (offset 20)
	' b :: int (offset 22)
	' c :: int (offset 24)
	' pepe :: record((edad x int)) (offset 26)
	

' Invocation to the main function
call main
halt

#line	8
main:
	' Parameters
	' Local variables
	enter	0

#line	9
	' Assignment
	pusha	0
	pushi	0
	pushi	2
	muli
	addi
	pushi	0
	storei

#line	10
	' Assignment
	pusha	0
	pushi	1
	pushi	2
	muli
	addi
	pushi	100
	storei

#line	11
	' Assignment
	pusha	0
	pushi	2
	pushi	2
	muli
	addi
	pushi	200
	storei

#line	12
	' Assignment
	pusha	0
	pushi	3
	pushi	2
	muli
	addi
	pushi	300
	storei

#line	14
	' Destructuring
	pusha	20
	pusha	0
	push 0
	pushi	2
	muli
	addi
	loadi
	storei
	pusha	0
	pushi	0
	pushi	2
	muli
	addi
	pusha	0
	push 1
	pushi	2
	muli
	addi
	loadi
	storei
	pusha	26
	pushi	0
	addi
	pusha	0
	push 2
	pushi	2
	muli
	addi
	loadi
	storei

#line	16
	' Write
	pusha	20
	loadi
	outi
	' Write
	pushb	10
	outb
	' Write
	' Indexing
	pusha	0
	pushi	0
	pushi	2
	muli
	addi
	loadi
	outi
	' Write
	pushb	10
	outb
	' Write
	' Field Access
	pusha	26
	pushi	0
	addi
	loadi
	outi
	' Write
	pushb	10
	outb
	ret	0, 0, 0
