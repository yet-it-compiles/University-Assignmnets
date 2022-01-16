; Projected Created by Tyler S. Unsworth
; SID: 42221732
; Honor Code: I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone.

segment .data                       
        a       dw -278, 124, -172  ; declaration of array with 3 values
        b       db 38, -120, -92    ; declaration of array with 3 values
        result  dq 0                ; declaration of result 

segment .text
global  main
main: 
        movsx rax, byte[b]          ; moves the first element of array B to rax
        movsx rbx, word[a]          ; moves the first element of array B to rax
        sub rax, 10                 ; subtracts 10 from rax
        add rax, rbx                ; add rbx to rax
        mov rdx, rax                ; moves rax register to rdx register
        movsx rax, byte[b]          ; moves the element to rax
        add rax, 32                 ; add 32 to rax
        sub rax, rbx                ; subtract rbx from rax
        add rdx, rax                ; subtarct rax from rdx
        
        movsx rax, byte[b+1]        ; moves the second element to rax
        movsx rbx, word[a+2]        ; moves the element of array B to rax
        sub rax, 10                 ; subtracts 10 from rax
        add rax, rbx                ; add rbx to rax
        add rdx, rax                ; add rbx to rax
        movsx rax, byte[b+1]        ; moves the second element to rax
        add rax, 32                 ; adds 32 to rax
        sub rax, rbx                ; subtracts rbx from rax
        add rdx, rax                ; adds rax to rdx
        
        movsx rax, byte[b+2]        ; moves the first element to rax
        movsx rbx, word[a+4]        ; moves the element to rax
        sub rax, 10                 ; subtracts 10 from rax
        add rax, rbx                ; adds rbx from rax
        add rdx, rax                ; adds rax to rdx
        movsx rax, byte[b+2]        ; moves the element to rax
        add rax, 32                 ; adds 32 to rax
        sub rax, rbx                ; subtracts rbx from rax
        add rdx, rax                ; add rax to rdx
        
        mov  [result], rdx
       
        xor  rax, rax               ; zero out rax
        xor  rdx, rdx               ; zero out rdx
        xor  rbx, rbx               ; zero out rax
        ret                         ; returns the final value of -282
