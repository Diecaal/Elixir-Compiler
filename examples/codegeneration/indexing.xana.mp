
#source	"indexing.xana"


' Invocation to the main function
call main
halt


#line	1

main:
	' Parameters
	' Local variables
	' vector :: [10 :: int] (offset -20)
	' matrix :: [5 :: [3 :: double]] (offset -80)
	' i :: int (offset -82)
	enter	82

#line	5
	push	bp
	pushi	-20
	addi
	pushi	9
	pushi	2
	muli
	addi
	pushi	1
	storei

#line	6
	' Write
	push	bp
	pushi	-20
	addi
	pushi	9
	pushi	2
	muli
	addi
	loadi
	outi
	' Write
	pushb	10
	outb

#line	10
	push	bp
	pushi	-82
	addi
	pushi	0
	storei

#line	11
	' While statement
label0:
	push	bp
	pushi	-82
	addi
	loadi
	pushi	15
	lti
	jz	label1
	' Body of the while statement

#line	12
	push	bp
	pushi	-80
	addi
	push	bp
	pushi	-82
	addi
	loadi
	pushi	5
	modi
	pushi	12
	muli
	addi
	push	bp
	pushi	-82
	addi
	loadi
	pushi	5
	divi
	pushi	4
	muli
	addi
	push	bp
	pushi	-82
	addi
	loadi
	i2f
	storef

#line	13
	push	bp
	pushi	-82
	addi
	push	bp
	pushi	-82
	addi
	loadi
	pushi	1
	addi
	storei
	jmp	label0
label1:

#line	16
	push	bp
	pushi	-82
	addi
	pushi	0
	storei

#line	17
	' While statement
label2:
	push	bp
	pushi	-82
	addi
	loadi
	pushi	15
	lti
	jz	label3
	' Body of the while statement

#line	18
	' If statement
	push	bp
	pushi	-82
	addi
	loadi
	pushi	5
	modi
	pushi	0
	eqi
	jz	label4
	' Body of the if branch

#line	19
	' Write
	pushb	10
	outb
	jmp	label5
label4:
	' Body of the else branch
label5:

#line	21
	' Write
	push	bp
	pushi	-80
	addi
	push	bp
	pushi	-82
	addi
	loadi
	pushi	5
	modi
	pushi	12
	muli
	addi
	push	bp
	pushi	-82
	addi
	loadi
	pushi	5
	divi
	pushi	4
	muli
	addi
	loadf
	outf
	' Write
	pushb	9
	outb

#line	22
	push	bp
	pushi	-82
	addi
	push	bp
	pushi	-82
	addi
	loadi
	pushi	1
	addi
	storei
	jmp	label2
label3:
	ret	0, 82, 0
