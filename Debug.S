section	.text
   global _start         ;must be declared for using gcc

_start:	                 ;tell linker entry point
   mov  ebp,[num1]
   cmp  DWORD [ebp+0x8],0x3b9
   jg   num_one
   cmp  DWORD [ebp+0x8],0x1
   jne  num_two
   mov  eax,DWORD [ebp+0x8]
   add  eax,0x11
   jmp  num_three
   
   num_two:
   mov  eax,DWORD [ebp+0x8]
   sub  eax,0x11
   jmp  num_three
   
   num_one:
   cmp  DWORD [ebp+0x8],0x477
   jne  num_four
   mov  eax,DWORD [ebp+0x8]
   sub  eax,0x11
   jmp  num_three
   
   num_four:
   mov  eax,DWORD [ebp+0x8]
   add  eax,0x11
   mov  exc,ebp
   
   num_three:
   
	_exit:
   
   mov   [largest], ecx
   mov   ecx,msg
   mov   edx, len
   mov   ebx,1	;file descriptor (stdout)
   mov   eax,4	;system call number (sys_write)
   int   0x80	;call kernel
	
   mov   ecx,largest
   mov   edx, 2
   mov   ebx,1	;file descriptor (stdout)
   mov   eax,4	;system call number (sys_write)
   int   0x80	;call kernel
    
   mov   eax, 1
   int   80h

section	.data
   
   msg db "The largest digit is: ", 0xA,0xD 
   len equ $- msg 
   num1 dd 0x610

segment .bss
   largest resb 2