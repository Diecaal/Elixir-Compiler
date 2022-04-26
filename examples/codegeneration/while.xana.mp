
#source	"while.xana"


' Invocation to the main function
call main
halt


#line	1

main:
	' Parameters
	' Local variables
	' i :: int (offset -2)
	enter	2

#line	4
	push	bp
	pushi	-2
	addi
	pushi	0
	storei

#line	5
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

#line	6
	' Write
	push	bp
	pushi	-2
	addi
	loadi
	outi
	' Write
	pushb	10
	outb

#line	7
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
	jmp	label0
label1:
	ret	0, 2, 0
