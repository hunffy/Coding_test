# -*- coding: utf-8 -*-
"""
Created on Wed Mar 22 12:18:39 2023

2023_03_22 문자열 예제
"""


# 1. 단어 S와 정수 I가 주어졌을 때, S의 I번째 글자를 출력하는 프로그램 만들기.

S = input("단어를 입력하세요.")
I = int(input("몇번째 글자를 출력할까요?"))

print(S[I-1])



# 2. 단어를 입력받아 단어의 길이를 출력하는 프로그램만들기.

S = input("단어를 입력하세요.")

print(len(S))


# 3. 문자열을 입력시 첫글자와 마지막글자를 출력해주는 프로그램만들기.

S = input("문자열을 입력해주세요.")

print("첫번쨰 문자:",S[0],"두번째 문자:",S[-1])


# 4. 숫자갯수, 공백없는 숫자를 입력받아 숫자들의 합을 구하기.

"""
 1. 첫째 줄 : 숫자갯수 N개 입력. 
 2. 둘째 줄 : N개의 맞는 숫자입력
 3. 셋째 줄 : 합의 결과 출력.
 
 ex ) 1. 숫자갯수 5
      2. 12345 (5자리의 숫자입력)
      3. 1+2+3+4+5 = 15값 출력.
"""

N = int(input("숫자의 자릿수를 입력하세요."))

number = list(map(int , input("숫자를 입력하세요.")))

print(sum(number))


# 5. 알파벳찾기.

"""
    1. 단어 S를 입력한다.
    2. a-z까지 알파벳중 단어S에 포함되어있다면 제일 처음등장하는위치 출력. 포함되지않았다면 -1출력.
    
    ex) apple

    0, -1, -1, -1, 4, -1, -1, -1, -1, -1, -1, 3, -1, -1, -1, 1....-1
    a,  b,  c, d, e,  f,  g,  h,  i,  j,  k,  l, m,  n,  o,  p ....z
"""

S= input("단어를 입력하세요.")

a = list(range(97,123)) # 아스키코드 숫자범위 97~122

for i in a :
    print(S.find(chr(i))," ", end='') # chr함수는 아스키코드에 해당하는 숫자를 문자열로 변환해주는 함수.
                                      # find함수는 해당문자의 위치값을 반환해주는 함수..
    
