# Lambda függvény
1.  Készíts különböző névtelen függvényeket. Készítsd el őket rövidebb és hosszabb alakjaikban is. 
    Próbáld ki, mennyivel gyorsabb, ha primitív típussal dolgozol.
    Néhány a legfontosabb lambda-interfészek közül (az első kivételével a java.util.function csomag osztályai):
    * Ø → Ø: Runnable
    * Ø → T: Supplier
      * Ø → primitív: PPPSupplier, pl. IntSupplier
    * T → Ø: Consumer
      * primitív → Ø: PPPConsumer
    * T1 → T2: Function
    * T → boolean: Predicate
    * T1, T2 → T3: BiFunction
2.  Készíts olyan lambdát, amely többször meghívva a pozitív egész számokat adja ki.
3.  Készíts olyan lambdát, amely többször kiírja a beérkező számokat.
4.  Készíts faktoriális lambdát.
5.  Készíts Fibonacci lambdát.
6.  Készíts olyan lambdát, amely két Map<String, Integer> paramétert kap, és ilyet is állít elő; az eredményben az adott szöveghez hozzárendelt érték az eredetiek összege legyen.
7.  Készíts olyan lambdát, amely megadja egy számról, hogy prím-e.
8.  Készíts olyan lambdát, amely a prímszámokat állítja elő sorban. (Ennek kell, hogy legyen állapota is.)
9.  Készíts olyan lambdát, amely a sík pontjait állítja elő (valamilyen) sorrend szerint.
10. Készíts olyan lambdát, amely egy Supplier-t kap, és önmaga is Supplier: először a “belső” Supplier első elemét, aztán az első két elemét, aztán az első három elemét stb. adja ki.
11. Készíts olyan lambdát, amely paraméterként egy BiFunction-t kap, és olyan BiFunction az eredménye, amely az eredetivel megegyező működésű, de fordítva vannak a paraméterei.
12. Készíts olyan lambdát, amely két IntBinaryOperator (matematikai értelemben vett) kompozícióját képzi. Azaz, a paraméterei két IntBinaryOperator, és ilyennel is tér vissza: a két paraméter kompozíciójával.
13. Készíts olyan lambdát, amely két függvényt kap (ezek Integer értéket állítanak elő), és olyan predikátumot ad ki, amely akkor ad igaz értéket, ha a predikátum paraméterére az első függvényt alkalmazva nagyobb szám adódik, mint a második paramétert alkalmazva. A predikátum és a függvények bemenő paramétere legyen valamilyen rögzített típus, pl. String.
14. Az Arrays.sort művelet második paraméterként kaphat egy lambdát, ami az összehasonlító rendezés feltételét írja le. Rendezd a parancssori paramétereket…
    * a hosszuk szerinti sorrendbe
    * a számokat elöl (szám szerint), utána a nem-szám szövegeket (ábécésorrendben)
