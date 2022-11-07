import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CheckIsAdultTest{

    private final int AGE;
    private final boolean RESULT;

    public CheckIsAdultTest(int age, boolean result){
        this.AGE=age;
        this.RESULT=result;
    }
    @Parameterized.Parameters
    public static Object [][] getTextData(){
        return new Object[][]{
                {19,true},
                {17,false},
                {18,true},
                {21,true}
        };
    }
    @Test
    public void checkIsAdultWhenAgeThenResult(){
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(AGE);
        assertEquals("Ошибка!",RESULT,isAdult);
    }
}
