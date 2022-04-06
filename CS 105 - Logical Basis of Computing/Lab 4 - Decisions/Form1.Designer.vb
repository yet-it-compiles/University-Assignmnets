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
        Me.grpIntegerValue = New System.Windows.Forms.GroupBox()
        Me.btnModifyInteger = New System.Windows.Forms.Button()
        Me.txtIntegerValue = New System.Windows.Forms.TextBox()
        Me.lblIntegerValue = New System.Windows.Forms.Label()
        Me.grpTestResult = New System.Windows.Forms.GroupBox()
        Me.btnTestResult = New System.Windows.Forms.Button()
        Me.txtGradeValue = New System.Windows.Forms.TextBox()
        Me.lblGradeValue = New System.Windows.Forms.Label()
        Me.btnClear = New System.Windows.Forms.Button()
        Me.btnExit = New System.Windows.Forms.Button()
        Me.grpIntegerValue.SuspendLayout()
        Me.grpTestResult.SuspendLayout()
        Me.SuspendLayout()
        '
        'lblTitle
        '
        Me.lblTitle.AutoSize = True
        Me.lblTitle.Location = New System.Drawing.Point(76, 40)
        Me.lblTitle.Name = "lblTitle"
        Me.lblTitle.Size = New System.Drawing.Size(331, 21)
        Me.lblTitle.TabIndex = 0
        Me.lblTitle.Text = "Learning to make decisions in Visual Basic"
        Me.lblTitle.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'grpIntegerValue
        '
        Me.grpIntegerValue.Controls.Add(Me.btnModifyInteger)
        Me.grpIntegerValue.Controls.Add(Me.txtIntegerValue)
        Me.grpIntegerValue.Controls.Add(Me.lblIntegerValue)
        Me.grpIntegerValue.Location = New System.Drawing.Point(55, 95)
        Me.grpIntegerValue.Name = "grpIntegerValue"
        Me.grpIntegerValue.Size = New System.Drawing.Size(373, 187)
        Me.grpIntegerValue.TabIndex = 1
        Me.grpIntegerValue.TabStop = False
        Me.grpIntegerValue.Text = "Part 1: Modify Integer"
        '
        'btnModifyInteger
        '
        Me.btnModifyInteger.Location = New System.Drawing.Point(81, 105)
        Me.btnModifyInteger.Name = "btnModifyInteger"
        Me.btnModifyInteger.Size = New System.Drawing.Size(169, 37)
        Me.btnModifyInteger.TabIndex = 2
        Me.btnModifyInteger.Text = "Modify Integer Value"
        Me.btnModifyInteger.UseVisualStyleBackColor = True
        '
        'txtIntegerValue
        '
        Me.txtIntegerValue.Location = New System.Drawing.Point(225, 47)
        Me.txtIntegerValue.Name = "txtIntegerValue"
        Me.txtIntegerValue.Size = New System.Drawing.Size(100, 29)
        Me.txtIntegerValue.TabIndex = 1
        '
        'lblIntegerValue
        '
        Me.lblIntegerValue.AutoSize = True
        Me.lblIntegerValue.Location = New System.Drawing.Point(37, 50)
        Me.lblIntegerValue.Name = "lblIntegerValue"
        Me.lblIntegerValue.Size = New System.Drawing.Size(182, 21)
        Me.lblIntegerValue.TabIndex = 0
        Me.lblIntegerValue.Text = "Enter an Integer value:"
        Me.lblIntegerValue.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'grpTestResult
        '
        Me.grpTestResult.Controls.Add(Me.btnTestResult)
        Me.grpTestResult.Controls.Add(Me.txtGradeValue)
        Me.grpTestResult.Controls.Add(Me.lblGradeValue)
        Me.grpTestResult.Location = New System.Drawing.Point(55, 310)
        Me.grpTestResult.Name = "grpTestResult"
        Me.grpTestResult.Size = New System.Drawing.Size(373, 187)
        Me.grpTestResult.TabIndex = 2
        Me.grpTestResult.TabStop = False
        Me.grpTestResult.Text = "Part 2: Test Result"
        '
        'btnTestResult
        '
        Me.btnTestResult.Location = New System.Drawing.Point(81, 105)
        Me.btnTestResult.Name = "btnTestResult"
        Me.btnTestResult.Size = New System.Drawing.Size(169, 37)
        Me.btnTestResult.TabIndex = 2
        Me.btnTestResult.Text = "Text Result"
        Me.btnTestResult.UseVisualStyleBackColor = True
        '
        'txtGradeValue
        '
        Me.txtGradeValue.Location = New System.Drawing.Point(225, 47)
        Me.txtGradeValue.Name = "txtGradeValue"
        Me.txtGradeValue.Size = New System.Drawing.Size(100, 29)
        Me.txtGradeValue.TabIndex = 1
        '
        'lblGradeValue
        '
        Me.lblGradeValue.AutoSize = True
        Me.lblGradeValue.Location = New System.Drawing.Point(37, 50)
        Me.lblGradeValue.Name = "lblGradeValue"
        Me.lblGradeValue.Size = New System.Drawing.Size(175, 21)
        Me.lblGradeValue.TabIndex = 0
        Me.lblGradeValue.Text = "Enter student's grade:"
        Me.lblGradeValue.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'btnClear
        '
        Me.btnClear.Location = New System.Drawing.Point(92, 503)
        Me.btnClear.Name = "btnClear"
        Me.btnClear.Size = New System.Drawing.Size(75, 33)
        Me.btnClear.TabIndex = 3
        Me.btnClear.Text = "Clear"
        Me.btnClear.UseVisualStyleBackColor = True
        '
        'btnExit
        '
        Me.btnExit.Location = New System.Drawing.Point(319, 503)
        Me.btnExit.Name = "btnExit"
        Me.btnExit.Size = New System.Drawing.Size(75, 33)
        Me.btnExit.TabIndex = 4
        Me.btnExit.Text = "Exit"
        Me.btnExit.UseVisualStyleBackColor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(10.0!, 21.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(482, 548)
        Me.Controls.Add(Me.btnExit)
        Me.Controls.Add(Me.btnClear)
        Me.Controls.Add(Me.grpTestResult)
        Me.Controls.Add(Me.grpIntegerValue)
        Me.Controls.Add(Me.lblTitle)
        Me.Font = New System.Drawing.Font("Segoe UI", 12.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point)
        Me.Margin = New System.Windows.Forms.Padding(4)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.grpIntegerValue.ResumeLayout(False)
        Me.grpIntegerValue.PerformLayout()
        Me.grpTestResult.ResumeLayout(False)
        Me.grpTestResult.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents lblTitle As Label
    Friend WithEvents grpIntegerValue As GroupBox
    Friend WithEvents btnModifyInteger As Button
    Friend WithEvents txtIntegerValue As TextBox
    Friend WithEvents lblIntegerValue As Label
    Friend WithEvents grpTestResult As GroupBox
    Friend WithEvents btnTestResult As Button
    Friend WithEvents txtGradeValue As TextBox
    Friend WithEvents lblGradeValue As Label
    Friend WithEvents btnClear As Button
    Friend WithEvents btnExit As Button
End Class
