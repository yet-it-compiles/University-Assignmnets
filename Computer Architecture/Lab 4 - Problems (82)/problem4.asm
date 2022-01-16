; Projected Created by Tyler S. Unsworth
; SID: 42221732
; Honor Code: I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone.

segment .data                       
        a   dq  -326            ; Declares A and sets it to -326
        b dq    7               ; Declares  
        quotient    dq  0       ; Declares a quotient to 0
        remainder   dq  0       ; Declares a remainder to 0


        segment .text
global  main
main: 
        mov rax, [a]            ; moves -326 into rax register
        mov rbx, [b]            ; moves 7 into rbx register
        
        mov rdx, -1               ; moves -1 into rbx register to negate it
        
        idiv rbx                ; divides -326/7 = -46
        mov [quotient], rax     ;  assigns value to quotient
        mov [remainder], rdx    ; assigns value to remiander
        xor rdx, rdx            ; 0's out rdx register
        ret
