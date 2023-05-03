class Instrumentmain
{
public static void main(String args[])
{
Instrument A[] = new Instrument[12];
for (int iLoop=0; iLoop<12; iLoop++)
{
switch (iLoop%3)
{
case 0: { A[iLoop] = new Piano(); break; }
case 1: { A[iLoop] = new Flute(); break; }
case 2: { A[iLoop] = new Gitar(); break; }
}
}
for (int iLoop=0; iLoop<12; iLoop++)
{
System.out.println("------------------------------------");
System.out.println(iLoop+1);
A[iLoop].play();
if (A[iLoop] instanceof Piano) { System.out.println("Piano"); }
if (A[iLoop] instanceof Flute) { System.out.println("Flute"); }
if (A[iLoop] instanceof Gitar) { System.out.println("Guitar"); }
}
}
}