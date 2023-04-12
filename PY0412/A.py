import pyautogui
import time

print(pyautogui.position())
time.sleep(3)
pyautogui.moveTo(500,500,2) #x500,y500위치로 2초동안 이동