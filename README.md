# Bijuterii
Examen---nota 10

Într-un fisier text se vor reţine, în format CSV, următoarele câmpuri:
-denumire	:String (maxim 15 caractere)
    -tip		:String (maxim 15 caractere)
    -stocInitial (Cantitatea iniţială)		:int (>0)
    -vandute     (Nr de obiecte vândute)	:int (>=0)
    -pretUnit						:int (>0)
Fişierul  Bijuterii.txt:
(denumire,tip,stocInitial,vandute,PretUnit)
Inel,aur,100,10,200
Inel,argint,150,150,300
Inel,platina,50,4,100
Inel,rubin,150,15,125
Cercel,argint,200,180,250
Cercel,rubin,75,75,225
Cercel,aur,130,20,500
Cercel,platina,125,0,400
Se cere un program care are funcţionalitate  multiplă  (cu meniu) şi cerinţele (1), (2), (3):
Citirea corectă a datelor din fişier ..........................................................................................................................	(1)
Tabel afişat la cumpărător (s-au afişat diferenţele, iar unde diferenţa este 0, nu s-a afişat obiectul respectiv)......	(2)
Denumire   	Tip	Disponibile	PretUnit	Valoare disponibile
Inel	aur	90(=100-10)	200	18000(=90*200)
Inel   	platina	46(=50-4)	100	4600(=46*100)
Inel    	rubin	135(=150-10)	125	16875(=135*125)
Cercel	argint	20(=200-180)	250	5000(=20*250)
Cercel	aur	110(=130-20)	500	55000(=110*500)
Cercel 	platina	125(=125-0)	400	50000(=125*400)
						Total(Val.marfa  disp.) =  149475 lei
Tabel cu mărfurile care s-au vandut sub 50% din StocInit:.......................................................................................    (3)
Denumire   	Tip	StocInit	Vandute	PretUnit	ValoareVandute
Inel	aur	100	10	200	2000(=10*200)
Inel   	platina	50	4	100	400(=4*100)
Inel    	rubin	150	15	125	1875(=15*125)
Cercel	aur	130	20	500	10000(=20*500)
Cercel 	platina	125	0	400	    0 (=0*500)
									Total = 14275 lei
Barem:
-	funcţionalitate  completă (1,2,3)   		- 10
-	funcţionalităţi  (1,2) sau (1,3)	-   8
-	funcţionalităţi  (1)		-   6
-	fără erori la compilare, nici-o funcţionalitate   - 5
 */
