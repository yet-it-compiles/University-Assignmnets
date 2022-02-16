; Projected Created by Tyler S. Unsworth
; SID: 42221732
; Honor Code: I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone.

segment .data                       
        grade1  dq  89          ; declares grade 1 to be 89 
        grade2  dq  82          ; declares grade 1 to be 82
        grade3  dq  71          ; declares grade 1 to be 71
        grade4  dq  70          ; declares grade 1 to be 70
        numsOfGrades dq   4     ;
        average dq  0           ; declares a variable which will store the avg of the grades
        remainder dq 0          ; declares a variable which will store the reminader of the grades
   
segment .text
global  main
main: 

        mov rax, [grade1]       ; moves 89 into rax
        add rax, [grade2]       ; adds 82 to rax
        add rax, [grade3]       ; adds 71 to rax
        add rax, [grade4]       ; adds 70 to rax
        mov rbx, [numsOfGrades] ; has 4
        xor rdx, rdx            ; 0's out rdx where the reminader is stored
        idiv rbx                ; divides 312/4
        mov [average], rax      ; sets average to rax
        mov [remainder], rdx    ; sets remainder to the remainder
        ret
