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
        Me.lblTitle = New System.Windows.Forms.Label()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.txtNumGrd = New System.Windows.Forms.TextBox()
        Me.lblLetGrd = New System.Windows.Forms.Label()
        Me.btnDecide = New System.Windows.Forms.Button()
        Me.btnClear = New System.Windows.Forms.Button()
        Me.btnExit = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'lblTitle
        '
        Me.lblTitle.AutoSize = True
        Me.lblTitle.Location = New System.Drawing.Point(88, 31)
        Me.lblTitle.Name = "lblTitle"
        Me.lblTitle.Size = New System.Drawing.Size(257, 21)
        Me.lblTitle.TabIndex = 0
        Me.lblTitle.Text = "Determine student's letter grade"
        Me.lblTitle.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(35, 88)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(256, 21)
        Me.Label1.TabIndex = 1
        Me.Label1.Text = "Enter student's numerical grade:"
        Me.Label1.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(71, 143)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(220, 21)
        Me.Label2.TabIndex = 2
        Me.Label2.Text = "Corresponding letter grade:"
        Me.Label2.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'txtNumGrd
        '
        Me.txtNumGrd.Location = New System.Drawing.Point(297, 85)
        Me.txtNumGrd.Name = "txtNumGrd"
        Me.txtNumGrd.Size = New System.Drawing.Size(100, 29)
        Me.txtNumGrd.TabIndex = 3
        Me.txtNumGrd.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        '
        'lblLetGrd
        '
        Me.lblLetGrd.BackColor = System.Drawing.Color.White
        Me.lblLetGrd.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.lblLetGrd.Location = New System.Drawing.Point(297, 137)
        Me.lblLetGrd.Name = "lblLetGrd"
        Me.lblLetGrd.Size = New System.Drawing.Size(100, 32)
        Me.lblLetGrd.TabIndex = 4
        Me.lblLetGrd.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'btnDecide
        '
        Me.btnDecide.Location = New System.Drawing.Point(35, 230)
        Me.btnDecide.Name = "btnDecide"
        Me.btnDecide.Size = New System.Drawing.Size(172, 45)
        Me.btnDecide.TabIndex = 5
        Me.btnDecide.Text = "Get Letter Grade"
        Me.btnDecide.UseVisualStyleBackColor = True
        '
        'btnClear
        '
        Me.btnClear.Location = New System.Drawing.Point(225, 230)
        Me.btnClear.Name = "btnClear"
        Me.btnClear.Size = New System.Drawing.Size(75, 44)
        Me.btnClear.TabIndex = 6
        Me.btnClear.Text = "Clear"
        Me.btnClear.UseVisualStyleBackColor = True
        '
        'btnExit
        '
        Me.btnExit.Location = New System.Drawing.Point(322, 230)
        Me.btnExit.Name = "btnExit"
        Me.btnExit.Size = New System.Drawing.Size(75, 44)
        Me.btnExit.TabIndex = 7
        Me.btnExit.Text = "Exit"
        Me.btnExit.UseVisualStyleBackColor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(10.0!, 21.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.Gainsboro
        Me.ClientSize = New System.Drawing.Size(433, 287)
        Me.Controls.Add(Me.btnExit)
        Me.Controls.Add(Me.btnClear)
        Me.Controls.Add(Me.btnDecide)
        Me.Controls.Add(Me.lblLetGrd)
        Me.Controls.Add(Me.txtNumGrd)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.lblTitle)
        Me.Font = New System.Drawing.Font("Segoe UI", 12.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point)
        Me.Margin = New System.Windows.Forms.Padding(4)
        Me.Name = "Form1"
        Me.Text = "Determine Letter Grade"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents lblTitle As Label
    Friend WithEvents Label1 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents txtNumGrd As TextBox
    Friend WithEvents lblLetGrd As Label
    Friend WithEvents btnDecide As Button
    Friend WithEvents btnClear As Button
    Friend WithEvents btnExit As Button
End Class
