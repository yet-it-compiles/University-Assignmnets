' Tyler S. Unsworth
' I pledge that I neither given nor recieved help from anyone other than
' the instructor and TA for all program components included here
Public Class Form1
    Private Sub btnCalculate_Click(sender As Object, e As EventArgs) Handles btnCalculate.Click
        ' Declare variables for calculation
        Dim intLength As Integer
        Dim intWidth As Integer
        Dim dblSqrFeet As Integer

        ' Collect the users input
        intLength = CDbl(txtLength.Text)
        intWidth = CDbl(txtWidth.Text)

        ' Calculates the amount of square feet needed
        dblSqrFeet = (intLength * intWidth)

        ' Assigns the value to the output box
        txtSqrFeet.Text = dblSqrFeet.ToString
    End Sub

End Class
