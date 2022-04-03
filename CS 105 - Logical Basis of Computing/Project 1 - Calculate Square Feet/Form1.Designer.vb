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
        Me.lblLength = New System.Windows.Forms.Label()
        Me.lblWidth = New System.Windows.Forms.Label()
        Me.txtLength = New System.Windows.Forms.TextBox()
        Me.txtWidth = New System.Windows.Forms.TextBox()
        Me.txtSqrFeet = New System.Windows.Forms.TextBox()
        Me.lblHeader = New System.Windows.Forms.Label()
        Me.lblSqrFeet = New System.Windows.Forms.Label()
        Me.btnCalculate = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'lblLength
        '
        Me.lblLength.AutoSize = True
        Me.lblLength.Location = New System.Drawing.Point(207, 116)
        Me.lblLength.Name = "lblLength"
        Me.lblLength.Size = New System.Drawing.Size(181, 15)
        Me.lblLength.TabIndex = 0
        Me.lblLength.Text = "Please Enter Length of The Room"
        '
        'lblWidth
        '
        Me.lblWidth.AutoSize = True
        Me.lblWidth.Location = New System.Drawing.Point(207, 185)
        Me.lblWidth.Name = "lblWidth"
        Me.lblWidth.Size = New System.Drawing.Size(176, 15)
        Me.lblWidth.TabIndex = 1
        Me.lblWidth.Text = "Please Enter Width of The Room"
        '
        'txtLength
        '
        Me.txtLength.Location = New System.Drawing.Point(412, 113)
        Me.txtLength.Name = "txtLength"
        Me.txtLength.Size = New System.Drawing.Size(100, 23)
        Me.txtLength.TabIndex = 2
        '
        'txtWidth
        '
        Me.txtWidth.Location = New System.Drawing.Point(412, 177)
        Me.txtWidth.Name = "txtWidth"
        Me.txtWidth.Size = New System.Drawing.Size(100, 23)
        Me.txtWidth.TabIndex = 3
        '
        'txtSqrFeet
        '
        Me.txtSqrFeet.Location = New System.Drawing.Point(404, 286)
        Me.txtSqrFeet.Name = "txtSqrFeet"
        Me.txtSqrFeet.Size = New System.Drawing.Size(100, 23)
        Me.txtSqrFeet.TabIndex = 4
        '
        'lblHeader
        '
        Me.lblHeader.AutoSize = True
        Me.lblHeader.Location = New System.Drawing.Point(332, 58)
        Me.lblHeader.Name = "lblHeader"
        Me.lblHeader.Size = New System.Drawing.Size(125, 15)
        Me.lblHeader.TabIndex = 5
        Me.lblHeader.Text = "Square Feet Calculator"
        '
        'lblSqrFeet
        '
        Me.lblSqrFeet.AutoSize = True
        Me.lblSqrFeet.Location = New System.Drawing.Point(234, 289)
        Me.lblSqrFeet.Name = "lblSqrFeet"
        Me.lblSqrFeet.Size = New System.Drawing.Size(164, 15)
        Me.lblSqrFeet.TabIndex = 6
        Me.lblSqrFeet.Text = "Square Feet of Carpet Needed"
        '
        'btnCalculate
        '
        Me.btnCalculate.Location = New System.Drawing.Point(371, 240)
        Me.btnCalculate.Name = "btnCalculate"
        Me.btnCalculate.Size = New System.Drawing.Size(75, 23)
        Me.btnCalculate.TabIndex = 7
        Me.btnCalculate.Text = "Calculate"
        Me.btnCalculate.UseVisualStyleBackColor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(7.0!, 15.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(800, 450)
        Me.Controls.Add(Me.btnCalculate)
        Me.Controls.Add(Me.lblSqrFeet)
        Me.Controls.Add(Me.lblHeader)
        Me.Controls.Add(Me.txtSqrFeet)
        Me.Controls.Add(Me.txtWidth)
        Me.Controls.Add(Me.txtLength)
        Me.Controls.Add(Me.lblWidth)
        Me.Controls.Add(Me.lblLength)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents lblLength As Label
    Friend WithEvents lblWidth As Label
    Friend WithEvents txtLength As TextBox
    Friend WithEvents txtWidth As TextBox
    Friend WithEvents txtSqrFeet As TextBox
    Friend WithEvents lblHeader As Label
    Friend WithEvents lblSqrFeet As Label
    Friend WithEvents btnCalculate As Button
End Class
