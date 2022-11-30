package day27exceptions;

// Eğer Exception Class'a extends ederseniz sizin Classınız "Compile Time Exception" olur
public class IllegalGradeException extends Exception {

    public IllegalGradeException(String message){
        super(message);
    }
}
