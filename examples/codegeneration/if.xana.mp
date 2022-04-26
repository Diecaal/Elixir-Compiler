
#source	"if.xana"


' Invocation to the main function
call main
halt


#line	1

main:
	' Parameters
	' Local variables
	' value :: int (offset -2)
	enter	2

#line	2
	' If statement
	pushi	1
	pushi	1
	eqi
	jz	label0
	' Body of the if branch

#line	3
	' Write
	pushb	97
	outb
	' Write
	pushb	108
	outb
	' Write
	pushb	119
	outb
	' Write
	pushb	97
	outb
	' Write
	pushb	121
	outb
	' Write
	pushb	115
	outb
	' Write
	pushb	32
	outb
	' Write
	pushb	116
	outb
	' Write
	pushb	114
	outb
	' Write
	pushb	117
	outb
	' Write
	pushb	101
	outb
	' Write
	pushb	10
	outb
	jmp	label1
label0:
	' Body of the else branch
label1:

#line	5
	' Write
	pushb	10
	outb

#line	8
	' Read
	push	bp
	pushi	-2
	addi
	ini
	storei

#line	9
	' If statement
	pushi	1
	push	bp
	pushi	-2
	addi
	loadi
	eqi
	jz	label2
	' Body of the if branch

#line	10
	' Write
	pushb	116
	outb
	' Write
	pushb	114
	outb
	' Write
	pushb	117
	outb
	' Write
	pushb	101
	outb
	' Write
	pushb	10
	outb
	jmp	label3
label2:
	' Body of the else branch

#line	12
	' Write
	pushb	102
	outb
	' Write
	pushb	97
	outb
	' Write
	pushb	108
	outb
	' Write
	pushb	115
	outb
	' Write
	pushb	101
	outb
	' Write
	pushb	10
	outb
label3:
	ret	0, 2, 0
