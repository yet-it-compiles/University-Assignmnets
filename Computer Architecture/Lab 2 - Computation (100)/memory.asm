; Projected Created by Tyler S. Unsworth
; SID: 42221732
; Honor Code: I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone.

    segment .data
a   db      33	; declaration of integer as byte
b   dw      33	; declaration of integer as word
c   dd      33 ; declaration of integer as double word
d   dd      16.123 ; declaration of floating point as double word
e   dw      0x7ec4 ; hexadecimal version of decimal 32452

    segment .bss
g   resw 10 ; reserves memeory for 10 words
h   resb 50  ; reserve an array of 50 bytes
i   resd 15    ; reserve an array of 15 double words

