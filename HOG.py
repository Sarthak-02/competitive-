import cv2
import matplotlib.pyplot as plt

from skimage.feature import hog
from skimage import data, color, exposure

img = cv2.imread("path/of/the/file")
image = color.rgb2gray(img)
fd, hog_image = hog(image, orientations=8, pixels_per_cell=(8, 8),cells_per_block=(1, 1), visualise=True)


**************************************************************************************************************************

using openCV

img = cv2.imread("path/of/the/file")
hog = cv2.HOGDescriptor()
h = hog.compute(img)
