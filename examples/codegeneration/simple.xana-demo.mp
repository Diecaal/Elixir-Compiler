#source "simple.xana"
	' Invocation to the main function
call main
halt
	' c :: char (offset 0)
	' a :: int (offset 1)
	' r :: double (offset 3)

#Line	5
main: 
	' Parameters
	' Local variables
	' a :: int (offset -2)
	' i :: int (offset -4)
	enter 4

#Line	8
	' Assignment
	pusha 0
	pushb	97
	storeb

#Line	9
	' Write
	pusha 0
	loadb
	outb

#Line	9
	' Write
	pushb	10
	outb

#Line	11
	' Assignment
	push	bp
	pushi -2
	addi
	pushi	1
	storei

#Line	12
	' Assignment
	push	bp
	pushi -4
	addi
	pushi	3
	pushb	48
	mulint
	storei

#Line	13
	' Write
	push	bp
	pushi -2
	addi
	loadi
	outi

#Line	13
	' Write
	pushb	32
	outb

#Line	13
	' Write
	push	bp
	pushi -4
	addi
	loadi
	outi

#Line	13
	' Write
	pushb	10
	outb

#Line	15
	' Read
	pusha 3
	loadf
	in f

#Line	16
	' Write
	pusha 3
	loadf
	pushi	2
	muldouble
	outf

#Line	16
	' Write
	pushb	10
	outb

#Line	18
	' Write
	pushf	4.5
	pushi	3
	subdouble
	outf

#Line	18
	' Write
	pushb	32
	outb

#Line	18
	' Write
	pushf	48.0
	pushb	48
	divdouble
	outf

#Line	18
	' Write
	pushb	32
	outb

#Line	18
	' Write
	pushb	49
	pushb	48
	modchar
	outb

#Line	18
	' Write
	pushb	32
	outb

#Line	18
	' Write
	pushb	49
	pushb	48
	addchar
	outb

#Line	18
	' Write
	pushb	10
	outb

#Line	20
	' Write
	pushi	2
	pushi	1
	ltint
	outi

#Line	20
	' Write
	pushb	32
	outb

#Line	20
	' Write
	pushi	3
	pushi	4
	geint
	outi

#Line	20
	' Write
	pushb	32
	outb

#Line	20
	' Write
	pushi	5
	pushi	5
	eqint
	outi

#Line	20
	' Write
	pushb	32
	outb

#Line	20
	' Write
	pushi	2
	pushi	1
	and
	outi

#Line	20
	' Write
	pushb	32
	outb

#Line	20
	' Write
	pushi	3
	pushi	0
	or
	outi

#Line	20
	' Write
	pushb	32
	outb

#Line	20
	' Write
	pushi	0
	outi

#Line	20
	' Write
	pushb	10
	outb
	enter 4
	ret 0, 4, 0
