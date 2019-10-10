asm2:
	<+0>:	push   ebp
	<+1>:	mov    ebp,esp						; Function precon
	<+3>:	sub    esp,0x10                     ; 
	<+6>:	mov    eax,DWORD PTR [ebp+0xc]		; 0x18 > eax
	<+9>:	mov    DWORD PTR [ebp-0x4],eax      ; 0x18 > ebp - 0x4
	<+12>:	mov    eax,DWORD PTR [ebp+0x8]      ; 0x7  > eax
	<+15>:	mov    DWORD PTR [ebp-0x8],eax      ; 0x7  > ebp - 0x8
	<+18>:	jmp    0x50c <asm2+31>              
	<+20>:	add    DWORD PTR [ebp-0x4],0x1
	<+24>:	add    DWORD PTR [ebp-0x8],0xcc
	<+31>:	cmp    DWORD PTR [ebp-0x8],0x3937   ; cmp 0x7 to 0x3937
	<+38>:	jle    0x501 <asm2+20>				; Greater than, no jump
	<+40>:	mov    eax,DWORD PTR [ebp-0x4]      ; 0x18 > eax
	<+43>:	leave  
	<+44>:	ret    

