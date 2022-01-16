#!/usr/bin/env python3
# -*- coding: utf-8 -*-

from PIL import Image

"""
Tyler S. Unsworth
07/21/2021
ImageConverter.py
"""

"""I'm not sure why the import statement won't work, but I believe the code should work as intended"""

# Declaration of image imports
image0 = Image.open("C:\Users\bmxfr\OneDrive\Developer Files\Completed Projects\CS 112 - Python In Data Science\Project 10\Lab10Images\cwu_logo0.jpg")
image1 = Image.open("C:\Users\bmxfr\OneDrive\Developer Files\Completed Projects\CS 112 - Python In Data Science\Project 10\Lab10Images\cwu_logo1.png")
image2 = Image.open("C:\Users\bmxfr\OneDrive\Developer Files\Completed Projects\CS 112 - Python In Data Science\Project 10\Lab10Images\cwu_logo2.jpg")
image3 = Image.open("C:\Users\bmxfr\OneDrive\Developer Files\Completed Projects\CS 112 - Python In Data Science\Project 10\Lab10Images\cwu_logo3.jpg")
image4 = Image.open("C:\Users\bmxfr\OneDrive\Developer Files\Completed Projects\CS 112 - Python In Data Science\Project 10\Lab10Images\cwu_logo4.jpg")
image5 = Image.open("C:\Users\bmxfr\OneDrive\Developer Files\Completed Projects\CS 112 - Python In Data Science\Project 10\Lab10Images\cwu_logo5.jpg")

# Logic to resize image by half
img0 = image0.resize((150,77))
img1 = image1.resize((112,112))
img2 = image2.resize((112,112))
img3 = image3.resize((244,51))
img4 = image4.resize((112,112))
img5 = image5.resize((112,112))

# converts to gray scale
img0_gc = img0.convert('L')
img1_gc = img1.convert('L')
img2_gc = img2.convert('L')
img3_gc = img3.convert('L')
img4_gc = img4.convert('L')
img5_gc = img5.convert('L')

# Calls the image
img0_gc.show()
img1_gc.show()
img2_gc.show()
img3_gc.show()
img4_gc.show()
img5_gc.show()

# Logic to save file in another folder
img0_gc.save("C:\Users\bmxfr\OneDrive\Developer Files\Completed Projects\CS 112 - Python In Data Science\Project 10\
grey_resized_logos/cwu_logo0.jpg")
img1_gc.save("C:\Users\bmxfr\OneDrive\Developer Files\Completed Projects\CS 112 - Python In Data Science\Project 10\
grey_resized_logos/cwu_logo1.jpg")
img2_gc.save("C:\Users\bmxfr\OneDrive\Developer Files\Completed Projects\CS 112 - Python In Data Science\Project 10\
grey_resized_logos//cwu_logo2.jpg")
img3_gc.save("C:\Users\bmxfr\OneDrive\Developer Files\Completed Projects\CS 112 - Python In Data Science\Project 10\
grey_resized_logos/cwu_logo3.jpg")
img4_gc.save("C:\Users\bmxfr\OneDrive\Developer Files\Completed Projects\CS 112 - Python In Data Science\Project 10\
grey_resized_logos/cwu_logo4.jpg")
img5_gc.save("C:\Users\bmxfr\OneDrive\Developer Files\Completed Projects\CS 112 - Python In Data Science\Project 10\
grey_resized_logos/cwu_logo5.jpg")



