-- IFNULL(컬럼명, 바꿀값) 을 통해 NULL값을 다른 값으로 치환 할 수 있다.
SELECT ANIMAL_TYPE , IFNULL(NAME, "No name") as NAME, SEX_UPON_INTAKE FROM ANIMAL_INS
ORDER BY ANIMAL_ID;