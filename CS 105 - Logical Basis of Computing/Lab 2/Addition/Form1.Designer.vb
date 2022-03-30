<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.lblNumber1 = New System.Windows.Forms.Label()
        Me.lblNumber2 = New System.Windows.Forms.Label()
        Me.btnAdd = New System.Windows.Forms.Button()
        Me.txtNumber1 = New System.Windows.Forms.TextBox()
        Me.txtNumber2 = New System.Windows.Forms.TextBox()
        Me.lblResult = New System.Windows.Forms.Label()
        Me.SuspendLayout()
        '
        'lblNumber1
        '
        Me.lblNumber1.AutoSize = True
        Me.lblNumber1.Location = New System.Drawing.Point(269, 149)
        Me.lblNumber1.Name = "lblNumber1"
        Me.lblNumber1.Size = New System.Drawing.Size(100, 15)
        Me.lblNumber1.TabIndex = 0
        Me.lblNumber1.Text = "Enter first Integer:"
        '
        'lblNumber2
        '
        Me.lblNumber2.AutoSize = True
        Me.lblNumber2.Location = New System.Drawing.Point(471, 149)
        Me.lblNumber2.Name = "lblNumber2"
        Me.lblNumber2.Size = New System.Drawing.Size(118, 15)
        Me.lblNumber2.TabIndex = 1
        Me.lblNumber2.Text = "Enter second Integer:"
        '
        'btnAdd
        '
        Me.btnAdd.Location = New System.Drawing.Point(375, 212)
        Me.btnAdd.Name = "btnAdd"
        Me.btnAdd.Size = New System.Drawing.Size(75, 23)
        Me.btnAdd.TabIndex = 2
        Me.btnAdd.Text = "Add!"
        Me.btnAdd.UseVisualStyleBackColor = True
        '
        'txtNumber1
        '
        Me.txtNumber1.Location = New System.Drawing.Point(269, 167)
        Me.txtNumber1.Name = "txtNumber1"
        Me.txtNumber1.Size = New System.Drawing.Size(100, 23)
        Me.txtNumber1.TabIndex = 4
        '
        'txtNumber2
        '
        Me.txtNumber2.Location = New System.Drawing.Point(471, 167)
        Me.txtNumber2.Name = "txtNumber2"
        Me.txtNumber2.Size = New System.Drawing.Size(100, 23)
        Me.txtNumber2.TabIndex = 5
        '
        'lblResult
        '
        Me.lblResult.BackColor = System.Drawing.SystemColors.ActiveCaption
        Me.lblResult.Location = New System.Drawing.Point(348, 259)
        Me.lblResult.Name = "lblResult"
        Me.lblResult.Size = New System.Drawing.Size(135, 30)
        Me.lblResult.TabIndex = 6
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(7.0!, 15.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(800, 450)
        Me.Controls.Add(Me.lblResult)
        Me.Controls.Add(Me.txtNumber2)
        Me.Controls.Add(Me.txtNumber1)
        Me.Controls.Add(Me.btnAdd)
        Me.Controls.Add(Me.lblNumber2)
        Me.Controls.Add(Me.lblNumber1)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents lblNumber1 As Label
    Friend WithEvents lblNumber2 As Label
    Friend WithEvents btnAdd As Button
    Friend WithEvents txtNumber1 As TextBox
    Friend WithEvents txtNumber2 As TextBox
    Friend WithEvents lblResult As Label
End Class
