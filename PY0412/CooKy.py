#망우스 버튼 누르는거 보기
import win32api
import time

while True:
    time.sleep(0.1)
    print(win32api.GetKeyState(0X01))
    # if a<0:
    #     print("마우스 웬쪽 버튼 클릭!")
    # else :
    #     pass
    