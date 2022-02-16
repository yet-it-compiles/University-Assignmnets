; Projected Created by Tyler S. Unsworth
; SID: 42221732
; Honor Code: I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone.

segment             .data
arrayA              dd 14, 10, 23, 45, 17, 9, 54, 22, 1, 76 ; Declaration of array
size                dd      10                              ; Declaration of memorySize allocated to 10-1
lower               dd      0                               ; Declaration of Binary Search lower end                         
upper               dd      9                               ; Declaration of Binary Search upper end
value               dd      9                               ; Declaration of binary search target
location            dd      0                               ; Declatation of location lable

; Declaration of Print Statements
scanf_format        db    "%ld",0                                    
printf_isFound      db    "Value %ld found in location %ld",0x0a,0
printf_isNotfound   db    "Value %ld not found in array", 0x0a,0
printf_userInput    dd    "Enter a number between 1 and 100", 0x0a, 0    

                    segment .text
                    global  main                            ; lets the linker know about main     
                    global  sort                
                    global  search
                    extern  scanf               
                    extern  printf
        
                                                            ; Declaration of Sort Function Logic
                    sort: 
                    push    rbp                             ; subtracts 8 from stack pointer    
                    mov     rbp, rsp                        ; moves register rsp to rsp
                    frame   1, 0, 0
                    sub     rsp, frame_size                 ; subtracts 32 from rsp register
       
                    doesSorting:                            ; Declaration of Soring Loop
                    mov rax, 0                              ; moves the value 0 to rax to declare a count
                    mov rcx, 0                              ; moves the value 0 to rcx to declare a binary option of t/f
      
                    compare_Elements:                       ; Declaration of comparison logic
                    movsx rbx, word[arrayA + rax * 4]       ; looks and then takes the first index
                    movsx rdx, word[arrayA + rax * 4 + 4]   ; then takes the index element next in
                    cmp rbx, rdx                            ; compares rdx register to rbx register
       
                    jbe no_Rotation                         ; jumps if its not <= to 
       
                    mov [arrayA + rax * 4], dx              ; swaps what was in rbx register
                    mov [arrayA + rax * 4 + 4], bx          ; swaps what was in rdx register
                    mov rcx, 1                              ; sets rcx ; swabs what was in rdx register to true
       
                    no_Rotation:                            ; Declaration of function to not swap the numbers 
                    add rax, 1                              ; increments rax by 1
                    mov bx, word[size]                      ; moves size into bx register
                    dec rbx                                 ; deincrements rbx register by 1
                    cmp rax, rbx                            ; compares srbx register to rax register
                    jne compare_Elements                    ; jumps if not zero
            
                    cmp rcx, 0                              ; compares 0 to rcx register         
                    je zeros_out                            ; calls method to zero out registers
                    jmp main                                ; jumps back   
                
                    zeros_out:                              ; Declatation of function that zero's out the used registers
                    xor rax, rax
                    xor rbx, rbx
                    xor rcx, rcx
                    xor rdx, rdx    
                 
                    leave
                    ret
                                   
; Declaration of Search Function
search:
nums                equ local1                              ; Variable searching for
                    push rbp                                ; subtracts 8 from stack pointer
                    mov rbp, rsp                            ; mov rsp into rbp
                    frame 1, 1, 0                           ; sets frame size
                    sub rsp, frame_size                     ; subtracts frame-size from rsp
                    mov [rbp + nums], rcx                   ; moves rex, to the value of rbp+num


                    searcher:                               ; Declaration of Searcher Loop
                    mov             rcx, 0                  ; moves 0 to rcx register
mov                 rbx, 9                                  ; moves 9 to rbx register

comparison:                                                 ; Declaration of Comparison Function
cmp                 ecx, ebx
jg                  failed_Test

mov                 eax, ebx
sub                 eax, ecx
shr                 eax, 1
add                 eax, ecx
movsx               edx, word[arrayA + eax * 4]

cmp                 [value], edx

jb                  below_Function                          ;  ; jumps if  <
ja                  above_Function                          ;  ; jumps if  >

jmp                 shifting                                ; jumps to the shifting function

shifting            :
                    mov [location], eax                     ; Moves eax register into the value of location
                   
                    mov [rbp+nums], ecx                     ; moves ecx regitser value into rbp + num
                    leave                                   ; Call included in outline
                    ret                                     ; Call included in outline

above_Function: 
                    mov ecx, eax                            ;  moves the middle into the lower partition
                    inc ecx                                 ; increment by 1
                    jmp comparison                         ; jumps back into comparison when finished

below_Function:
                    mov ebx, eax                            ; moves to the upper partition
                    dec ebx                                 ; decreases by 1
                    jmp comparison                          ;  Jumps to comparison function
                    
                    failed_Test:
                    mov eax, -1                                                    

; Declaration of Main
main:
                    push    rbp                                 
                    mov     rbp, rsp
                    frame    0,0,3                          ; Initializes the frame
                    sub      rsp, frame_size                ; Subtracts frame_size from rsp register
                
                    call sort                               ; Calls sort function
                
                    lea rcx, [printf_userInput]
                
                    call printf

lea                 rcx, [scanf_format]
lea                 rdx, [value]
call                scanf

call                search

cmp                 eax, -1
je                  valueFound


valueFound:                                            
                    lea rcx,[printf_isFound]                ; load the print_found into rcx
                    movsx rdx,word[value]                   ; move the value needed into rdc
                    mov   r8, rax                           ; move rax into r8 register
                    call printf                             ; call printf/ 2nd parameter     
                    jmp endMain                             ; jump to end of main

valueNotFound:
                    lea  rcx,[printf_isNotfound]            ; loads into rcx
                    movsx  rdx, word[value]                 ; moves value into rdx register                         
                    call printf                             ; calls printf 
                    jmp endMain                             ; jumps to the end of Main

endMain:                              
                    leave                              
                    ret                                     




