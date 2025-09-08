
public class FixDebug One
{
/* This program displays a greeting */
public static void Main(String args)
{
Systm.out.println("Hello World!")
}
/*

List down the spotted bugs below:
1. Class name contains a space that should be "FixDebugOne"
2. Method name 'Main' should be lowercase "main"
3. Method argument 'String args' should be 'String[] args'
4. Misspelled 'System' as 'Systm'
5. Missing semicolon after println statement
6. Prefer // for single-line comments instead of /* ... */

The fixed code:
public class FixDebugOne
{
    // This program displays a greeting
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
    }
}
