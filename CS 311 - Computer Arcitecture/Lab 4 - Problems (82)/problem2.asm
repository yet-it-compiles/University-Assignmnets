; Projected Created by Tyler S. Unsworth
; SID: 42221732
; Honor Code: I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone.
segment .data           ;      
        y1  dq 7        ; Declares a lable to 1
        y2  dq 7        ; Declares a lable to 7
        x1  dq 2        ; Declares a lable to 2
        x2  dq 0        ; Declares a lable to 0
                        ;
        
        
        segment .text
global  main
main: 
        xor rax, rax    ; 0's out rax
        mov rbx, [x2]   ; moves 0 into rbx
        mov rcx, [y2]   ; moves 7 into rcx
        sub rbx, [x1]   ; 0-2
        cmovz rax, [e]  ;   checks to see if its a veritcle line
        sub rcx, [y1]   ; subtracts 7 from rcx
