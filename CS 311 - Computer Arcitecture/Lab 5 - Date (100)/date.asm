; Projected Created by Tyler S. Unsworth
; SID: 42221732
; Honor Code: I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone.
; 21, 5, 2021 (answer) - todays due date

segment .data
        t       dw  0x52B5  ; declaration of lable t to equal 21173
        day     dw  0       ; declaration of lable day to 0
        month   db  0       ; declaration of lable day to 0
        year    dw  1980    ; declaration of lable year to 1980
        
        segment .text
global  main                ; let the linker know about main
main: 
                            ; for finding year 9-15
        XOR EDX, EDX        ; 0's out EDX
        mov DX, [t]         ; moves the value of t, to DX
        shr DX,  9          ; shifts DX to the right by 9
        add DX,  [year]     ; moves the value of year into DX
        mov [year], DX      ; moves DX into year
        XOR EDX, EDX        ; 0's out EDX
       
                            ; for finding month 5-8
        mov BX, [t]         ; stores the value of t in BX
        shr BX, 5           ; shifts BX to the right by 5
        and BX, 0xf         ; mask of 15
        add [month], BX     ; adds BX to the month
        XOR BX,BX           ; 0's out BX
       
                            ; for finding day 0-4
        mov DX, [t]         ; moves the value of t to DX
        shr DX, 0           ; shifts DX to the right by 0
        and DX, 0x1f        ; mask of 31
        mov [day],DX        ; moves DX to day
        XOR DX,DX           ; 0's out DX
        ret		    ; returns the value
