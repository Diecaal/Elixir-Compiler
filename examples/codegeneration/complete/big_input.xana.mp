
#source	"big_input.xana"

	' pair :: record((integer x int) x (character x char)) (offset 0)
	' acme :: [2 :: record((employees x [2 :: record((age x int))]))] (offset 3)
	' fibonacci :: [8 :: [3 :: int]] (offset 11)

' Invocation to the main function
call main
halt


#line	16

p:
	' Parameters
	' Local variables
	enter	0
	ret	0, 0, 0

#line	19

f:
	' Parameters
	' r :: double (offset 6)
	' e :: int (offset 4)
	' Local variables
	' real :: double (offset -4)
	' c :: char (offset -5)
	' result :: int (offset -7)
	enter	7

#line	23
	push	bp
	pushi	-4
	addi
	push	bp
	pushi	6
	addi
	loadf
	pushf	10.0
	mulf
	storef

#line	24
	push	bp
	pushi	-5
	addi
	pushb	48
	storeb

#line	25
	' If statement
	push	bp
	pushi	4
	addi
	loadi
	pushi	256
	lti
	jz	label0
	' Body of the if branch

#line	26
	push	bp
	pushi	-5
	addi
	push	bp
	pushi	4
	addi
	loadi
	i2b
	storeb

#line	27
	push	bp
	pushi	-7
	addi
	push	bp
	pushi	-5
	addi
	loadb
	b2i
	storei
	jmp	label1
label0:
	' Body of the else branch

#line	29
	push	bp
	pushi	-7
	addi
	push	bp
	pushi	-4
	addi
	loadf
	f2i
	storei
label1:

#line	31
	' Return
	push	bp
	pushi	-7
	addi
	loadi
	ret	2, 7, 6

#line	34

initialize:
	' Parameters
	' Local variables
	' i :: int (offset -2)
	enter	2

#line	36
	pusha	11
	pushi	0
	pushi	6
	muli
	addi
	pushi	0
	pushi	2
	muli
	addi
	pushi	0
	storei

#line	37
	pusha	11
	pushi	0
	pushi	6
	muli
	addi
	pushi	1
	pushi	2
	muli
	addi
	pushi	1
	storei

#line	38
	pusha	11
	pushi	0
	pushi	6
	muli
	addi
	pushi	2
	pushi	2
	muli
	addi
	pushi	1
	storei

#line	39
	push	bp
	pushi	-2
	addi
	pushi	1
	storei

#line	40
	' While statement
label2:
	push	bp
	pushi	-2
	addi
	loadi
	pushi	8
	lti
	jz	label3
	' Body of the while statement

#line	41
	pusha	11
	push	bp
	pushi	-2
	addi
	loadi
	pushi	6
	muli
	addi
	pushi	0
	pushi	2
	muli
	addi
	pusha	11
	push	bp
	pushi	-2
	addi
	loadi
	pushi	1
	subi
	pushi	6
	muli
	addi
	pushi	1
	pushi	2
	muli
	addi
	loadi
	storei

#line	42
	pusha	11
	push	bp
	pushi	-2
	addi
	loadi
	pushi	6
	muli
	addi
	pushi	1
	pushi	2
	muli
	addi
	pusha	11
	push	bp
	pushi	-2
	addi
	loadi
	pushi	1
	subi
	pushi	6
	muli
	addi
	pushi	2
	pushi	2
	muli
	addi
	loadi
	storei

#line	43
	pusha	11
	push	bp
	pushi	-2
	addi
	loadi
	pushi	6
	muli
	addi
	pushi	2
	pushi	2
	muli
	addi
	pusha	11
	push	bp
	pushi	-2
	addi
	loadi
	pushi	6
	muli
	addi
	pushi	0
	pushi	2
	muli
	addi
	loadi
	pusha	11
	push	bp
	pushi	-2
	addi
	loadi
	pushi	6
	muli
	addi
	pushi	1
	pushi	2
	muli
	addi
	loadi
	addi
	storei

#line	44
	push	bp
	pushi	-2
	addi
	push	bp
	pushi	-2
	addi
	loadi
	pushi	1
	addi
	storei
	jmp	label2
label3:
	ret	0, 2, 0

#line	50

main:
	' Parameters
	' Local variables
	' i :: int (offset -2)
	' j :: int (offset -4)
	enter	4

#line	52
	call	p

#line	53
	push	bp
	pushi	-2
	addi
	pushi	0
	storei

#line	54
	pusha	0
	pushi	2
	addi
	pushb	48
	storeb

#line	55
	pusha	0
	pushi	0
	addi
	pushb	48
	b2i
	storei

