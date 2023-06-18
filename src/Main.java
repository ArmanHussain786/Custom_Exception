public class Main {
    public static void main(String[] args) {

        try
        {
            func(10);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
    public static void func(int age) throws UnderAgeException
    {
        if(age<18)
        {
            throw new UnderAgeException("Bhai padh le!!");
        }
    }
    public static class UnderAgeException extends Exception
    {
        public UnderAgeException(String message)
        {
            super(message);
        }
    }
}