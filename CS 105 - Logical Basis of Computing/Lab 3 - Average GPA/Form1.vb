Public Class Form1
    Private Sub btnCalculate_Click(sender As Object, e As EventArgs) Handles btnCalculate.Click
        'this procedure calculates the average of two gpa values
        Dim dblGPA1 As Double
        Dim dblGPA2 As Double
        Dim dblAverage As Double
        'collect user input for the two GPA values
        dblGPA1 = CDbl(txtGpa1.Text)
        dblGPA2 = CDbl(txtGpa2.Text)
        'calculates the average
        dblAverage = (dblGPA1 + dblGPA2) / 2
        'displays the average formatted to one decimal place
        lblAverageValue.Text = dblAverage.ToString("n1")
    End Sub

    Private Sub btnClear_Click(sender As Object, e As EventArgs) Handles btnClear.Click
        'clears the TextBoxes
        txtGpa1.Text = String.Empty
        txtGpa2.Text = String.Empty
        lblAverageValue.Text = String.Empty

        'resets the focus
        txtGpa1.Focus()
    End Sub

    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnExit.Click
        'end the application by closing the window
        Me.Close()
    End Sub
End Class
