; Projected Created by Tyler S. Unsworth
; SID: 42221732
; Honor Code: I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone.
; Equation  =  distance, d = (x2-x1)^2 + (y2-y1)^2
segment .data                       
        x1   dq  3      ; Declares a quad word set to 3
        x2   dq  7      ; Declares a quad word set to 7
        y1   dq  2      ; Declares a quad word set to 2
        y2   dq  8      ; Declares a quad word set to 8
        result dq 0     ; the result should = sqrt(52) || 7.21 
        
        segment .text
global  main
main: 
        mov rax, [x2]   ; moves 7 into rax register
        mov rbx, [x1]   ; moves 3 into rbx register
        sub rax, rbx    ; subtracts the two registers (7-3)=4
        mov rcx, [y2]   ; moves 8 into rcx register
        mov rdx, [y1]   ; moves 2 into rdx register
        sub rcx, rdx    ; subtracts the two registers (8-2) = 6
        imul rax, rax   ; squares the value of rax to 16
        imul rcx, rcx   ; squares the value of rcx to 32
        add rax, rcx    ; 
