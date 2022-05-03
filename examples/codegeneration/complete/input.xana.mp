
#source	"input.xana"

	' i :: int (offset 0)
	' n :: int (offset 2)
	' j :: int (offset 4)
	' c :: char (offset 6)
	' pair :: record((integer x int) x (character x char)) (offset 7)
	' matrix :: [10 :: [10 :: int]] (offset 10)

' Invocation to the main function
call main
halt


#line	10

p:
	' Parameters
	' Local variables
	enter	0
	ret	0, 0, 0

#line	13

f:
	' Parameters
	' r :: double (offset 6)
	' e :: int (offset 4)
	' Local variables
	' real :: double (offset -4)
	' c :: char (offset -5)
	enter	5

#line	16
	push	bp
	pushi	-4
	addi
	pusha	7
	pushi	2
	addi
	loadb
	b2i
	i2f
	pusha	7
	pushi	0
	addi
	loadi
	i2f
	addf
	push	bp
	pushi	6
	addi
	loadf
	addf
	push	bp
	pushi	4
	addi
	loadi
	i2f
	addf
	storef

#line	17
	push	bp
	pushi	-5
	addi
	pushb	48
	storeb

#line	18
	' Return
	push	bp
	pushi	-5
	addi
	loadb
	b2i
	ret	2, 5, 6

#line	23

fill:
	' Parameters
	' row :: int (offset 8)
	' value :: int (offset 6)
	' increment :: int (offset 4)
	' Local variables
	' i :: int (offset -2)
	' inc :: int (offset -4)
	enter	4

#line	25
	push	bp
	pushi	-2
	addi
	pushi	0
	storei

#line	26
	push	bp
	pushi	-4
	addi
	push	bp
	pushi	4
	addi
	loadi
	storei

#line	27
	' While statement
label0:
	push	bp
	pushi	-2
	addi
	loadi
	pushi	10
	lti
	jz	label1
	' Body of the while statement

#line	28
	pusha	10
	push	bp
	pushi	8
	addi
	loadi
	pushi	20
	muli
	addi
	push	bp
	pushi	-2
	addi
	loadi
	pushi	2
	muli
	addi
	push	bp
	pushi	6
	addi
	loadi
	push	bp
	pushi	-4
	addi
	loadi
	addi
	storei

#line	29
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

#line	30
	push	bp
	pushi	-4
	addi
	push	bp
	pushi	-4
	addi
	loadi
	push	bp
	pushi	4
	addi
	loadi
	addi
	storei
	jmp	label0
label1:
	ret	0, 4, 6

#line	34

show:
	' Parameters
	' row :: int (offset 4)
	' Local variables
	' i :: int (offset -2)
	enter	2

#line	36
	push	bp
	pushi	-2
	addi
	pushi	0
	storei

#line	37
	' While statement
label2:
	push	bp
	pushi	-2
	addi
	loadi
	pushi	10
	lti
	jz	label3
	' Body of the while statement

#line	38
	' Write
	pushb	40
	outb
	' Write
	push	bp
	pushi	4
	addi
	loadi
	outi
	' Write
	pushb	44
	outb
	' Write
	push	bp
	pushi	-2
	addi
	loadi
	outi
	' Write
	pushb	41
	outb
	' Write
	pushb	58
	outb
	' Write
	pusha	10
	push	bp
	pushi	4
	addi
	loadi
	pushi	20
	muli
	addi
	push	bp
	pushi	-2
	addi
	loadi
	pushi	2
	muli
	addi
	loadi
	outi
	' Write
	pushb	32
	outb

#line	39
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

#line	41
	' Write
	pushb	10
	outb
	ret	0, 2, 2

#line	44

main:
	' Parameters
	' Local variables
	' i :: int (offset -2)
	enter	2

#line	47
	call	p

#line	48
	push	bp
	pushi	-2
	addi
	pushi	0
	storei

#line	49
	pusha	7
	pushi	2
	addi
	pushb	48
	storeb

#line	50
	pusha	7
	pushi	0
	addi
	pushb	48
	b2i
	storei

#line	51
	' Write
	push	bp
	pushi	-2
	addi
	loadi
	i2f
	pusha	7
	pushi	2
	addi
	loadb
	b2i
	call	f
	outi
	' Write
	pushb	10
	outb

#line	53
	pushf	1.3
	pushi	2
	call	f
	popi

#line	55
	push	bp
	pushi	-2
	addi
	pushi	0
	storei

#line	56
	pusha	4
	pushi	0
	storei

#line	57
	' While statement
label4:
	push	bp
	pushi	-2
	addi
	loadi
	pushi	10
	lti
	jz	label5
	' Body of the while statement

#line	58
	push	bp
	pushi	-2
	addi
	loadi
	pusha	4
	loadi
	pushi	1
	call	fill

#line	59
	push	bp
	pushi	-2
	addi
	loadi
	call	show

#line	60
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

#line	61
	pusha	4
	push	bp
	pushi	-2
	addi
	loadi
	pushi	10
	muli
	storei
	jmp	label4
label5:
	ret	0, 2, 0
