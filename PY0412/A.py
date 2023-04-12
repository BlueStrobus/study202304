import pyautogui
import time

print(pyautogui.position())  #화면 크기 출력
# time.sleep(3)  #3초 쉬고
width,height = pyautogui.size()
print('width={0}, height={1}'.format(width, height))



# pyautogui.moveTo(500,500,2) #x500,y500위치로 2초동안 이동
#pyautogui.moveTo(100, 200) # x 100, y 200 위치로 바로 이동




# #화면 크기 출력
# print(pyautogui.size()) #Size(width=3840, height=2160)






####################################


# # 파일 탐색기 실행
# pyautogui.press("winleft"+"A")
# # pyautogui.write("file explorer")
# D:\A04.txt

# pyautogui.press("enter")
# time.sleep(1)

# # 파일 경로 입력
# pyautogui.write("D:\\A04.txt")
# pyautogui.press("enter")
# time.sleep(1)

# # 파일 내용 입력
# pyautogui.write("안녕안녕")