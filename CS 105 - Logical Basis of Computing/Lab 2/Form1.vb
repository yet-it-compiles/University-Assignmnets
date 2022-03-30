' Tyler S. Unsworth
' I pledge that I have neither given nor received help from anyone 
' other than the instructor and TA for all program components included here
Public Class Form1
    Private Sub btnDisplayMessage_Click(sender As Object, e As EventArgs) Handles btnDisplayMessage.Click
        'change the Text property of lblMessage
        lblMessage.Text = "Hello World!"
    End Sub

    Private Sub btnDisplayImage_Click(sender As Object, e As EventArgs) Handles btnDisplayImage.Click
        'make the PictureBox visible by overwriting False to True for Visible property
        picDisplayImage.Visible = True
    End Sub
End Class
