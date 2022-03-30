<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()>
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
    <System.Diagnostics.DebuggerStepThrough()>
    Private Sub InitializeComponent()
        Me.btnDisplayMessage = New System.Windows.Forms.Button()
        Me.lblMessage = New System.Windows.Forms.Label()
        Me.btnDisplayImage = New System.Windows.Forms.Button()
        Me.picDisplayImage = New System.Windows.Forms.PictureBox()
        CType(Me.picDisplayImage, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'btnDisplayMessage
        '
        Me.btnDisplayMessage.Font = New System.Drawing.Font("Segoe UI", 9.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point)
        Me.btnDisplayMessage.Location = New System.Drawing.Point(551, 165)
        Me.btnDisplayMessage.Name = "btnDisplayMessage"
        Me.btnDisplayMessage.Size = New System.Drawing.Size(128, 46)
        Me.btnDisplayMessage.TabIndex = 0
        Me.btnDisplayMessage.Text = "Display Message"
        Me.btnDisplayMessage.UseVisualStyleBackColor = True
        '
        'lblMessage
        '
        Me.lblMessage.AutoSize = True
        Me.lblMessage.Font = New System.Drawing.Font("Segoe UI", 9.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point)
        Me.lblMessage.Location = New System.Drawing.Point(644, 136)
        Me.lblMessage.Name = "lblMessage"
        Me.lblMessage.Size = New System.Drawing.Size(96, 15)
        Me.lblMessage.TabIndex = 1
        Me.lblMessage.Text = "Click the button"
        '
        'btnDisplayImage
        '
        Me.btnDisplayImage.Font = New System.Drawing.Font("Segoe UI", 9.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point)
        Me.btnDisplayImage.Location = New System.Drawing.Point(703, 165)
        Me.btnDisplayImage.Name = "btnDisplayImage"
        Me.btnDisplayImage.Size = New System.Drawing.Size(128, 46)
        Me.btnDisplayImage.TabIndex = 2
        Me.btnDisplayImage.Text = "Display Image"
        Me.btnDisplayImage.UseVisualStyleBackColor = True
        '
        'picDisplayImage
        '
        Me.picDisplayImage.Image = Global.HelloWorld.My.Resources.Resources.one_year_of_react_native
        Me.picDisplayImage.Location = New System.Drawing.Point(265, 217)
        Me.picDisplayImage.Name = "picDisplayImage"
        Me.picDisplayImage.Size = New System.Drawing.Size(900, 858)
        Me.picDisplayImage.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.picDisplayImage.TabIndex = 3
        Me.picDisplayImage.TabStop = False
        Me.picDisplayImage.Visible = False
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(7.0!, 15.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(1450, 1174)
        Me.Controls.Add(Me.picDisplayImage)
        Me.Controls.Add(Me.btnDisplayImage)
        Me.Controls.Add(Me.lblMessage)
        Me.Controls.Add(Me.btnDisplayMessage)
        Me.Name = "Form1"
        Me.Text = "HelloWorld"
        CType(Me.picDisplayImage, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents btnDisplayMessage As Button
    Friend WithEvents lblMessage As Label
    Friend WithEvents btnDisplayImage As Button
    Friend WithEvents picDisplayImage As PictureBox
End Class
