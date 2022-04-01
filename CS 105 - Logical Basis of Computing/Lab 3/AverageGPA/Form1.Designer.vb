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
        Me.lblGPA1 = New System.Windows.Forms.Label()
        Me.lblGpa2 = New System.Windows.Forms.Label()
        Me.lblAverage = New System.Windows.Forms.Label()
        Me.txtGpa1 = New System.Windows.Forms.TextBox()
        Me.txtGpa2 = New System.Windows.Forms.TextBox()
        Me.lblAverageValue = New System.Windows.Forms.TextBox()
        Me.btnCalculate = New System.Windows.Forms.Button()
        Me.btnClear = New System.Windows.Forms.Button()
        Me.btnExit = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'lblGPA1
        '
        Me.lblGPA1.AutoSize = True
        Me.lblGPA1.Location = New System.Drawing.Point(160, 83)
        Me.lblGPA1.Name = "lblGPA1"
        Me.lblGPA1.Size = New System.Drawing.Size(119, 15)
        Me.lblGPA1.TabIndex = 0
        Me.lblGPA1.Text = "Enter first GPA value: "
        '
        'lblGpa2
        '
        Me.lblGpa2.AutoSize = True
        Me.lblGpa2.Location = New System.Drawing.Point(160, 127)
        Me.lblGpa2.Name = "lblGpa2"
        Me.lblGpa2.Size = New System.Drawing.Size(137, 15)
        Me.lblGpa2.TabIndex = 1
        Me.lblGpa2.Text = "Enter second GPA value: "
        '
        'lblAverage
        '
        Me.lblAverage.AutoSize = True
        Me.lblAverage.Location = New System.Drawing.Point(160, 171)
        Me.lblAverage.Name = "lblAverage"
        Me.lblAverage.Size = New System.Drawing.Size(112, 15)
        Me.lblAverage.TabIndex = 2
        Me.lblAverage.Text = "Average GPA value: "
        '
        'txtGpa1
        '
        Me.txtGpa1.Location = New System.Drawing.Point(335, 75)
        Me.txtGpa1.Name = "txtGpa1"
        Me.txtGpa1.Size = New System.Drawing.Size(100, 23)
        Me.txtGpa1.TabIndex = 3
        '
        'txtGpa2
        '
        Me.txtGpa2.Location = New System.Drawing.Point(335, 124)
        Me.txtGpa2.Name = "txtGpa2"
        Me.txtGpa2.Size = New System.Drawing.Size(100, 23)
        Me.txtGpa2.TabIndex = 4
        '
        'lblAverageValue
        '
        Me.lblAverageValue.Location = New System.Drawing.Point(335, 168)
        Me.lblAverageValue.Name = "lblAverageValue"
        Me.lblAverageValue.Size = New System.Drawing.Size(100, 23)
        Me.lblAverageValue.TabIndex = 5
        '
        'btnCalculate
        '
        Me.btnCalculate.Location = New System.Drawing.Point(197, 312)
        Me.btnCalculate.Name = "btnCalculate"
        Me.btnCalculate.Size = New System.Drawing.Size(75, 38)
        Me.btnCalculate.TabIndex = 6
        Me.btnCalculate.Text = "Calculate Average"
        Me.btnCalculate.UseVisualStyleBackColor = True
        '
        'btnClear
        '
        Me.btnClear.Location = New System.Drawing.Point(324, 320)
        Me.btnClear.Name = "btnClear"
        Me.btnClear.Size = New System.Drawing.Size(75, 23)
        Me.btnClear.TabIndex = 7
        Me.btnClear.Text = "Clear"
        Me.btnClear.UseVisualStyleBackColor = True
        '
        'btnExit
        '
        Me.btnExit.Location = New System.Drawing.Point(429, 320)
        Me.btnExit.Name = "btnExit"
        Me.btnExit.Size = New System.Drawing.Size(75, 23)
        Me.btnExit.TabIndex = 8
        Me.btnExit.Text = "Exit"
        Me.btnExit.UseVisualStyleBackColor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(7.0!, 15.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(800, 450)
        Me.Controls.Add(Me.btnExit)
        Me.Controls.Add(Me.btnClear)
        Me.Controls.Add(Me.btnCalculate)
        Me.Controls.Add(Me.lblAverageValue)
        Me.Controls.Add(Me.txtGpa2)
        Me.Controls.Add(Me.txtGpa1)
        Me.Controls.Add(Me.lblAverage)
        Me.Controls.Add(Me.lblGpa2)
        Me.Controls.Add(Me.lblGPA1)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents lblGPA1 As Label
    Friend WithEvents lblGpa2 As Label
    Friend WithEvents lblAverage As Label
    Friend WithEvents txtGpa1 As TextBox
    Friend WithEvents txtGpa2 As TextBox
    Friend WithEvents lblAverageValue As TextBox
    Friend WithEvents btnCalculate As Button
    Friend WithEvents btnClear As Button
    Friend WithEvents btnExit As Button
End Class
