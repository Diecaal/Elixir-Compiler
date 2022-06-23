
#source "simple.xana"

	' i :: char (offset 0)
	' j :: int (offset 1)
	

' Invocation to the main function
call main
halt

#line	4
suma:
	' Parameters
	' a :: int (offset 8)
	' b :: double (offset 4)
	' Local variables
	' real :: double (offset -4)
	' letra :: char (offset -5)
	enter	5

#line	7
	' Return statement
	push	bp
	pushi	8
	addi
	loadi
	i2f
	push	bp
	pushi	4
	addi
	loadf
	addf
	ret	4, 5, 6

#line	11
main:
	' Parameters
	' Local variables
	enter	0

#line	12
	' Function invocation statement
	pushi	1
	pushf	2.0
	call	suma
	popf
	ret	0, 0, 0
