Public Class Form1
    Private Sub btnDecide_Click(sender As Object, e As EventArgs) Handles btnDecide.Click
        ' Declare constants to know when grade cutoff should be
        Const intA_CUTOFF As Integer = 90
        Const intB_CUTOFF As Integer = 80
        Const intC_CUTOFF As Integer = 70
        Const intD_CUTOFF As Integer = 60

        ' Declare integer variable for the numerical grade
        Dim intNumGrd As Integer
        ' declare a String variable for the corresponding letter grade
        Dim strLetGrd As String
        ' collect user input from the Text property
        intNumGrd = CInt(txtNumGrd.Text)

        ' Compares the grade to the cutoff
        If (intNumGrd >= intA_CUTOFF) Then
            strLetGrd = "A"
        ElseIf (intNumGrd >= intB_CUTOFF) Then
            strLetGrd = "B"
        ElseIf (intNumGrd >= intC_CUTOFF) Then
            strLetGrd = "C"
        ElseIf (intNumGrd >= intD_CUTOFF) Then
            strLetGrd = "D"
        Else
            strLetGrd = "F"
        End If

        lblLetGrd.Text = strLetGrd
    End Sub

    Private Sub btnClear_Click(sender As Object, e As EventArgs) Handles btnClear.Click
        txtNumGrd.Text = String.Empty
        txtNumGrd.Text = ""
        lblLetGrd.Text = String.Empty
        lblLetGrd.Text = ""

        txtNumGrd.Focus()
    End Sub

    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnExit.Click
        Me.Close()
    End Sub
End Class
