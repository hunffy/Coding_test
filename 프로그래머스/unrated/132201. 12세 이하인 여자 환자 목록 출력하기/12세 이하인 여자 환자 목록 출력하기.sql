-- 코드를 입력하세요
SELECT pt_name , pt_no, gend_cd, age,
if(tlno is null , 'NONE', tlno) as tlno
from patient
where gend_cd = 'w' and age<=12
order by age desc, pt_name asc;