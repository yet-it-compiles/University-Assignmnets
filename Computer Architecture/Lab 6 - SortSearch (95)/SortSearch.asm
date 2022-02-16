; Projected Created by Tyler S. Unsworth
; SID: 42221732
; Honor Code: I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone.
        
segment         .data
arrayA          dd 14, 10, 23, 45, 17, 9, 54, 22, 1, 76 ; Declaration of array
size            dd      10                              ; Declaration of memorySize allocated to 10-1
lower           dd      0                               ; Declaration of Binary Search lower end                         
upper           dd      9                               ; Declaration of Binary Search upper end
value           dd      9                               ; Declaration of binary search target
location        dd      0                               ; Declatation of location lable


                segment .text
                global  main                            ; lets the linker know about main
main:
                                                        ; Declaration of Bubble Sort Algorithm
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
                add rax  , 1                            ; increments rax by 1
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
            
;Declaration of Binary Search Algorithm                                    
                                                        ; Initalizes Binary Search fields
mov             rcx, 0                                  ; moves 0 to rcx register
mov             rbx, 9                                  ; moves 9 to rbx register

search: 
cmp             rcx, rbx                                ; compares rbx register to rcx register
jg              failed_Test  
                                          
mov             rax, rbx
sub             rax, rcx
                                                        ; mov rbx register into rax register
shr             rax, 1                                  ; shifts rax by 1 !!!
add             rax, rcx                                ; adds rcx register to rax register
movsx           rdx, word[arrayA + rax * 4]             ; moves arrayA + rax * 4 to rdx register
                                 

cmp             [value], rdx                            ; compares rdx register to value of [value]

jb              lower_function                          ; jumps if < 
ja              upper_function                          ; jumps if >

mov             [location], rax                         ; moves rax to location

jmp             zeros_out_2
lower_function:                                         ; moves what is in the middle to rbx
mov             rbx, rax                                ; moves rax register to rbx register
dec             rbx                                     ; deincrements rbx register by 1
jmp             search                                  ; jumps to the search function

upper_function:                                         ; declaration of above function
mov             rcx, rax                                ; moves rax into rcx
inc             rcx                                     ; increments rcx by 1
jmp             search                                  ; jump to search function

failed_Test:
mov             eax, -1                                 ; moves -1 to eax to represent not found / undefined

                zeros_out_2:                            ; Declatation of function that zero's out the used registers
                xor rax, rax
                xor rbx, rbx
                xor rcx, rcx
                xor rdx, rdx