Public Class Form1
    Private Sub btnAdd_Click(sender As Object, e As EventArgs) Handles btnAdd.Click
        'declare variables for the two numbers and for the total
        Dim intNumber1 As Integer
        Dim intNumber2 As Integer
        Dim intTotal As Integer
        'collect user input for the two numbers
        intNumber1 = CInt(txtNumber1.Text)
        intNumber2 = CInt(txtNumber2.Text)
        'add the two numbers and store the sum in the variable total
        intTotal = intNumber1 + intNumber2
        'display the sum of the form
        lblResult.Text = "The sum is " & intTotal
    End Sub

    Private Sub Addition_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub
End Class