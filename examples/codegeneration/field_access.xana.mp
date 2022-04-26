
#source	"field_access.xana"


' Invocation to the main function
call main
halt


#line	1

main:
	' Parameters
	' Local variables
	' date :: record((day x int) x (month x int) x (year x int)) (offset -6)
	' player :: record((lives x int) x (name x [4 :: char]) x (weapon x record((attack x int) x (life_span x double)))) (offset -18)
	' i :: int (offset -20)
	enter	20

#line	6
	push	bp
	pushi	-6
	addi
	pushi	0
	addi
	pushi	28
	storei

#line	7
	push	bp
	pushi	-6
	addi
	pushi	2
	addi
	pushi	12
	storei

#line	8
	push	bp
	pushi	-6
	addi
	pushi	4
	addi
	pushi	2021
	storei

#line	9
	' Write
	push	bp
	pushi	-6
	addi
	pushi	0
	addi
	loadi
	outi
	' Write
	pushb	47
	outb
	' Write
	push	bp
	pushi	-6
	addi
	pushi	2
	addi
	loadi
	outi
	' Write
	pushb	47
	outb
	' Write
	push	bp
	pushi	-6
	addi
	pushi	4
	addi
	loadi
	outi
	' Write
	pushb	10
	outb

#line	20
	push	bp
	pushi	-18
	addi
	pushi	0
	addi
	pushi	10
	storei

#line	21
	push	bp
	pushi	-18
	addi
	pushi	2
	addi
	pushi	0
	pushi	1
	muli
	addi
	pushb	108
	storeb

#line	22
	push	bp
	pushi	-18
	addi
	pushi	2
	addi
	pushi	1
	pushi	1
	muli
	addi
	pushb	105
	storeb

#line	23
	push	bp
	pushi	-18
	addi
	pushi	2
	addi
	pushi	2
	pushi	1
	muli
	addi
	pushb	110
	storeb

#line	24
	push	bp
	pushi	-18
	addi
	pushi	2
	addi
	pushi	3
	pushi	1
	muli
	addi
	pushb	107
	storeb

#line	25
	push	bp
	pushi	-18
	addi
	pushi	6
	addi
	pushi	0
	addi
	pushi	10
	storei

#line	26
	push	bp
	pushi	-18
	addi
	pushi	6
	addi
	pushi	2
	addi
	pushf	2.5
	storef

#line	29
	push	bp
	pushi	-20
	addi
	pushi	0
	storei

#line	31
	' Write
	pushb	108
	outb
	' Write
	pushb	105
	outb
	' Write
	pushb	118
	outb
	' Write
	pushb	101
	outb
	' Write
	pushb	115
	outb
	' Write
	pushb	58
	outb
	' Write
	pushb	32
	outb
	' Write
	push	bp
	pushi	-18
	addi
	pushi	0
	addi
	loadi
	outi
	' Write
	pushb	10
	outb

#line	33
	' Write
	pushb	110
	outb
	' Write
	pushb	97
	outb
	' Write
	pushb	109
	outb
	' Write
	pushb	101
	outb
	' Write
	pushb	58
	outb
	' Write
	pushb	32
	outb

#line	34
	' While statement
label0:
	push	bp
	pushi	-20
	addi
	loadi
	pushi	4
	lti
	jz	label1
	' Body of the while statement

#line	35
	' Write
	push	bp
	pushi	-18
	addi
	pushi	2
	addi
	push	bp
	pushi	-20
	addi
	loadi
	pushi	1
	muli
	addi
	loadb
	outb

#line	36
	push	bp
	pushi	-20
	addi
	push	bp
	pushi	-20
	addi
	loadi
	pushi	1
	addi
	storei
	jmp	label0
label1:

#line	38
	' Write
	pushb	10
	outb

#line	40
	' Write
	pushb	97
	outb
	' Write
	pushb	116
	outb
	' Write
	pushb	116
	outb
	' Write
	pushb	97
	outb
	' Write
	pushb	99
	outb
	' Write
	pushb	107
	outb
	' Write
	pushb	58
	outb
	' Write
	pushb	32
	outb
	' Write
	push	bp
	pushi	-18
	addi
	pushi	6
	addi
	pushi	0
	addi
	loadi
	outi
	' Write
	pushb	10
	outb

#line	41
	' Write
	pushb	115
	outb
	' Write
	pushb	112
	outb
	' Write
	pushb	97
	outb
	' Write
	pushb	110
	outb
	' Write
	pushb	58
	outb
	' Write
	pushb	32
	outb
	' Write
	push	bp
	pushi	-18
	addi
	pushi	6
	addi
	pushi	2
	addi
	loadf
	outf
	' Write
	pushb	10
	outb
	ret	0, 20, 0
