import pyautogui as pg
import random
import time

while True:
    x = random.randint(1000, 1800)
    y = random.randint(100, 700)
    pg.moveTo(x, y, 0.5)
    time.sleep(random.random() *2)
 