#line	58
	' Write
	push	bp
	pushi	-2
	addi
	loadi
	i2f
	pusha	0
	pushi	2
	addi
	loadb
	b2i
	call	f
	outi
	' Write
	pushb	10
	outb

#line	59
	pushf	1.3
	pushi	2
	call	f
	popi

#line	61
	call	initialize

#line	62
	push	bp
	pushi	-2
	addi
	pushi	0
	storei

#line	63
	' While statement
label4:
	push	bp
	pushi	-2
	addi
	loadi
	pushi	8
	lti
	jz	label5
	' Body of the while statement

#line	65
	' Write
	pushb	40
	outb
	' Write
	push	bp
	pushi	-2
	addi
	loadi
	pushi	1
	addi
	outi
	' Write
	pushb	41
	outb
	' Write
	pusha	11
	push	bp
	pushi	-2
	addi
	loadi
	pushi	6
	muli
	addi
	pushi	0
	pushi	2
	muli
	addi
	loadi
	outi
	' Write
	pushb	43
	outb
	' Write
	pusha	11
	push	bp
	pushi	-2
	addi
	loadi
	pushi	6
	muli
	addi
	pushi	1
	pushi	2
	muli
	addi
	loadi
	outi
	' Write
	pushb	61
	outb
	' Write
	pusha	11
	push	bp
	pushi	-2
	addi
	loadi
	pushi	6
	muli
	addi
	pushi	2
	pushi	2
	muli
	addi
	loadi
	outi
	' Write
	pushb	10
	outb

#line	66
	push	bp
	pushi	-2
	addi
	push	bp
	pushi	-2
	addi
	loadi
	pushi	1
	addi
	storei
	jmp	label4
label5:

#line	69
	pusha	3
	pushi	1
	pushi	4
	muli
	addi
	pushi	0
	addi
	pushi	1
	pushi	2
	muli
	addi
	pushi	0
	addi
	pushi	56
	storei

#line	71
	' Write
	pusha	3
	pushi	1
	pushi	4
	muli
	addi
	pushi	0
	addi
	pushi	1
	pushi	2
	muli
	addi
	pushi	0
	addi
	loadi
	outi
	' Write
	pushb	10
	outb

#line	72
	push	bp
	pushi	-2
	addi
	pushi	0
	storei

#line	73
	' While statement
label6:
	push	bp
	pushi	-2
	addi
	loadi
	pushi	2
	lti
	jz	label7
	' Body of the while statement

#line	74
	push	bp
	pushi	-4
	addi
	pushi	0
	storei

#line	75
	' While statement
label8:
	push	bp
	pushi	-4
	addi
	loadi
	pushi	2
	lti
	jz	label9
	' Body of the while statement

#line	76
	pusha	3
	push	bp
	pushi	-2
	addi
	loadi
	pushi	4
	muli
	addi
	pushi	0
	addi
	push	bp
	pushi	-4
	addi
	loadi
	pushi	2
	muli
	addi
	pushi	0
	addi
	push	bp
	pushi	-2
	addi
	loadi
	push	bp
	pushi	-4
	addi
	loadi
	addi
	storei

#line	77
	push	bp
	pushi	-4
	addi
	push	bp
	pushi	-4
	addi
	loadi
	pushi	1
	addi
	storei
	jmp	label8
label9:

#line	79
	push	bp
	pushi	-2
	addi
	push	bp
	pushi	-2
	addi
	loadi
	pushi	1
	addi
	storei
	jmp	label6
label7:

#line	82
	push	bp
	pushi	-2
	addi
	pushi	0
	storei

#line	83
	' While statement
label10:
	push	bp
	pushi	-2
	addi
	loadi
	pushi	2
	lti
	jz	label11
	' Body of the while statement

#line	84
	push	bp
	pushi	-4
	addi
	pushi	0
	storei

#line	85
	' While statement
label12:
	push	bp
	pushi	-4
	addi
	loadi
	pushi	2
	lti
	jz	label13
	' Body of the while statement

#line	87
	' Write
	pusha	3
	push	bp
	pushi	-2
	addi
	loadi
	pushi	4
	muli
	addi
	pushi	0
	addi
	push	bp
	pushi	-4
	addi
	loadi
	pushi	2
	muli
	addi
	pushi	0
	addi
	loadi
	outi
	' Write
	pushb	32
	outb

#line	88
	push	bp
	pushi	-4
	addi
	push	bp
	pushi	-4
	addi
	loadi
	pushi	1
	addi
	storei
	jmp	label12
label13:

#line	90
	push	bp
	pushi	-2
	addi
	push	bp
	pushi	-2
	addi
	loadi
	pushi	1
	addi
	storei
	jmp	label10
label11:
	ret	0, 4, 0
